#include <stdio.h>
#include <stdlib.h>

// Definition of a node in the linked list
struct Node {
    int data;
    struct Node *next;
};

struct Node *head = NULL, *tail = NULL;

// Function to insert a node at the end of the linked list
void insert(int value) {
    // Create a new node
    struct Node *ptr = (struct Node*)malloc(sizeof(struct Node));
    ptr->data = value;
    ptr->next = NULL; // New node is the last node, so its next is NULL

    if (head == NULL) {
        // If the list is empty, head and tail point to the new node
        head = ptr;
        tail = ptr;
    } else {
        // Otherwise, add the new node at the end and update tail
        tail->next = ptr;
        tail = ptr;
    }
}

// Function to print the linked list
void print() {
    struct Node *current = head;
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

int main() {
    insert(1);
    insert(2);
    insert(3);
    print(); // Output: 1 2 3 
    return 0;
}
