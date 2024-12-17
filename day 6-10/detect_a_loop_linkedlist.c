// Detect a loop in a linkedlist better

#include <stdio.h>
#include <stdlib.h>

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

// Function to detect loop using hash set (implemented using an array of pointers)
int detectLoop(struct Node* head) {
    struct Node* temp = head;
    struct Node* visited[1000];  // Array to simulate a hash set
    int index = 0;

    // Traverse the linked list
    while (temp != NULL) {
        // Check if the node is already in the visited array (hash set)
        for (int i = 0; i < index; i++) {
            if (visited[i] == temp) {
                return 1;  // Loop detected
            }
        }

        // Add the current node to the visited array
        visited[index] = temp;
        index++;

        // Move to the next node
        temp = temp->next;
    }

    return 0;  // No loop detected
}

// Function to print the list (used for testing)
void printList(struct Node* head) {
    while (head != NULL) {
        printf("%d -> ", head->data);
        head = head->next;
    }
    printf("NULL\n");
}

int main() {
    int n, loopNode;

    // Get number of nodes from the user
    printf("Enter the number of nodes in the linked list: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("Invalid number of nodes.\n");
        return 1;
    }

    // Get values of the nodes from the user
    struct Node* head = NULL;
    struct Node* temp = NULL;
    struct Node* prev = NULL;

    printf("Enter the values for the nodes:\n");
    for (int i = 0; i < n; i++) {
        int data;
        printf("Enter value for node %d: ", i + 1);
        scanf("%d", &data);

        temp = createNode(data);
        if (head == NULL) {
            head = temp;  // First node is the head
        } else {
            prev->next = temp;  // Link the previous node to the current one
        }
        prev = temp;
    }

    // Ask if the user wants to create a loop
    printf("Enter the node number to create a loop (0 to skip): ");
    scanf("%d", &loopNode);

    if (loopNode > 0 && loopNode <= n) {
        // Create the loop
        struct Node* loopNodePtr = head;
        struct Node* lastNode = head;

        // Find the loop start node
        for (int i = 1; i < loopNode; i++) {
            loopNodePtr = loopNodePtr->next;
        }

        // Find the last node
        while (lastNode->next != NULL) {
            lastNode = lastNode->next;
        }

        // Create the loop
        lastNode->next = loopNodePtr;
    }

    // Detect loop
    if (detectLoop(head)) {
        printf("Loop detected\n");
    } else {
        printf("No loop detected\n");
    }

    return 0;
}
