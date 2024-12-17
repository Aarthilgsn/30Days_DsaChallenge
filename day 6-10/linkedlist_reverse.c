// code to reverse the linked list

#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

// Function to reverse the linked list with O(1) space
struct Node* reverseList(struct Node* head) {
    struct Node *curr = head, *prev = NULL, *next = NULL;

    while (curr != NULL) {
        next = curr->next;    // Store next node
        curr->next = prev;    // Reverse current node's pointer
        prev = curr;          // Move prev forward
        curr = next;          // Move curr forward
    }
    return prev; // New head of the reversed list
}

// Function to print the linked list
void printList(struct Node* node) {
    while (node != NULL) {
        printf("%d ", node->data);
        node = node->next;
    }
}

// Function to create a linked list without extra space (user input)
struct Node* createLinkedList(int n) {
    struct Node *head = NULL, *temp = NULL;
    int data;

    printf("Enter %d elements for the linked list:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &data);

        // Dynamically create new node
        struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
        new_node->data = data;
        new_node->next = NULL;

        if (head == NULL) {
            head = new_node; // First node is the head
        } else {
            temp->next = new_node; // Link new node to the list
        }
        temp = new_node; // Update temp to point to the new node
    }
    return head; // Return the head of the list
}

int main() {
    int n;

    printf("Enter the number of elements in the linked list: ");
    scanf("%d", &n);

    struct Node* head = createLinkedList(n);

    printf("Original Linked List: ");
    printList(head);

    head = reverseList(head);

    printf("\nReversed Linked List: ");
    printList(head);

    return 0;
}
