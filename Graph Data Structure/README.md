# Graph Data Structure

Graphs in data structures are non-linear data structures made up of a finite number of nodes or vertices and the edges that connect them. Graphs in data structures are used to address real-world problems in which it represents the problem area as a network like telephone networks, circuit networks, and social networks. For example, it can represent a single user as nodes or vertices in a telephone network, while the link between them via telephone represents edges.

A graph is a common data structure that consists of a finite set of nodes (or vertices) and a set of edges connecting them.

![Graph](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/what-is-graphs-in-data-structure.png)

This graph has a set of vertices V= { 1,2,3,4,5} and a set of edges E= { (1,2),(1,3),(2,3),(2,4),(2,5),(3,5),(4,50) }.

`G = {V, E}`

## Types of Graphs in Data Structures
There are different types of graphs in data structures, each of which is detailed below.

### 1. Finite Graph
The graph G=(V, E) is called a finite graph if the number of vertices and edges in the graph is limited in number

![FINITE-GRAPH-IN-GRAPHS-IN-DATA-STRUCTURE](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/FINITE-GRAPH-IN-GRAPHS-IN-DATA-STRUCTURE.png)

### 2. Infinite Graph
The graph G=(V, E) is called a finite graph if the number of vertices and edges in the graph is interminable.

![infinite-graph-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/infinite-graph-data-structure.png)

### 3. Trivial Graph
A graph G= (V, E) is trivial if it contains only a single vertex and no edges.
![trivial graph](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/trivial-graph-data-structure.png)

### 4. Simple Graph
If each pair of nodes or vertices in a graph G=(V, E) has only one edge, it is a simple graph. As a result, there is just one edge linking two vertices, depicting one-to-one interactions between two elements.

![simple-graph-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/simple-graph-data-structure.png)

### 5. Multi Graph
If there are numerous edges between a pair of vertices in a graph G= (V, E), the graph is referred to as a multigraph. There are no self-loops in a Multigraph.

![multi-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/multi-graph-in-data-structure.png)

### 6. Null Graph
It's a reworked version of a trivial graph. If several vertices but no edges connect them, a graph G= (V, E) is a null graph. 

![null-graph-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/null-graph-data-structure.png)

### 7. Complete Graph
If a graph G= (V, E) is also a simple graph, it is complete. Using the edges, with n number of vertices must be connected. It's also known as a full graph because each vertex's degree must be n-1.

![complete-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/complete-graph-in-data-structure.png)

### 8. Pseudo Graph
If a graph G= (V, E) contains a self-loop besides other edges, it is a pseudo-graph.

![pseudo-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/pseudo-graph-in-data-structure.png)

### 9. Regular Graph
If a graph G= (V, E) is a simple graph with the same degree at each vertex, it is a regular graph. As a result, every whole graph is a regular graph.

![regular-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/regular-graph-in-data-structure.png)

### 10. Weighted Graph
A graph G= (V, E) is called a labeled or weighted graph because each edge has a value or weight representing the cost of traversing that edge.

![weighted-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/weighted-graph-in-data-structure.png)

### 11. Directed Graph
A directed graph also referred to as a digraph, is a set of nodes connected by edges, each with a direction.

![directed-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/directed-graph-in-data-structure.png)

### 12. Undirected Graph
An undirected graph comprises a set of nodes and links connecting them. The order of the two connected vertices is irrelevant and has no direction. You can form an undirected graph with a finite number of vertices and edges.

![undirected-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/undirected-graph-in-data-structure.png)

### 13. Connected Graph
If there is a path between one vertex of a graph data structure and any other vertex, the graph is connected.

![connected-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/connected-graph-in-data-structure.png)

### 14. Disconnected Graph
When there is no edge linking the vertices, you refer to the null graph as a disconnected graph.

![disconnected-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/diconnected-graph-in-data-structure.png)

### 15. Cyclic Graph
If a graph contains at least one graph cycle, it is considered to be cyclic.

![cyclic-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/cyclic-graph-in-data-structure.png)

### 16. Acyclic Graph
When there are no cycles in a graph, it is called an acyclic graph.

![acyclic-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/acyclic-graph-in-data-structure.png)

### 17. Directed Acyclic Graph
It's also known as a directed acyclic graph (DAG), and it's a graph with directed edges but no cycle. It represents the edges using an ordered pair of vertices since it directs the vertices and stores some data.

![directed-acyclic-graph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/directed-acyclic-graph-in-data-structure.png)

### 18. Subgraph
The vertices and edges of a graph that are subsets of another graph are known as a subgraph.

![subgraph-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/subgraph-in-data-structure.png)

After you learn about the many types of graphs in graphs in data structures, you will move on to graph terminologies.

## Terminologies of Graphs in Data Structures
Following are the basic terminologies of graphs in data structures:

- An edge is one of the two primary units used to form graphs. Each edge has two ends, which are vertices to which it is attached.
- If two vertices are endpoints of the same edge, they are adjacent.
- A vertex's outgoing edges are directed edges that point to the origin.
- A vertex's incoming edges are directed edges that point to the vertex's destination.
- The total number of edges occurring to a vertex in a graph is its degree.
- The out-degree of a vertex in a directed graph is the total number of outgoing edges, whereas the in-degree is the total number of incoming edges.
- A vertex with an in-degree of zero is referred to as a source vertex, while one with an out-degree of zero is known as sink vertex.
- An isolated vertex is a zero-degree vertex that is not an edge's endpoint.
- A path is a set of alternating vertices and edges, with each vertex connected by an edge.
- The path that starts and finishes at the same vertex is known as a cycle.
- A path with unique vertices is called a simple path.
- For each pair of vertices x, y, a graph is strongly connected if it contains a directed path from x to y and a directed path from y to x.
- A directed graph is weakly connected if all of its directed edges are replaced with undirected edges, resulting in a connected graph. A weakly linked graph's vertices have at least one out-degree or in-degree.
- A tree is a connected forest. The primary form of the tree is called a rooted tree, which is a free tree.
- A spanning subgraph that is also a tree is known as a spanning tree.
- A connected component is the unconnected graph's most connected subgraph.
- A bridge, which is an edge of removal, would sever the graph.
- Forest is a graph without a cycle.

## Representation of Graphs in Data Structures
Graphs in data structures are used to represent the relationships between objects. Every graph consists of a set of points known as vertices or nodes connected by lines known as edges. The vertices in a network represent entities.

The most frequent graph representations are the two that follow:

- Adjacency matrix
- Adjacency list

You’ll look at these two representations of graphs in data structures in more detail:

### Adjacency Matrix
- A sequential representation is an adjacency matrix.
- It's used to show which nodes are next to one another. I.e., is there any connection between nodes in a graph?
- You create an MXM matrix G for this representation. If an edge exists between vertex a and vertex b, the corresponding element of G, gi,j = 1, otherwise gi,j = 0.
- If there is a weighted graph, you can record the edge's weight instead of 1s and 0s.
**Undirected Graph Representation**
![graph-representation-in-data-structure-NEW](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/undirected-graph-representation-in-data-structure-NEW.png)

**Directed Graph Representation**
![directed-graph-representation-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/directed-graph-representation-in-data-structure.png)

**Weighted Undirected Graph Representation**
Weight or cost is indicated at the graph's edge, a weighted graph representing these values in the matrix.

![unweighted-graph-representation-in-data-structure](https://www.simplilearn.com/ice9/free_resources_article_thumb/Graph%20Data%20Structure%20-%20Soni/unweighted-graph-representation-in-data-structure.png)

### Adjacency List
- A linked representation is an adjacency list.
- You keep a list of neighbors for each vertex in the graph in this representation. It means that each vertex in the graph has a list of its neighboring vertices.
- You have an array of vertices indexed by the vertex number, and the corresponding array member for each vertex x points to a singly linked list of x's neighbors.

![adjacency list](https://cdn.programiz.com/sites/tutorial2program/files/adjacency-list.png)
