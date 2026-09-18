//Program to find sum of digits

import java.util.*;

public class p6{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scanner.nextInt();

        int sum = 0;

        while(n>0)
        {
            int digit = n%10;
            sum += digit;
            n = n/10;
        }

        System.out.println("The sum of digits : " + sum);


    }
}