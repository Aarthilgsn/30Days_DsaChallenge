//Detect a loop in linked list optimized

#include <stdio.h>
#include <stdlib.h>

// Define the node structure
struct Node {
    int data;
    struct Node* next;
};

// Function to create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Function to detect loop in the linked list using hashing
int detectLoop(struct Node* head) {
    struct Node* slow = head;
    struct Node* fast = head;

    // Traverse the list with two pointers: slow and fast
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;         // Move slow by 1 step
        fast = fast->next->next;   // Move fast by 2 steps

        if (slow == fast) {
            return 1;  // Loop detected
        }
    }
    return 0;  // No loop
}

int main() {
    int n, data, loopPosition;
    struct Node *head = NULL, *temp = NULL, *loopNode = NULL;

    printf("Enter the number of nodes: ");
    scanf("%d", &n);

    printf("Enter the elements:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &data);
        struct Node* newNode = createNode(data);
        if (head == NULL) {
            head = newNode;
            temp = head;
        } else {
            temp->next = newNode;
            temp = newNode;
        }
    }

    // Ask if a loop is to be created
    printf("Enter the position where the loop should start (0 for no loop): ");
    scanf("%d", &loopPosition);

    // If loop is to be created
    if (loopPosition != 0) {
        temp = head;
        for (int i = 1; i < loopPosition; i++) {
            temp = temp->next;
        }
        loopNode = temp;

        // Create a loop by connecting the last node to the loop node
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = loopNode;
    }

    // Detect the loop
    if (detectLoop(head)) {
        printf("Loop detected!\n");
    } else {
        printf("No loop detected.\n");
    }

    return 0;
}

