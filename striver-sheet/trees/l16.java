//Diameter of a binary tree 

/*
- Diameter means 

- longest path between two nodes 
- path does not need to pass via root
*/
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


public class l16{

    static int diameter = 0;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        

        int height = findDiameter(root);

        System.out.println(diameter);
    }


    static int findDiameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int lh = findDiameter(root.left);
        int rh = findDiameter(root.right);

        diameter = Math.max(diameter, lh+rh);

        return 1+Math.max(lh, rh);
    }
}