//iterative postorder using 2 stacks

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

public class l11{
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
        ArrayList<Integer> res = new ArrayList<>();

        Stack<Node> st1 = new Stack<Node>();
        Stack<Node> st2 = new Stack<Node>();

        if(root==null)
        {
            return res;
        }

        st1.push(root);

        while(!st1.isEmpty())
        {
            root = st1.pop();
            st2.push(root);
            if(root.left!=null)
            {
                st1.push(root.left);
            }
            if(root.right!=null)
            {
                st1.push(root.right);
            }
        }

        while(!st2.isEmpty())
        {
            res.add(st2.pop().data);
        }

        return res;
    }
}

