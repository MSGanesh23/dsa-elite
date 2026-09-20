// Program to find the gcd of two numbers 

import java.util.*;

public class p20{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");

        int a = scanner.nextInt();

        System.out.println("Enter the second number : ");

        int b = scanner.nextInt();

        int result = gcd(a,b);

        System.out.println("GCD of " + a + " and " + b + " is : " + result);
    }

    static int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }

        return gcd(b, (a%b));
    }
}