# B+ Tree

A B+ tree is an advanced form of a self-balancing tree in which all the values are present in the leaf level.

An important concept to be understood before learning B+ tree is multilevel indexing. In multilevel indexing, the index of indices is created as in figure below. It makes accessing the data easier and faster.

![Multilevel Indexing using B+ tree](https://cdn.programiz.com/sites/tutorial2program/files/multilevel-indexing.png)

## Properties of a B+ Tree
1. All leaves are at the same level.
2. The root has at least two children.
3. Each node except root can have a maximum of `m` children and at least `m/2` children.
4. Each node can contain a maximum of `m - 1` keys and a minimum of `⌈m/2⌉ - 1` keys.

## Comparison between a B-tree and a B+ Tree

![B-tree](https://cdn.programiz.com/sites/tutorial2program/files/B-tree.png)
![B-tree](https://cdn.programiz.com/sites/tutorial2program/files/B+tree.png)

The data pointers are present only at the leaf nodes on a B+ tree whereas the data pointers are present in the internal, leaf or root nodes on a B-tree.

The leaves are not connected with each other on a B-tree whereas they are connected on a B+ tree.

Operations on a B+ tree are faster than on a B-tree.

Searching on a B+ Tree

The following steps are followed to search for data in a B+ Tree of order m. Let the data to be searched be k.

Start from the root node. Compare k with the keys at the root node [k1, k2, k3,......km - 1].
If k < k1, go to the left child of the root node.
Else if k == k1, compare k2. If k < k2, k lies between k1 and k2. So, search in the left child of k2.
If k > k2, go for k3, k4,...km-1 as in steps 2 and 3.
Repeat the above steps until a leaf node is reached.
If k exists in the leaf node, return true else return false.
Searching Example on a B+ Tree
Let us search k = 45 on the following B+ tree.

B+ tree
B+ tree
Compare k with the root node.
B+ tree search
k is not found at the root
Since k > 25, go to the right child.
B+ tree search
Go to right of the root
Compare k with 35. Since k > 30, compare k with 45.
B+ tree search
k not found
Since k ≥ 45, so go to the right child.
B+ tree search
go to the right
k is found.
B+ tree search
k is found
