// Program to check for strong number 

/*
A strong number is a special number where the sum of the factorials of 
its individual digits equals the number itself
*/

import java.util.*;

public class p26{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scanner.nextInt();

        int sum = 0;

        int temp = n;

        while(temp>0)
        {
            int digit = temp%10;
            sum += factorial(digit);
            temp = temp/10;
        }

        if(n == sum)
        {
            System.out.println(n + " is a strong number.");
        }
        else
        {
            System.out.println(n + " is not a strong number.");
        }
    }

    static long factorial(int n)
    {
        long factorial = 1;

        for(int i=1; i<=n; i++)
        {
            factorial *= i;
        }

        return factorial;
    }
}