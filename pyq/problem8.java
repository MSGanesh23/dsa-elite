//Given an array and K, rotate left by K positions using the reversal algorithm.

import java.util.*;

public class problem8{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array : ");

        int n = scanner.nextInt();

        System.out.println("Enter the k value : ");

        int k = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);

        System.out.println("The resultant array : ");

        for(int x : arr)
        {
            System.out.print(x+" ");
        }

        System.out.println();
    }

    static void reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)

/*
Logic:
reverse the first k elements 
then reverse the remaining elements 
Then reverse the entire array again
*/