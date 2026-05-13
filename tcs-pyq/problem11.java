//Given a sorted array, remove duplicates in-place and return the new length.

import java.util.*;

public class problem11{
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

        int uniqueIndex = 1;

        for(int i=1; i<n; i++)
        {
            if(arr[i-1]!=arr[i])
            {
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }

        for(int i=0; i<uniqueIndex; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Length : " + uniqueIndex);
    }
}


// Time Complexity : O(N)
// Space Complexity : O(1)

/*
Note: 
We could also use hashset but we used the two pointers 
to reduce space and for in-place solution
*/