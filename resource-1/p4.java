//Find factorial of the number

import java.util.*;

public class p4{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scanner.nextInt();

        int factorial = 1;

        for(int i=1; i<=n; i++)
        {
            factorial *= i;
        }

        System.out.println("Factorial of the number is : " + factorial);
    }
}