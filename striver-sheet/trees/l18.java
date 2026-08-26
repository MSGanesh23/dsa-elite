//Check if two trees are identical or not

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


public class l18{

    static int maxSum = 0;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Node rootA = new Node(1);

        rootA.left = new Node(2);

        rootA.right = new Node(3);

        Node rootB = new Node(1);

        rootB.left = new Node(2);

        rootB.right = new Node(3);
        

        boolean result = sameOrNot(rootA, rootB);

        if(result)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }


    static boolean sameOrNot(Node rootA, Node rootB)
    {
        if(rootA==null||rootB==null)
        {
            return (rootA==rootB);
        }

        return (rootA.data==rootB.data)&&(sameOrNot(rootA.left, rootB.left))&&(sameOrNot(rootA.right, rootB.right));
    }
}