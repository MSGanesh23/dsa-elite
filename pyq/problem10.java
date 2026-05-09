//Given an array, find the median. If N is odd, the middle element; if even, average of two middle.

import java.util.*;

public class problem10{
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

        Arrays.sort(arr);

        if(n%2==1)
        {
            System.out.println("The median is : " + arr[n/2]);
        }
        else
        {
            System.out.println("The median is : " + (arr[(n/2)-1]+arr[n/2])/2.0);
        }


    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)

/*
Note:
We have used "/2.0" to get the exact value of the median
*/