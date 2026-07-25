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

public class iterativeinorder{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        ArrayList<Integer> res = inorder(root);

        for(int x : res)
        {
            System.out.print(x+" ");
        }

        System.out.println();



    }

    static ArrayList<Integer> inorder(Node root)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();

        Stack<Node> stack = new Stack<Node>();

        Node node = root;

        while(true)
        {
            if(node!=null)
            {
                stack.push(node);
                node = node.left;
            }
            else
            {
                if(stack.isEmpty())
                {
                    break;
                }
                else
                {
                    node = stack.pop();
                    res.add(node.data);
                    node = node.right;
                }
            }
        }

        return res;
    }
}