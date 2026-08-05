//Iterative Postorder Traversal using only one stack 

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

public class l12{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        ArrayList<Integer> res = postorder(root);

        for(int x : res)
        {
            System.out.print(x+" ");
        }

        System.out.println();

        // System.out.println(res);
    }

    static ArrayList<Integer> postorder(Node root)
    {
        Stack<Node> st = new Stack<Node>();

        ArrayList<Integer> res = new ArrayList<Integer>();

        if(root==null)
        {
            return res;
        }

        Node current = root;
        Node lastVisited = null;

        

        while(current!=null || !st.isEmpty())
        {
            while(current!=null)
            {
                st.push(current);
                current = current.left;
            }

            Node peek = st.peek();
            
                if(peek.right!=null && lastVisited!=peek.right)
                {
                    current = peek.right;
                }
                else
                {
                    res.add(peek.data);
                    lastVisited = st.pop();
                }
            
        }

        return res;
    }
}