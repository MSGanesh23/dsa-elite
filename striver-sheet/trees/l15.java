//Check if a tree is balanced or not

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

public class l15{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        if(maxDepth(root)!=-1)
        {
            System.out.println("Tree is balanced");
        }
        else
        {
            System.out.println("Tree is not balanced");
        }
    }

    static int maxDepth(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        if(lh==-1||rh==-1)
        {
            return -1;
        }

        if(Math.abs(lh-rh)>1)
        {
            return -1;
        }

        return 1+Math.max(lh, rh);

    }
}