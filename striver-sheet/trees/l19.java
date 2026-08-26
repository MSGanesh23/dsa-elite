//Zig-Zag or Spiral Traversal in Binary Tree

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

public class l19{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        root.left.left = new Node(4);

        root.right.right = new Node(5);

        ArrayList<ArrayList<Integer>> list = zigzag(root);

        for(ArrayList<Integer> li : list)
        {
        for(int a : li)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        }

        
    }


    static ArrayList<ArrayList<Integer>> zigzag(Node root)
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        if(root==null)
        {
            return list;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        boolean flag = true;

        while(!q.isEmpty())
        {
            int size = q.size();

            ArrayList<Integer> levelEle = new ArrayList<>();

            for(int i=0; i<size; i++)
            {
                Node curr = q.poll();

                levelEle.add(curr.data);

                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                } 

            }

            if(!flag)
            {
                Collections.reverse(levelEle);
            }

            list.add(levelEle);

            flag = !flag;
                
            }

           return list;
        }

        
    }
