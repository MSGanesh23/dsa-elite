// Program to get average of array elements 

import java.util.*;

public class p23{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size : ");

        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");

        int sum = 0;

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double average = ((double)sum)/n;

        System.out.println("Average : " + average);



        

        
    }
}