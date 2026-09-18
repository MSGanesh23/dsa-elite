// Reverse a Number 

import java.util.*;

public class p7{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scanner.nextInt();

        int rev = 0;

        while(n>0)
        {
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }

        System.out.println("Reversed Number : " + rev);
    }
}