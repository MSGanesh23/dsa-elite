// Program to find the ASCII Number of a given character

import java.util.*;

public class p13{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first character : ");

        char ch1 = scanner.next().charAt(0);

        System.out.println("Enter the second character : ");

        char ch2 = scanner.next().charAt(0);        

        int asciiValue1 = ch1; // Implicit Casting - Automatic Conversion

        int asciiValue2 = (int) ch2; // Explicit Casting - Improves Code Readability

        System.out.println("The ascii value of first character : " + asciiValue1);

        System.out.println("The ascii value of second character : " + asciiValue2);
    }
}