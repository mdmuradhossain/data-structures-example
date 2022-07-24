# Doubly Linked List

A doubly linked list is a type of linked list in which each node consists of 3 components:

- \*prev - address of the previous node
- data - data item
- \*next - address of next node
  ![A doubly linked list node](https://cdn.programiz.com/cdn/farfuture/nNhJNDR7OYb-5wiTX-x2gNaPHBy9YWCXJ_ohHDrQn6s/mtime:1620967408/sites/tutorial2program/files/dll-node.png)

Note: Before you proceed further, make sure to learn about pointers and structs.

## Representation of Doubly Linked List

Let's see how we can represent a doubly linked list on an algorithm/code. Suppose we have a doubly linked list:

![Newly created doubly linked list](https://cdn.programiz.com/cdn/farfuture/mljtoHadEO77LO97a_D4AP54FZNVSrSSZ32UVNV53Yg/mtime:1620967584/sites/tutorial2program/files/doubly-linked-list-created.png)

Here, the single node is represented as

`struct node {`

    `int data;`

    `struct node *next;`

    `struct node *prev;`

`}`
Each struct node has a data item, a pointer to the previous struct node, and a pointer to the next struct node.

Now we will create a simple doubly linked list with three items to understand how this works.

/_ Initialize nodes _/

`struct node *head;`

`struct node *one = NULL;`

`struct node *two = NULL;`

`struct node *three = NULL;`

/_ Allocate memory _/

`one = malloc(sizeof(struct node));`
`two = malloc(sizeof(struct node));`
`three = malloc(sizeof(struct node));`

/_ Assign data values _/

`one->data = 1;`
`two->data = 2;`
`three->data = 3;`

/_ Connect nodes _/

`one->next = two;`
`one->prev = NULL;`

`two->next = three;`
`two->prev = one;`

`three->next = NULL;`
`three->prev = two;`

/_ Save address of first node in head _/

`head = one;`

In the above code, `one`, `two`, and `three` are the nodes with data items 1, 2, and 3 respectively.

- For node one: `next` stores the address of two and `prev` stores `null` (there is no node before it)
- For node two: `next` stores the address of three and `prev` stores the address of one
- For node three: `next` stores `null` (there is no node after it) and `prev` stores the address of two.

**Note**: In the case of the head node, `prev` points to `null`, and in the case of the tail pointer, `next` points to null. Here, `one` is a head node and `three` is a tail node.

### Insertion on a Doubly Linked List

Pushing a node to a doubly-linked list is similar to pushing a node to a linked list, but extra work is required to handle the pointer to the previous node.

We can insert elements at 3 different positions of a doubly-linked list:

1. Insertion at the beginning
2. Insertion in-between nodes
3. Insertion at the End

Suppose we have a double-linked list with elements 1, 2, and 3.

![Original doubly linked list](https://cdn.programiz.com/cdn/farfuture/mljtoHadEO77LO97a_D4AP54FZNVSrSSZ32UVNV53Yg/mtime:1620967584/sites/tutorial2program/files/doubly-linked-list-created.png)

### Insertion at the Beginning

Let's add a node with value 6 at the beginning of the doubly linked list we made above.

1. Create a new node

- allocate memory for `newNode`
- assign the data to `newNode`.
  ![new node](https://cdn.programiz.com/cdn/farfuture/wR4M4kRgTvM1RCCs-4sR1x4q8MUaVmyyxa9EFnO1V_o/mtime:1620967578/sites/tutorial2program/files/dll-insertion-front-1.png)

2. Set prev and next pointers of new node

- point `next` of `newNode` to the first node of the doubly linked list
- point `prev` to `null`

![Reorganize the pointers (changes are denoted by purple arrows)](https://cdn.programiz.com/cdn/farfuture/E8zbZEaDWaV-3Akm_tl0QhAKzlYpIcURdVlJA6oj3vs/mtime:1620967560/sites/tutorial2program/files/dll-insertion-front-2.png)

3. Make new node as head node

- Point `prev` of the first node to `newNode` (now the previous head is the second node)
- Point `head` to `newNode`

![Reorganize the pointers](https://cdn.programiz.com/cdn/farfuture/y-p0xg3m80os9p6M5kv3UUB8DHk8nJnWXCVruBDpuQM/mtime:1620967507/sites/tutorial2program/files/dll-insertion-front-3.png)

### 2. Insertion in between two nodes

Let's add a node with value 6 after node with value 1 in the doubly linked list.

1. Create a new node

- allocate memory for newNode
- assign the data to newNode.
  ![New Node](https://cdn.programiz.com/cdn/farfuture/wR4M4kRgTvM1RCCs-4sR1x4q8MUaVmyyxa9EFnO1V_o/mtime:1620967578/sites/tutorial2program/files/dll-insertion-front-1.png)

2. Set the next pointer of new node and previous node

- assign the value of next from previous node to the next of newNode
- assign the address of newNode to the next of previous node

![Reorganize the pointers](https://cdn.programiz.com/cdn/farfuture/YWI6eSc9p8NYDhzKJN5VebogYxNQ1hGXuJ6c6sfZyHk/mtime:1620901041/sites/tutorial2program/files/dll-insertion-after-2_1.png)

3. Set the `prev` pointer of new node and the next node

- assign the value of `prev` of next node to the `prev` of newNode
- assign the address of `newNode` to the `prev` of next node

![Reorganize the pointers](https://cdn.programiz.com/cdn/farfuture/BHaWiHHHx2R5PcoUS9rpdsNZxredQujKCBYfu-t8hLg/mtime:1620901034/sites/tutorial2program/files/dll-insertion-after-3_1.png)

The final doubly linked list is after this insertion is:

![Final list](https://cdn.programiz.com/cdn/farfuture/cfn-1qOb_5Zn84gosDiRnALeq8gaOSvRy1YsuoGVNPg/mtime:1620967526/sites/tutorial2program/files/dll-insertion-after-4.png)

### 3. Insertion at the End

Let's add a node with value 6 at the end of the doubly linked list.

1. Create a new node

New node
New node 2. Set `prev` and next pointers of new node and the previous node

If the linked list is empty, make the newNode as the head node. Otherwise, traverse to the end of the doubly linked list and

Reorganize the pointers
Reorganize the pointers
The final doubly linked list looks like this.

The final list

## Doubly Linked List Representation

A doubly linked list is made of a sequence of nodes. Each node contains a value (data), a pointer to the next node, and a pointer to the previous node in the sequence.

![](https://prod-acb5.kxcdn.com/wp-content/uploads/2021/05/word-image-1024x326.png.webp)

As per the above illustration, the following are the important points to be considered.

- The Head node points to the first node of the list.
- Each node has a data field, a pointer to previous node and a pointer to the next node.
- The last node�s next pointer points to `NULL`.
- The first node�s previous pointer points to `NULL`.

### Basic Operations

We will go through the major operations of a linked list, and they are insertion, deletion, display, search, and size.

### 1. Insertion

In a doubly linked list, we can insert a node in three different ways.

1. Insert the new node as the first node:

I will add the new node before the first node of the doubly linked list and its next will point to previous first node. The previous will point to null. The head will now point to the newly added node. As you can see below, we had a linked list `1<->2<->3` with the head pointing to 1 and we added a new node 0 and the linked list becomes `0<->1<->2<->3` with the head pointing to node 0 now.

![Insertion at beginning](https://prod-acb5.kxcdn.com/wp-content/uploads/2021/05/word-image-1.png.webp)

At a given index:

If we wish to insert a node at any index, we will first check if the index is less than the size of the list, we will then first traverse till the index. Next, we will do four things:

1. The new node�s next will point to the current node.
2. The current node�s previous�s next will point to the new node.
3. The new node�s previous will point to current�s previous.
4. The current node�s previous will point to the new node.

As you can see below, we had a linked list `1<->3<->4` and we want to insert node 2 at index 1, so we will change the pointers as per the above steps and the linked list will become `1<->2<->3<->4`.

![Insert at given index](https://prod-acb5.kxcdn.com/wp-content/uploads/2021/05/word-image-3-1024x537.png.webp)

At the end of the linked list:

When we want to insert a node at the end of a doubly linked list, we will traverse the doubly linked list till the current�s next points to NULL. At this stage we will do the following 3 things:

1. The current last node�s next will point to the new node.
2. The new node�s previous will point to the current node.
3. The new node�s next will point to NULL now.

As you can see below, we had a linked list 1<->2<->3<->NULL and we want to insert node 4 at last, so we will change the pointers as per the above steps and the linked list will become `1<->2<->3<->4<->NULL`.
![Insert at last](https://prod-acb5.kxcdn.com/wp-content/uploads/2021/05/word-image-5-1024x466.png.webp)

### Deletion:

Like insertion, we can delete a node from a doubly linked list in 3 ways. To delete a node from the doubly linked list, we need to do the following steps.

Delete the first node:

To delete the first node from the doubly linked list, point the head to the current first nodes next. You can see the illustration in the following diagram.

![delete first](https://prod-acb5.kxcdn.com/wp-content/uploads/2021/05/word-image-7-1024x488.png.webp)

Delete at an index:

To delete an element at the index from the doubly linked list, we first check if the index is less than the size of the list. We then traverse till the index (using the current.next != null and by keeping track of current and previous node) and change the previous node�s next to the current node�s next. Also, current node�s next�s previous has to point to previous node.You can see the illustration in the following diagram.

![](https://prod-acb5.kxcdn.com/wp-content/uploads/2021/05/word-image-9-1024x521.png.webp)

Delete the last element:

To delete the last element from the doubly linked list, traverse till the second last element (using `current.next != null` and keeping track of the previous node) and change the previous node�s next to null.You can see the illustration in the following diagram.

![delete at last](https://prod-acb5.kxcdn.com/wp-content/uploads/2021/05/word-image-11-1024x517.png.webp)

### Display

To display the nodes of the doubly linked list, we will need to start from the head and print the node�s data. We will continue doing this until the current node�s next is not equal to null, and that means the end of the list.You can see the code for this below.

### Search

To search for a node of the linked list, we will need to start from the head and check if the current node�s data is equal to the data, or else we will move to the next node in the list. We will continue to go to the next node until the current node�s next is not equal to null and in that case, the data is not present in our linked list, or better, we don�t have a node that has the data. You can see the code for this below.

### Display Again

To calculate the size of a doubly linked list, we will set a counter at 0 and keep incrementing by 1 once we visit a node. We will start with the head and continue to go to the next node until the current node�s next is not equal to NULL. As said, we will increment the counter for each node we traverse. At the end, we will have the size of the list in the counter variable. You can see the code for this below. In our example, we are updating the size variable at every insert and delete, so we can directly use that variable.

### 1. Advantages over a singly linked list

- Major advantage of a doubly linked list is that we can traverse it in both directions.
- Adding a new node is just about changing the pointers.
- Deleting a node is also easy as we need not traverse the entire list to find the previous node as with the singly linked list.

### 2. Disadvantages over a singly linked list

- Typical disadvantage is that a doubly linked list node requires extra space for storing the previous pointer.
- Insertion or deletion operations require an extra pointer (previous) to be maintained. We need to maintain both the next and previous pointer while inserting a new node.

## Doubly Linked List Complexity

| Doubly Linked List Complexity | Time Complexity | Space Complexity |
| ----------------------------- | --------------- | ---------------- |
| Insertion Operation           | O(1) or O(n)    | O(1)             |
| Deletion Operation            | O(1)            | O(1)             |

**1. Complexity of Insertion Operation**

- The insertion operations that do not require traversal have the time complexity of O(1).
- And, insertion that requires traversal has time complexity of O(n).
- The space complexity is O(1). 2. Complexity of Deletion Operation

**2. Complexity of Deletion Operation**

- All deletion operations run with time complexity of O(1).
- And, the space complexity is O(1).

## Doubly Linked List Applications

- Redo and undo functionality in software.
- Forward and backward navigation in browsers.
- For navigation systems where forward and backward navigation is required.

## Singly Linked List Vs Doubly Linked List

| Singly Linked List                                                 | Doubly Linked List                                                                                  |
| ------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------- |
| Each node consists of a data value and a pointer to the next node. | Each node consists of a data value, a pointer to the next node, and a pointer to the previous node. |

|Traversal can occur in one way only (forward direction). | Traversal can occur in both ways.|
| It requires less space. | It requires more space because of an extra pointer.|
| It can be implemented on the stack. | It has multiple usages. It can be implemented on the stack, heap, and binary tree.|
