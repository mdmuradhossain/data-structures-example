# Tree Data Structure

The tree is a nonlinear hierarchical data structure and comprises a collection of entities known as nodes. It connects each node in the tree data structure using "edges�, both directed and undirected.

The image below represents the tree data structure. The blue-colored circles depict the nodes of the tree and the black lines connecting each node with another are called edges.

![tree](https://www.simplilearn.com/ice9/free_resources_article_thumb/Trees-Soni/what-is-tree.png)

## Terminology

In a tree data structure, we use the following terminology...

1. Root
   In a tree data structure, the first node is called as Root Node. Every tree must have a root node. We can say that the root node is the origin of the tree data structure. In any tree, there must be only one root node. We never have multiple root nodes in a tree.
   ![Root](http://www.btechsmartclass.com/data_structures/ds_images/Root.png)
2. Edge
   In a tree data structure, the connecting link between any two nodes is called as EDGE. In a tree with 'N' number of nodes there will be a maximum of 'N-1' number of edges.
   ![Edge](http://www.btechsmartclass.com/data_structures/ds_images/Edge.png)
3. Parent
   In a tree data structure, the node which is a predecessor of any node is called as PARENT NODE. In simple words, the node which has a branch from it to any other node is called a parent node. Parent node can also be defined as "The node which has child / children".
   ![Parent](http://www.btechsmartclass.com/data_structures/ds_images/Parent.png)
4. Child
   In a tree data structure, the node which is descendant of any node is called as CHILD Node. In simple words, the node which has a link from its parent node is called as child node. In a tree, any parent node can have any number of child nodes. In a tree, all the nodes except root are child nodes.
   ![Child](http://www.btechsmartclass.com/data_structures/ds_images/Child.png)
5. Siblings
   In a tree data structure, nodes which belong to same Parent are called as SIBLINGS. In simple words, the nodes with the same parent are called Sibling nodes.
   ![Siblings](http://www.btechsmartclass.com/data_structures/ds_images/Siblings.png)
6. Leaf
   In a tree data structure, the node which does not have a child is called as LEAF Node. In simple words, a leaf is a node with no child.

   In a tree data structure, the leaf nodes are also called as External Nodes. External node is also a node with no child. In a tree, leaf node is also called as 'Terminal' node.
   ![Leaf](http://www.btechsmartclass.com/data_structures/ds_images/Leaf.png)

7. Internal Nodes
   In a tree data structure, the node which has atleast one child is called as INTERNAL Node. In simple words, an internal node is a node with atleast one child.

   In a tree data structure, nodes other than leaf nodes are called as Internal Nodes. The root node is also said to be Internal Node if the tree has more than one node. Internal nodes are also called as 'Non-Terminal' nodes.
   ![Internal Nodes](http://www.btechsmartclass.com/data_structures/ds_images/Internal.png)

8. Degree
   In a tree data structure, the total number of children of a node is called as DEGREE of that Node. In simple words, the Degree of a node is total number of children it has. The highest degree of a node among all the nodes in a tree is called as 'Degree of Tree'
   ![Degree](http://www.btechsmartclass.com/data_structures/ds_images/Degree.png)
9. Level
   In a tree data structure, the root node is said to be at Level 0 and the children of root node are at Level 1 and the children of the nodes which are at Level 1 will be at Level 2 and so on... In simple words, in a tree each step from top to bottom is called as a Level and the Level count starts with '0' and incremented by one at each level (Step).
   ![Level](http://www.btechsmartclass.com/data_structures/ds_images/Levels.png)
10. Height
    In a tree data structure, the total number of edges from leaf node to a particular node in the longest path is called as HEIGHT of that Node. In a tree, height of the root node is said to be height of the tree. In a tree, height of all leaf nodes is '0'.
    ![Height](http://www.btechsmartclass.com/data_structures/ds_images/Height.png)
11. Depth
    In a tree data structure, the total number of egdes from root node to a particular node is called as DEPTH of that Node. In a tree, the total number of edges from root node to a leaf node in the longest path is said to be Depth of the tree. In simple words, the highest depth of any leaf node in a tree is said to be depth of that tree. In a tree, depth of the root node is '0'.
    ![Depth](http://www.btechsmartclass.com/data_structures/ds_images/Depth.png)
12. Path
    In a tree data structure, the sequence of Nodes and Edges from one node to another node is called as PATH between that two Nodes. Length of a Path is total number of nodes in that path. In below example the path A - B - E - J has length 4.
    ![Path](http://www.btechsmartclass.com/data_structures/ds_images/Path.png)
13. Sub Tree
    In a tree data structure, each child from a node forms a subtree recursively. Every child node will form a subtree on its parent node.
    ![Sub Tree](http://www.btechsmartclass.com/data_structures/ds_images/Subtree.png)

## Tree Applications

- Binary Search Trees(BSTs) are used to quickly check whether an element is present in a set or not.
- Heap is a kind of tree that is used for heap sort.
- A modified version of a tree called Tries is used in modern routers to store routing information.
- Most popular databases use B-Trees and T-Trees, which are variants of the tree structure we learned above to store their data
- Compilers use a syntax tree to validate the syntax of every program you write.
