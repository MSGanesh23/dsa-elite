import java.util.*;

public class postorderTraversal{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        postorder(root);
    }

    static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        print(root.data);
    }
}