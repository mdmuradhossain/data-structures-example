# Linked list Data Structure

A linked list is a linear data structure that includes a series of connected nodes. Here, each node stores the data and the address of the next node. For example,

![Linked List](image.jpg)

You have to start somewhere, so we give the address of the first node a special name called `HEAD`. Also, the last node in the linked list can be identified because its next portion points to `NULL`.

## Representation of Linked List

Let's see how each node of the linked list is represented. Each node consists:

- A data item
- An address of another node

We wrap both the data item and the next node reference in a struct as:

`struct node`

`{`

  `int data;`

  `struct node *next;`

`};`

Understanding the structure of a linked list node is the key to having a grasp on it.

Each struct node has a data item and a pointer to another struct node. Let us create a simple Linked List with three items to understand how this works.

`/* Initialize nodes */`

`struct node *head;`

`struct node *one = NULL;`

`struct node *two = NULL;`

`struct node *three = NULL;`

`/* Allocate memory */`

`one = malloc(sizeof(struct node));`

`two = malloc(sizeof(struct node));`

`three = malloc(sizeof(struct node));`

`/* Assign data values */`

`one->data = 1;`

`two->data = 2;`

`three->data=3;`

`/* Connect nodes */`

`one->next = two;`

`two->next = three;`

`three->next = NULL;`

`/* Save address of first node in head */`

`head = one;`

In just a few steps, we have created a simple linked list with three nodes.

![Representation of Linked List](image.jpg)

The power of a linked list comes from the ability to break the chain and rejoin it. E.g. if you wanted to put an element 4 between 1 and 2, the steps would be:

- Create a new struct node and allocate memory to it.
- Add its data value as 4
- Point its next pointer to the struct node containing 2 as the data value
- Change the next pointer of "1" to the node we just created.
Doing something similar in an array would have required shifting the positions of all the subsequent elements.
