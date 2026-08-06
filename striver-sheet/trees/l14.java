//maximum depth or height of binary tree 

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

public class l14{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        int res = maxDepth(root);

        System.out.println("Maximum depth : " + res);
    }

    static int maxDepth(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1+Math.max(lh, rh);
    }
}