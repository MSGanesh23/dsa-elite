//Check if number is palindrome or not

import java.util.*;

public class p3{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scanner.nextInt();

        int duplicate = n;
        int reverse = 0;

        while(n>0)
        {
            int digit = n%10;
            reverse = (reverse*10) + digit;
            n = n/10;
        }

        if(reverse == duplicate)
        {
            System.out.println("The number is Palindrome.");
        }
        else
        {
            System.out.println("The number is not Palindrome.");
        }
    }
}