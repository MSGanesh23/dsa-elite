//All three traversals at once in iterrative approach 

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

class Pair{
    Node node;
    int state;

    Pair(Node node, int state)
    {
        this.node = node;
        this.state = state;
    }
}
public class l13{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        allTraversals(root);

        // System.out.println(res);
    
    }

    static void allTraversals(Node root)
    {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        Stack<Pair> st = new Stack<Pair>();

        if(root==null)
        {
            return;
        }

        st.push(new Pair(root, 1));

        while(!st.isEmpty())
        {
            Pair current = st.peek();

            if(current.state==1)
            {
                current.state++;
                pre.add(current.node.data);
                if(current.node.left!=null)
                {
                    st.push(new Pair(current.node.left,1));
                }
            }
            else
            {

            if(current.state==2)
            {
                current.state++;
                in.add(current.node.data);
                if(current.node.right!=null)
                {
                    st.push(new Pair(current.node.right,1));
                }
            }
            else
            {

            if(current.state==3)
            {
                post.add(current.node.data);
                st.pop();
            }
            }
            }
        }

        System.out.println("Preorder : " + pre);
        System.out.println("Inorder : " + in);
        System.out.println("Postorder : " + post);

        return;
    }
}