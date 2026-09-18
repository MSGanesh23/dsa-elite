// Program to convert decimal to binary 

import java.util.*;

public class p10{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the decimal number : ");

        int n = scanner.nextInt();

        int[] arr = new int[32];

        int i = 0;

        for(i=0; n>0; i++)
        {
            arr[i] = n%2;
            n = n/2;
        }

        System.out.println("Binary form of the given number : ");

        for(int j=i-1; j>=0; j--)
        {
            System.out.print(arr[j]+" ");
        }

        System.out.println();
    }
}