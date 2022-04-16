# Disjoint Set: Union Find
The disjoint set data structure is also known as union-find data structure and merge-find set. It is a data structure that contains a collection of disjoint or non-overlapping sets. The disjoint set means that when the set is partitioned into the disjoint subsets. The various operations can be performed on the disjoint subsets. In this case, we can add new sets, we can merge the sets, and we can also find the representative member of a set. It also allows to find out whether the two elements are in the same set or not efficiently.

## What is a disjoint–set?
A disjoint–set is a data structure that keeps track of a set of elements partitioned into several disjoint (non-overlapping) subsets. In other words, a disjoint set is a group of sets where no item can be in more than one set. It is also called a union–find data structure as it supports union and find operation on subsets. Let’s begin by defining them:

Find: It determines in which subset a particular element is in and returns the representative of that particular set. An item from this set typically acts as a “representative” of the set.

Union: It merges two different subsets into a single subset, and the representative of one set becomes representative of another.

The disjoint–set also supports one other important operation called MakeSet, which creates a set containing only a given element in it.

### How does Union–Find work?
We can determine whether two elements are in the same subset by comparing the result of two Find operations. If the two elements are in the same set, they have the same representation; otherwise, they belong to different sets. If the union is called on two elements, merge the two subsets to which the two elements belong.

### How to Implement Disjoint Sets?
Disjoint–set forests are data structures where each set is represented by a tree data in which each node holds a reference to its parent and the representative of each set is the root of that set’s tree.

- Find follows parent nodes until it reaches the root.
- Union combines two trees into one by attaching one tree’s root into the root of the other.

For example, consider five disjoint sets `S1`, `S2`, `S3`, `S4`, and `S5` represented by a tree, as shown below diagram. Each set initially contains only one element each, so their parent pointer points to itself or `NULL`.

`S1 = {1}, S2 ={2}, S3 = {3}, S4 ={4} and S5 = {5}`

The Find operation on element i will return representative of Si, where `1 <= i <= 5`, i.e., Find(i) = i.

![Union–Find Algorithm](https://www.techiedelight.com/wp-content/uploads/2016/11/Union-Find.png)

If we do Union `(S3, S4), S3 and S4` will be merged into one disjoint set, `S3`. Now,

`S1 = {1}, S2 ={2}, S3 = {3, 4} and S5 = {5}.`

Find(4) will return representative of set `S3`, i.e., Find(4) = 3

![Union–Find Algorithm – Step 1](https://www.techiedelight.com/wp-content/uploads/2016/11/Union-Find-1.png)

If we do Union `(S1, S2)`, `S1` and `S2` will be merged into one disjoint set, `S1`. Now,

`S1 = {1, 2}, S3 = {3, 4} and S5 = {5}.`

Find(2) or Find(1) will return the representative of set S1, i.e., Find(2) = Find(1) = 1

![Union–Find Algorithm – Step 2](https://www.techiedelight.com/wp-content/uploads/2016/11/Union-Find-2.png)

If we do Union `(S3, S1)`, `S3` and `S1` will be merged into one disjoint set, `S3`. Now,

`S3 = {1, 2, 3, 4} and S5 = {5}.`

![Union–Find Algorithm – Step 3](https://www.techiedelight.com/wp-content/uploads/2016/11/Union-Find-3.png)

[Disjoint Set: More](https://www.javatpoint.com/disjoint-set-data-structure)