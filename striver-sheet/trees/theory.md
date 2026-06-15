Trees - a hirerachial data structure 

Binary Tree - at max 2 children only 

Root - it is the starting point in the tree 

next nodes are called children nodes 

previous nodes are called parent nodes 

leaf nodes - have no children nodes 

Trees within a tree are called as sub trees. The nodes beneath a node are called as the subtree of that node. 

Ancestors - all the nodes before that particular node 

Types of binary trees 

There are a total of 5 types of binary trees 

1. Full Binary Tree : The nodes either has 0 or 2 children nodes

2. Complete binary tree : 
   -> All the levels must be completely filled except the last level 
   -> The last level the nodes must be filled to the left as much as possible 

3. Perfect Binary Tree : 
    All the leaf nodes must be at the same level 

4. Balanced Binary Tree : 
    The height of the tree must be at max log(n). This is done to optimize time complexity.

5. Degenerate Binary Tree (pathological Binary Tree):
    Every node has exactly one child node . Skew Trees 

# Traversals 

There are two ways to traverse a tree 

1. Depth first search 
2. Breadth first search 

1. Depth first search 

-> Pre order Traversal 
    Root -> Left -> Right 

-> Post Order Traversal 
    Left -> Right -> Root 

-> In Order Traversal 
    Left -> Root -> Right 

2. Breadth First Search 
    Level wise traversal 



