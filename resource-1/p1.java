//Program to find Fibonacci numbers

import java.util.*;

public class p1{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print("Enter the number : ");

        int number = scanner.nextInt();

        System.out.print(a+" "+b+" ");

        for(int i=0; i<number; i++)
        {   
            c = a+b;

            System.out.print(c+" ");
            a = b;
            b = c;
        }

        System.out.println();


    }
}