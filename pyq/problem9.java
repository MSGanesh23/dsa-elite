//Given an array of N integers, find the average of all elements.

import java.util.*;

public class problem9{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array : ");

        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;

        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }


        double average = sum/n;

        System.out.println("The average of array elements is : " + average);
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)