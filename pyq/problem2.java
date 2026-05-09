// To Find the largest number in an array 

import java.util.*;

public class problem2{
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

        int largest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            largest = Math.max(largest, arr[i]);
        }

        System.out.println("The largest number is : " + largest);


    }

}

//Time Complexity : O(N)
//Space Complexity : O(1)