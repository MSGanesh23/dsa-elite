import java.util.*;

public class preorderTraversal{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        preorder(root);
    }

    static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }

        print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
}
