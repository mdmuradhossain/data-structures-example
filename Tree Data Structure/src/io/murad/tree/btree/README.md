# B-tree

B-tree is a special type of self-balancing search tree in which each node can contain more than one key and can have more than two children. It is a generalized form of the binary search tree.

It is also known as a height-balanced m-way tree.

B-tree example:

![B-tree](https://cdn.programiz.com/sites/tutorial2program/files/b-tree.png)

## Why do you need a B-tree data structure?

The need for B-tree arose with the rise in the need for lesser time in accessing the physical storage media like a hard disk. The secondary storage devices are slower with a larger capacity. There was a need for such types of data structures that minimize the disk accesses.

Other data structures such as a binary search tree, avl tree, red-black tree, etc can store only one key in one node. If you have to store a large number of keys, then the height of such trees becomes very large and the access time increases.

However, B-tree can store many keys in a single node and can have multiple child nodes. This decreases the height significantly allowing faster disk accesses.

## B-tree Properties

1. For each node `x`, the keys are stored in increasing order.
2. In each node, there is a boolean value `x.leaf` which is true if `x` is a leaf.
3. If `n` is the order of the tree, each internal node can contain at most `n - 1` keys along with a pointer to each child.

4. Each node except root can have at most `n` children and at least `n/2` children.

5. All leaves have the same depth (i.e. height-h of the tree).

6. The root has at least 2 children and contains a minimum of 1 key.

7. If `n ≥ 1`, then for any n-key B-tree of height `h` and minimum degree `t ≥ 2`, `h ≥ logt (n+1)/2`.

## Operations on a B-tree

### Searching an element in a B-tree

Searching for an element in a B-tree is the generalized form of searching an element in a Binary Search Tree. The following steps are followed.

1. Starting from the root node, compare k with the first key of the node.
   If `k = the first key of the node`, return the node and the index.
2. If `k.leaf = true`, return `NULL` (i.e. not found).
3. If `k < the first key of the root node`, search the left child of this key recursively.

4. If there is more than one key in the current node and `k > the first key`, compare k with the next key in the node.
   If `k < next key`, search the left child of this key (ie. k lies in between the first and the second keys).
   Else, search the right child of the key.
5. Repeat steps 1 to 4 until the leaf is reached.

## Searching Example

1. Let us search key `k = 17` in the tree below of degree 3.
   ![B-tree](https://cdn.programiz.com/sites/tutorial2program/files/search-1.png)
2. `k` is not found in the root so, compare it with the root key.
   ![k is not found on the root node](https://cdn.programiz.com/sites/tutorial2program/files/search-2.png)
3. Since `k > 11`, go to the right child of the root node.
   ![Go to the right subtree](https://cdn.programiz.com/sites/tutorial2program/files/search-3.png)
4. Compare k with 16. Since `k > 16`, compare k with the next key 18.
   ![Compare with the keys from left to right](https://cdn.programiz.com/sites/tutorial2program/files/search-4.png)
5. Since `k < 18`, k lies between 16 and 18. Search in the right child of 16 or the left child of 18.
   ![k lies in between 16 and 18](https://cdn.programiz.com/sites/tutorial2program/files/search-5.png)
6. k is found.
   ![k is found](https://cdn.programiz.com/sites/tutorial2program/files/search-6.png)

## Searching Complexity on B Tree

### Worst case Time complexity: Θ(log n)

### Average case Time complexity: Θ(log n)

### Best case Time complexity: Θ(log n)

### Average case Space complexity: Θ(n)

### Worst case Space complexity: Θ(n)

## B Tree Applications

- databases and file systems
- to store blocks of data (secondary storage media)
- multilevel indexing
