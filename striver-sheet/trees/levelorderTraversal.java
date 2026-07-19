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

public class levelorderTraversal{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Node root = new Node(1);

        ArrayList<ArrayList<Integer>> res = levelorder(root);

        for(ArrayList<Integer> ls : res)
        {
            for(int a : ls)
            {
                System.out.print(a+" ");
            }

            System.out.println();
        }


    }

    static ArrayList<ArrayList<Integer>> levelorder(Node root)
    {
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size();

            ArrayList<Integer> levelEle = new ArrayList<Integer>();

            for(int i=0; i<size; i++)
            {
                if(q.peek().left!=null)
                {
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null)
                {
                    q.add(q.peek().right);
                }
                levelEle.add(q.peek().data);
                q.poll();
            }

            res.add(levelEle);


        }
        return res;
    }
}