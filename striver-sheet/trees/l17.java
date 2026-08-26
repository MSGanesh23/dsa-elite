 //Maximum Path Sum in Binary Tree 

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        data = key;
        left = null;
        right = null;
    }
}


public class l17{

    static int maxSum = 0;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        

        int sum = findMaxSum(root);

        System.out.println(maxSum);
    }


    static int findMaxSum(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int leftSum = Math.max(0,findMaxSum(root.left));
        int rightSum = Math.max(0,findMaxSum(root.right));

        maxSum = Math.max(maxSum, leftSum+rightSum+root.data);

        return root.data+Math.max(leftSum,rightSum);
    }
}