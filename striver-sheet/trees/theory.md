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
    Level order traversal 

-> Level order traversal 
    First, we take a queue and push the root element into the queue. Then, we take a arraylist of arraylist to store the elements on each level of the tree. After that, we will check whether the node in the queue has left and right child, if it has we will add them in the queue and then pop the node in the queue. We will repeat this process until the queue is empty. If the queue is empty, that means we got the level order traversal. 


# Iterative Preorder traversal (without recursion)

First, take a stack, then insert the first root element into the stack. Then, pop the element and insert it into the result arraylist. Then insert left and right of the popped element from the stack. First right then left because we want to take the left element first in the next iteration. The stack is needed since we need to tell which element to iterate next according to the preorder traversal algroithm. 

If the stack is empty, then it means that the traversal is complete. 

# iterative Inorder Traversal (without recursion)

First, take a stack then store the first root element, then keep moving to the right and inserting the nodes encountered in the stack. Once null is encountered then print the present node and move to the right. If right is null, then move to the top most element of the stack. Repeat this process until the stack is empty. 

If the stack is empty, then it means the traversal is complete.

# Iterative postorder Traversal 

# 2 stacks

Take a stack1 and push the root element into it. Then traverse the neighbours of root and push them into the stack from left to right. Then pop the top most element of the stack into stack 2 and visit the neighbours of that element and push them into stack 1. Repeat this process until stack 1 is empty. 

Then print stack 2 in stack wise fashion and you will get the postorder traversal. 





