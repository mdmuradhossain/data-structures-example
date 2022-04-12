# Singly Linked List
A singly linked list is a type of linked list that is unidirectional, that is, it can be traversed in only one direction from head to the last node (tail).

Each element in a linked list is called a node. A single node contains data and a pointer to the next node which helps in maintaining the structure of the list.

The first node is called the head; it points to the first node of the list and helps us access every other element in the list. The last node, also sometimes called the tail, points to NULL which helps us in determining when the list ends.The first node is called the head; it points to the first node of the list and helps us access every other element in the list. The last node, also sometimes called the tail, points to NULL which helps us in determining when the list ends.The first node is called the head; it points to the first node of the list and helps us access every other element in the list. The last node, also sometimes called the tail, points to NULL which helps us in determining when the list ends.

## Search for a node in the List

You can determine and retrieve a specific node either from the front, the end, or anywhere in the list.

The worst case Time Complexity for retrieving a node from anywhere in the list is `O(n)`.

### Add a node to the List

You can add a node at the front, the end or anywhere in the linked list.

The worst case Time Complexity for performing these operations is as follows:

Add item to the front of the list: `O(1)`
Add item to the end of the list: `O(n)`
Add item to anywhere in the list: `O(n)`


### Remove a node from the list

You can remove a node either from the front, the end or from anywhere in the list.

The worst case *Time Complexity* for performing this operation is as follows:

Remove item from the front of the list: `O(1)`
Remove item from the end of the list: `O(n)`
Remove item from anywhere in the list: `O(n)`