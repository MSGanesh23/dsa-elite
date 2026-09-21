// Program to get number cube and square 

import java.util.*;

public class p23{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scanner.nextInt();

        System.out.println("Square of the number : " + n*n);

        System.out.println("Cube of the number : " + n*n*n);
    }
}