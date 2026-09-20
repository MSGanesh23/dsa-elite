// Program to find greatest of 3 numbers

import java.util.*;

public class p12{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number : ");
        int b = scanner.nextInt();

        System.out.println("Enter the third number : ");
        int c = scanner.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a + " is the greatest number of the three");
        }
        else
        {
            if(b>c && b>a)
            {
                System.out.println(b + " is the greatest number of the three");
            }
            else
            {
                System.out.println(c + " is the greatest number of the three");
            }
        }
    }
}