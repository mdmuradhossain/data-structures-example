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

## Searching on a B+ Tree

The following steps are followed to search for data in a B+ Tree of order `m`. Let the data to be searched be `k`.

1. Start from the root node. Compare k with the keys at the root node `[k1, k2, k3,......km - 1]`.
2. If `k < k1`, go to the left child of the root node.
3. Else if `k == k1`, compare `k2`. If `k < k2`, `k` lies between `k1` and `k2`. So, search in the left child of k2.
4. If `k > k2`, go for `k3`, `k4`,...`km-1` as in steps 2 and 3.
5. Repeat the above steps until a leaf node is reached.
6. If `k` exists in the leaf node, return true else return false.

## Searching Example on a B+ Tree

Let us search k = 45 on the following B+ tree.

![B+ tree](https://cdn.programiz.com/sites/tutorial2program/files/search-tree.png)

1. Compare k with the root node.
![k is not found at the root](https://cdn.programiz.com/sites/tutorial2program/files/B+tree-1.png)
2. Since k > 25, go to the right child.
![Go to right of the root](https://cdn.programiz.com/sites/tutorial2program/files/B+tree-2.png)
3. Compare k with 35. Since k > 30, compare k with 45.
![k not found](https://cdn.programiz.com/sites/tutorial2program/files/B+tree-3.png)
4. Since k ≥ 45, so go to the right child.
![go to the right](https://cdn.programiz.com/sites/tutorial2program/files/B+tree-4.png)
5. k is found.
![k is found](https://cdn.programiz.com/sites/tutorial2program/files/B+tree-5.png)
