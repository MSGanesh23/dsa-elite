import java.util.*;

public class basic3{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scanner.nextInt();

        if((n&1)!=0)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }
    }
}