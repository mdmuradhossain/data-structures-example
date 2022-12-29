# Red-Black Tree

Red-Black tree is a self-balancing binary search tree in which each node contains an extra bit for denoting the color of the node, either red or black.

A red-black tree satisfies the following properties:

1. **Red/Black Property:** Every node is colored, either red or black.
2. **Root Property:** The root is black.
3. **Leaf Property:** Every leaf (NIL) is black.
4. **Red Property:** If a red node has children then, the children are always black.
5. **Depth Property:** For each node, any simple path from this node to any of its descendant leaf has the same black-depth (the number of black nodes).

An example of a red-black tree is:

![Red Black Tree](https://cdn.programiz.com/sites/tutorial2program/files/red-black-tree_0.png)

Each node has the following attributes:

- color
- key
- leftChild
- rightChild
- parent (except root node)

**How the red-black tree maintains the property of self-balancing?**

The red-black color is meant for balancing the tree.

The limitations put on the node colors ensure that any simple path from the root to a leaf is not more than twice as long as any other such path. It helps in maintaining the self-balancing property of the red-black tree.

## Operations on a Red-Black Tree

Various operations that can be performed on a red-black tree are:

**Rotating the subtrees in a Red-Black Tree**
In rotation operation, the positions of the nodes of a subtree are interchanged.

Rotation operation is used for maintaining the properties of a red-black tree when they are violated by other operations such as insertion and deletion.

There are two types of rotations:

### Left Rotate

In left-rotation, the arrangement of the nodes on the right is transformed into the arrangements on the left node.

**Algorithm**

1. Let the initial tree be:
   ![Initial tree](https://cdn.programiz.com/sites/tutorial2program/files/leftrotate-1_0.png)
2. If `y` has a left subtree, assign `x` as the parent of the left subtree of `y`.
   ![Assign x as the parent of the left subtree of y](https://cdn.programiz.com/sites/tutorial2program/files/leftrotate-2_0.png)
3. If the parent of `x` is `NULL`, make `y` as the root of the tree.
4. Else if `x` is the left child of `p`, make `y` as the left child of `p`.
5. Else assign `y` as the right child of `p`.
   ![Change the parent of x to that of y](https://cdn.programiz.com/sites/tutorial2program/files/leftrotate-3_0.png)
6. Make `y` as the parent of `x`.
   ![Assign y as the parent of x.](https://cdn.programiz.com/sites/tutorial2program/files/leftrotate-4_0.png)

Right Rotate
In right-rotation, the arrangement of the nodes on the left is transformed into the arrangements on the right node.

Let the initial tree be:
right-rotate
Initial Tree
If x has a right subtree, assign y as the parent of the right subtree of x.
right-rotate
Assign y as the parent of the right subtree of x
If the parent of y is NULL, make x as the root of the tree.
Else if y is the right child of its parent p, make x as the right child of p.
Else assign x as the left child of p.
right-rotate
Assign the parent of y as the parent of x
Make x as the parent of y.
right-rotate
Assign x as the parent of y
Left-Right and Right-Left Rotate
In left-right rotation, the arrangements are first shifted to the left and then to the right.

Do left rotation on x-y.
left-right rotate
Left rotate x-y
Do right rotation on y-z.
left-right rotate
Right rotate z-y

In right-left rotation, the arrangements are first shifted to the right and then to the left.

Do right rotation on x-y.
right-left rotate
Right rotate x-y
Do left rotation on z-y.
right-left rotate
Left rotate z-y
Inserting an element into a Red-Black Tree
While inserting a new node, the new node is always inserted as a RED node. After insertion of a new node, if the tree is violating the properties of the red-black tree then, we do the following operations.

Recolor
Rotation
Algorithm to insert a node
Following steps are followed for inserting a new element into a red-black tree:

Let y be the leaf (ie. NIL) and x be the root of the tree.
Check if the tree is empty (ie. whether x is NIL). If yes, insert newNode as a root node and color it black.
Else, repeat steps following steps until leaf (NIL) is reached.
Compare newKey with rootKey.
If newKey is greater than rootKey, traverse through the right subtree.
Else traverse through the left subtree.
Assign the parent of the leaf as a parent of newNode.
If leafKey is greater than newKey, make newNode as rightChild.
Else, make newNode as leftChild.
Assign NULL to the left and rightChild of newNode.
Assign RED color to newNode.
Call InsertFix-algorithm to maintain the property of red-black tree if violated.
Why newly inserted nodes are always red in a red-black tree?

This is because inserting a red node does not violate the depth property of a red-black tree.

If you attach a red node to a red node, then the rule is violated but it is easier to fix this problem than the problem introduced by violating the depth property.

Algorithm to maintain red-black property after insertion
This algorithm is used for maintaining the property of a red-black tree if the insertion of a newNode violates this property.

Do the following while the parent of newNode p is RED.
If p is the left child of grandParent gP of z, do the following.
Case-I:
If the color of the right child of gP of z is RED, set the color of both the children of gP as BLACK and the color of gP as RED.
Assign gP to newNode.
Case-II:
Else if newNode is the right child of p then, assign p to newNode.
Left-Rotate newNode.
Case-III:
Set color of p as BLACK and color of gP as RED.
Right-Rotate gP.
Else, do the following.
If the color of the left child of gP of z is RED, set the color of both the children of gP as BLACK and the color of gP as RED.
Assign gP to newNode.
Else if newNode is the left child of p then, assign p to newNode and Right-Rotate newNode.
Set color of p as BLACK and color of gP as RED.
Left-Rotate gP.
Set the root of the tree as BLACK.
Deleting an element from a Red-Black Tree
This operation removes a node from the tree. After deleting a node, the red-black property is maintained again.

Algorithm to delete a node
Save the color of nodeToBeDeleted in origrinalColor.
If the left child of nodeToBeDeleted is NULL
Assign the right child of nodeToBeDeleted to x.
Transplant nodeToBeDeleted with x.
Else if the right child of nodeToBeDeleted is NULL
Assign the left child of nodeToBeDeleted into x.
Transplant nodeToBeDeleted with x.
Else
Assign the minimum of right subtree of noteToBeDeleted into y.
Save the color of y in originalColor.
Assign the rightChild of y into x.
If y is a child of nodeToBeDeleted, then set the parent of x as y.
Else, transplant y with rightChild of y.
Transplant nodeToBeDeleted with y.
Set the color of y with originalColor.
If the originalColor is BLACK, call DeleteFix(x).
Algorithm to maintain Red-Black property after deletion
This algorithm is implemented when a black node is deleted because it violates the black depth property of the red-black tree.

This violation is corrected by assuming that node x (which is occupying y's original position) has an extra black. This makes node x neither red nor black. It is either doubly black or black-and-red. This violates the red-black properties.

However, the color attribute of x is not changed rather the extra black is represented in x's pointing to the node.

The extra black can be removed if

It reaches the root node.
If x points to a red-black node. In this case, x is colored black.
Suitable rotations and recoloring are performed.
The following algorithm retains the properties of a red-black tree.

Do the following until the x is not the root of the tree and the color of x is BLACK
If x is the left child of its parent then,
Assign w to the sibling of x.
If the right child of parent of x is RED,
Case-I:
Set the color of the right child of the parent of x as BLACK.
Set the color of the parent of x as RED.
Left-Rotate the parent of x.
Assign the rightChild of the parent of x to w.
If the color of both the right and the leftChild of w is BLACK,
Case-II:
Set the color of w as RED
Assign the parent of x to x.
Else if the color of the rightChild of w is BLACK
Case-III:
Set the color of the leftChild of w as BLACK
Set the color of w as RED
Right-Rotate w.
Assign the rightChild of the parent of x to w.
If any of the above cases do not occur, then do the following.
Case-IV:
Set the color of w as the color of the parent of x.
Set the color of the parent of x as BLACK.
Set the color of the right child of w as BLACK.
Left-Rotate the parent of x.
Set x as the root of the tree.
Else the same as above with right changed to left and vice versa.
Set the color of x as BLACK.

## Red-Black Tree Applications

- To implement finite maps
- To implement Java packages: java.util.TreeMap and java.util.TreeSet
- To implement Standard Template Libraries (STL) in C++: multiset, map, multimap
- In Linux Kernel
