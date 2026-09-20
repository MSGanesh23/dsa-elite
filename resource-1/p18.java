// Program to concatenate 2 strings

import java.util.*;

public class p18{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string : ");

        String a = scanner.nextLine();

        System.out.println("Enter the second string : ");

        String b = scanner.nextLine();

        // Method 1 : Arthemtic + Operator -> Most Common

        String result1 = a+b;

        System.out.println("Result 1 : " + result1);

        // Method 2 : .concat operator -> Returns a nullException if the second string is null

        String result2 = a.concat(b);

        System.out.println("Result 2 : " + result2);

        // Method 3 : StringBuilder .append method (Best for looping)

        StringBuilder sb = new StringBuilder();

        sb.append(a);
        sb.append(b);

        String result3 = sb.toString();

        System.out.println("Result 3 : " + result3);
    }
}