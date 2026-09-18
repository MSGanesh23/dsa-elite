// Swapping of Two Numbers 

import java.util.*;

public class p8{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a : ");

        int a = scanner.nextInt();

        System.out.println("Enter the value of b : ");

        int b = scanner.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping \n " + "a : " + a + "\n b : " + b);
    }
}