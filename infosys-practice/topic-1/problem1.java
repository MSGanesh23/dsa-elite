//Given an array of integers, calculate its sum.

import java.util.*;

public class problem1{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size : ");

        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Sum of array elements : " + arraySum(arr));

    }


    static int arraySum(int[] arr)
    {
        int n = arr.length;

        int sum = 0;

        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }

        return sum;
    }
}
