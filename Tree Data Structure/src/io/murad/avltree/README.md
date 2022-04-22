# AVL Tree

AVL tree is a self-balancing binary search tree in which each node maintains extra information called a balance factor whose value is either -1, 0 or +1.

AVL tree got its name after its inventor Georgy Adelson-Velsky and Landis.

## Balance Factor
Balance factor of a node in an AVL tree is the difference between the height of the left subtree and that of the right subtree of that node.

Balance Factor = (Height of Left Subtree - Height of Right Subtree) or (Height of Right Subtree - Height of Left Subtree)

The self balancing property of an avl tree is maintained by the balance factor. The value of balance factor should always be -1, 0 or +1.

An example of a balanced avl tree is:

![Avl tree](https://cdn.programiz.com/sites/tutorial2program/files/avl-tree-final-tree-1_0_2.png)

### Operations on an AVL tree
Various operations that can be performed on an AVL tree are:

### Rotating the subtrees in an AVL Tree
In rotation operation, the positions of the nodes of a subtree are interchanged.

There are two types of rotations:

### Left Rotate
In left-rotation, the arrangement of the nodes on the right is transformed into the arrangements on the left node.

Algorithm

1. Let the initial tree be:
![left-rotate](https://cdn.programiz.com/sites/tutorial2program/files/avl-tree_leftrotate-1.png)

2. If `y` has a left subtree, assign `x` as the parent of the left subtree of `y`.
![Assign x as the parent of the left subtree of y](https://cdn.programiz.com/cdn/farfuture/rOar-QIMS2mHWi2sn4MmQOdRpGZhpPMQa7lZr_lsZfA/mtime:1590638929/sites/tutorial2program/files/avl-tree_leftrotate-2.png)


3. If the parent of `x` is `NULL`, make `y` as the root of the tree.
4. Else if `x` is the left child of `p`, make y as the left child of `p`.
5. Else assign y as the right child of p.

![Change the parent of x to that of y](https://cdn.programiz.com/cdn/farfuture/7aD1qWbw1WyZulO94QcY-hYFfGAaZkLk9RFCvLcLBRM/mtime:1590638934/sites/tutorial2program/files/avl-tree_leftrotate-3.png)

6. Make `y` as the parent of `x`.

![Assign y as the parent of x.](https://cdn.programiz.com/cdn/farfuture/O9aADWiuEklv2f5McEZmst1tlFIWiuXUMhAnFgPd1uA/mtime:1590638939/sites/tutorial2program/files/avl-tree_leftrotate-4.png)

### Right Rotate
In left-rotation, the arrangement of the nodes on the left is transformed into the arrangements on the right node.

1. Let the initial tree be:

![Initial tree](https://cdn.programiz.com/cdn/farfuture/12-orMUBx_3UtNyltuXsoa_L2XHI35EkedbeZAY3pbc/mtime:1590638944/sites/tutorial2program/files/avl-tree_rightrotate-1.png)

2. If `x` has a right subtree, assign y as the parent of the right subtree of `x`.

![Assign y as the parent of the right subtree of x](https://cdn.programiz.com/cdn/farfuture/tUD9xPE1yKsjUD7GrKeHS5-bvbbpPZRj-QUiVLBiAVo/mtime:1590638951/sites/tutorial2program/files/avl-tree_rightrotate-2.png)

3. If the parent of `y` is `NULL`, make `x` as the root of the tree.
3. Else if `y` is the right child of its parent `p`, make `x` as the right child of `p`.
5. Else assign `x` as the left child of `p`.

![Assign the parent of y as the parent of x.](https://cdn.programiz.com/cdn/farfuture/AeeJj9zzvQCCkBVeGi0RQ64uHDlGlRTCRJhVRYTJHgc/mtime:1590638957/sites/tutorial2program/files/avl-tree_rightrotate-3.png)

6. Make `x` as the parent of `y`.

![Assign x as the parent of y](https://cdn.programiz.com/cdn/farfuture/yr1WZ-vC3rZklwZ-zs9Ox0gKOrvniclffrU9zd96coE/mtime:1590638963/sites/tutorial2program/files/avl-tree_rightrotate-4.png)

### Left-Right and Right-Left Rotate
In left-right rotation, the arrangements are first shifted to the left and then to the right.

1. Do left rotation on x-y.

![Left rotate x-y](https://cdn.programiz.com/cdn/farfuture/-azcNvOPWv7wEnEzT3h227dYtZBlAL8CXtHdwXenr1c/mtime:1590639276/sites/tutorial2program/files/avl-tree-leftright-rotate-1.png)

2. Do right rotation on y-z.

![Right rotate z-y](https://cdn.programiz.com/cdn/farfuture/gZrKUeMiHusFL-lb6gAaMCfK_edFDj64Qi3MwlYJ_jw/mtime:1590639281/sites/tutorial2program/files/avl-tree-leftright-rotate-2.png)

In right-left rotation, the arrangements are first shifted to the right and then to the left.

1. Do right rotation on x-y.

![Right rotate x-y](https://cdn.programiz.com/cdn/farfuture/flq1MTO6SBcWdXIUda_BY4yhf9BLPRf7MT4Ip79vYF4/mtime:1590639294/sites/tutorial2program/files/avl-tree-rightleft-rotate-1.png)

2. Do left rotation on z-y.

![Left rotate z-y](https://cdn.programiz.com/cdn/farfuture/MHtUIZ6EqUmgcC3exARGsdRiOFmENzCH-i_solZWi1g/mtime:1590639315/sites/tutorial2program/files/avl-tree-rightleft-rotate-2.png)

### Algorithm to insert a newNode
A `newNode` is always inserted as a leaf node with balance factor equal to 0.

1. Let the initial tree be:

![Initial tree for insertion](https://cdn.programiz.com/cdn/farfuture/os7LYnnoAF-L43b72SHX8d5A5wswB3kmrItfdEEZ_l4/mtime:1590641583/sites/tutorial2program/files/avl-tree_initial-tree.png)

Let the node to be inserted be:

![New node](https://cdn.programiz.com/cdn/farfuture/83QnjS5n5s5lirRaNDaz-j7Z4wuSMyzCy5JqTtnS_DY/mtime:1590641675/sites/tutorial2program/files/avl-tree_newnode.png)

2. Go to the appropriate leaf node to insert a `newNode` using the following recursive steps. Compare `newKey` with `rootKey` of the current tree.

  a. If `newKey` < `rootKey`, call insertion algorithm on the left subtree of the current node until the leaf node is reached.
  
  b. Else if `newKey` > `rootKey`, call insertion algorithm on the right subtree of current node until the leaf node is reached.
  
  c. Else, return `leafNode`.
![Finding the location to insert newNode](https://cdn.programiz.com/cdn/farfuture/FpHam25V20lbxh3NAwAnSAla2NbWOj9rPI6bFDrPUbo/mtime:1590641542/sites/tutorial2program/files/avl-tree_find-position.png)


3. Compare `leafKey` obtained from the above steps with `newKey`:

  a. If `newKey` < `leafKey`, make newNode as the `leftChild` of `leafNode`.
  
  b. Else, make `newNode` as rightChild of `leafNode`.

![Inserting the new node](https://cdn.programiz.com/cdn/farfuture/cqWklRHIE-bR-CK0vOfdr5ml6hXURz-5YhLxpQT8bIM/mtime:1590641621/sites/tutorial2program/files/avl-tree_insert.png)

4. Update `balanceFactor` of the nodes.


![Updating the balance factor after insertion](https://cdn.programiz.com/cdn/farfuture/6duidjDetnH-DT3WdMw29n1wgG76GIJ_yIevbCSdsrY/mtime:1590641705/sites/tutorial2program/files/avl-tree_update-bf.png)

5. If the nodes are unbalanced, then rebalance the node.

a. If `balanceFactor` > 1, it means the height of the left subtree is greater than that of the right subtree. So, do a right rotation or left-right rotation
i. If newNodeKey < leftChildKey do right rotation.
ii. Else, do left-right rotation.

![Balancing the tree with rotation](https://cdn.programiz.com/cdn/farfuture/D4lZ8JHjdLg4aJxD6qmgAn7ZL83fPE5B3fIGbuLZB-E/mtime:1590641396/sites/tutorial2program/files/avl-tree_balance1.png)

![Balancing the tree with rotation](https://cdn.programiz.com/cdn/farfuture/_DTFoJhzbxIBEo6xGqFvLawAyJhzCY2UwRzfH68hcGE/mtime:1590641444/sites/tutorial2program/files/avl-tree_balnce2.png)

b. If `balanceFactor` < -1, it means the height of the right subtree is greater than that of the left subtree. So, do right rotation or right-left rotation
i. If `newNodeKey` > `rightChildKey` do left rotation.
ii. Else, do right-left rotation

6. The final tree is:

![Final balanced tree](https://cdn.programiz.com/cdn/farfuture/tcEU8kqtoLVPZaZPsKGMyctiKuRsDRfcJq0NRUHHorE/mtime:1590641505/sites/tutorial2program/files/avl-tree_final-tree.png)

### Algorithm to Delete a node
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