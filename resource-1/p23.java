// Program to get factorial of a number 

import java.util.*;

public class p23{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scanner.nextInt();

        long factorial = 1;

        for(int i=1; i<=n; i++)
        {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is : " + factorial);
    }
}