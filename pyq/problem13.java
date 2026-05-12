//Given an array, a position P, and a value V, insert V at position P.

import java.util.*;

public class problem13
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size : ");

        int n = scanner.nextInt();

        int[] arr = new int[n+1];

        System.out.println("Enter the array elements : ");

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the position to be inserted in : ");
        int position = scanner.nextInt();

        System.out.println("Enter the value of the element : ");
        int value = scanner.nextInt();

        for(int i=n; i>position; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[position] = value;

        for(int i=0; i<=n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();




    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)

/*
Note: 
Taken an array of size n+1, inserted the elemnts normally
Scanned the element to be inserted
Traverse the array in reverse and insert the elements upto position place to their right hand side
by one place 
arr[i] = arr[i-1]
    [1,2,3,_,4,5]
now insert it in the position and print the array 
*/