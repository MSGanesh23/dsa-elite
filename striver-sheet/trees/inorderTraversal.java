import java.util.*;

public class inorderTraversal{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        inorder(root);
    }

    static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }

        inorder(root.left);
        print(root.data);
        inorder(root.right);
        
    }
}