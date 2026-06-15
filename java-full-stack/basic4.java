import java.util.*;

public class basic4{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");

        int a = scanner.nextInt();

        System.out.println("Enter the second number : ");

        int b = scanner.nextInt();

        int sum = a+b;

        if((sum&1)==0)
        {
            System.out.println("Sum is even");
        }
        else
        {
            System.out.println("Sum is odd");
        }
    }
}