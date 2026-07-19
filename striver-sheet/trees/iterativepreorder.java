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

public class iterativepreorder{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        ArrayList<Integer> res = preorder(root);

        for(int x : res)
        {
            System.out.print(x+" ");
        }

        System.out.println();

        // System.out.println(res);
    }

    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> res = new ArrayList<>();

        if(root==null)
        {
            return res;
        }

        Stack<Node> stack = new Stack<Node>();

        stack.push(root);

        while(!stack.isEmpty())
        {
            root = stack.pop();

            res.add(root.data);

            if(root.right!=null)
            {
                stack.push(root.right);
            }
            if(root.left!=null)
            {
                stack.push(root.left);
            }


        }

        return res;
    }




}