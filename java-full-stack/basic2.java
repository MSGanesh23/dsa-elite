import java.util.*;

public class basic2{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");

        int a = scanner.nextInt();

        System.out.println("Enter the second number : ");

        int b = scanner.nextInt();

        if(a>b)
        {
            System.out.println(a + " is the greater one");
        }
        else
        {
            if(b>a)
            {
                System.out.println(b + " is the greater one");
            }
            else
            {
                System.out.println("Both are equal");
            }
        }
    }
}