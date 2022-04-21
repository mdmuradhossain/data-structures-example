# AVL Tree

AVL tree is a self-balancing binary search tree in which each node maintains extra information called a balance factor whose value is either -1, 0 or +1.

AVL tree got its name after its inventor Georgy Adelson-Velsky and Landis.

Balance Factor
Balance factor of a node in an AVL tree is the difference between the height of the left subtree and that of the right subtree of that node.

Balance Factor = (Height of Left Subtree - Height of Right Subtree) or (Height of Right Subtree - Height of Left Subtree)

The self balancing property of an avl tree is maintained by the balance factor. The value of balance factor should always be -1, 0 or +1.

An example of a balanced avl tree is:

avl tree
Avl tree
Operations on an AVL tree
Various operations that can be performed on an AVL tree are:

Rotating the subtrees in an AVL Tree
In rotation operation, the positions of the nodes of a subtree are interchanged.

There are two types of rotations:

Left Rotate
In left-rotation, the arrangement of the nodes on the right is transformed into the arrangements on the left node.

Algorithm

Let the initial tree be:
left-rotate
Left rotate
If y has a left subtree, assign x as the parent of the left subtree of y.
left-rotate
Assign x as the parent of the left subtree of y
If the parent of x is NULL, make y as the root of the tree.
Else if x is the left child of p, make y as the left child of p.
Else assign y as the right child of p.
left-rotate
Change the parent of x to that of y
Make y as the parent of x.
left-rotate
Assign y as the parent of x.
Right Rotate
In left-rotation, the arrangement of the nodes on the left is transformed into the arrangements on the right node.

Let the initial tree be:
right-rotate
Initial tree
If x has a right subtree, assign y as the parent of the right subtree of x.
right-rotate
Assign y as the parent of the right subtree of x
If the parent of y is NULL, make x as the root of the tree.
Else if y is the right child of its parent p, make x as the right child of p.
Else assign x as the left child of p.
right-rotate
Assign the parent of y as the parent of x.
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
Algorithm to insert a newNode
A newNode is always inserted as a leaf node with balance factor equal to 0.

Let the initial tree be:
initial tree
Initial tree for insertion

Let the node to be inserted be:
new node
New node
Go to the appropriate leaf node to insert a newNode using the following recursive steps. Compare newKey with rootKey of the current tree.
If newKey < rootKey, call insertion algorithm on the left subtree of the current node until the leaf node is reached.
Else if newKey > rootKey, call insertion algorithm on the right subtree of current node until the leaf node is reached.
Else, return leafNode.
avl tree insertion
Finding the location to insert newNode
Compare leafKey obtained from the above steps with newKey:
If newKey < leafKey, make newNode as the leftChild of leafNode.
Else, make newNode as rightChild of leafNode.
avl tree insertion
Inserting the new node
Update balanceFactor of the nodes.
avl tree insertion
Updating the balance factor after insertion
If the nodes are unbalanced, then rebalance the node.
If balanceFactor > 1, it means the height of the left subtree is greater than that of the right subtree. So, do a right rotation or left-right rotation
If newNodeKey < leftChildKey do right rotation.
Else, do left-right rotation.
insertion in avl tree
Balancing the tree with rotation
insertion in avl tree
Balancing the tree with rotation
If balanceFactor < -1, it means the height of the right subtree is greater than that of the left subtree. So, do right rotation or right-left rotation
If newNodeKey > rightChildKey do left rotation.
Else, do right-left rotation
The final tree is:
left-right insertion
Final balanced tree
Algorithm to Delete a node
A node is always deleted as a leaf node. After deleting a node, the balance factors of the nodes get changed. In order to rebalance the balance factor, suitable rotations are performed.

Locate nodeToBeDeleted (recursion is used to find nodeToBeDeleted in the code used below).
node to be deleted
Locating the node to be deleted
There are three cases for deleting a node:
If nodeToBeDeleted is the leaf node (ie. does not have any child), then remove nodeToBeDeleted.
If nodeToBeDeleted has one child, then substitute the contents of nodeToBeDeleted with that of the child. Remove the child.
If nodeToBeDeleted has two children, find the inorder successor w of nodeToBeDeleted (ie. node with a minimum value of key in the right subtree).
finding the successor
Finding the successor
Substitute the contents of nodeToBeDeleted with that of w.
substitute the node to be deleted
Substitute the node to be deleted
Remove the leaf node w.
remove w
Remove w
Update balanceFactor of the nodes.
update bf
Update bf
Rebalance the tree if the balance factor of any of the nodes is not equal to -1, 0 or 1.
If balanceFactor of currentNode > 1,
If balanceFactor of leftChild >= 0, do right rotation.
right-rotate
Right-rotate for balancing the tree
Else do left-right rotation.
If balanceFactor of currentNode < -1,
If balanceFactor of rightChild <= 0, do left rotation.
Else do right-left rotation.
The final tree is:
avl tree
Avl tree final