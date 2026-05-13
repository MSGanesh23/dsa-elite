//Given an array, find the contiguous subarray with the maximum product.

import java.util.*;

public class problem17{
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

        int currMin = arr[0];
        int currMax = arr[0];
        int maxProd = arr[0];

        for(int i=1; i<n; i++)
        {
            if(arr[i]<0)
            {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(arr[i], currMax*arr[i]);
            currMin = Math.min(arr[i], currMin*arr[i]);

            maxProd = Math.max(maxProd, currMax);
        }

        System.out.println("Max product is : " + maxProd);
    }
}


// Time Complexity : O(N)
// Space Complexity : O(1)

/*
Note:
Using currMin, incase a negative element later becomes a big positive number 
*/