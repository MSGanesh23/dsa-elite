//Check if a number is prime or not

import java.util.*;

public class p2{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scanner.nextInt();

        if(checkPrime(n))
        {
            System.out.println("The number is prime.");
        }
        else
        {
            System.out.println("The number is not prime.");
        }
    }

    static boolean checkPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        
        int m = (int)Math.sqrt(n);

        for(int i=2; i<=m; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }
}