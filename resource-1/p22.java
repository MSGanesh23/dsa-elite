// Program to get number of digits 

import java.util.*;

public class p22{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scanner.nextInt();

        int count = 0;

        if(n==0)
        {
            count = 1;
        }
        else
        {
        while(n>0)
        {
            count++;
            n = n/10;
        }
        }

        System.out.println("Number of digits : " + count);

    }
}