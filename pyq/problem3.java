//To find the second largest and second smallest elements

import java.util.*;

public class problem3{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array : ");

        int n = scanner.nextInt();

        System.out.println("Enter the array elements : ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int sLarge = Integer.MIN_VALUE;
        int sSmall = Integer.MAX_VALUE;

        for(int i=0; i<n; i++)
        {
            if(arr[i]>largest)
            {
                sLarge = largest;
                largest = arr[i];
            }
            else
            {
                if(arr[i]>sLarge)
                {
                    sLarge = arr[i];
                }
            }

            if(arr[i]<smallest)
            {
                sSmall = smallest;
                smallest = arr[i];
            }
            else
            {
                if(arr[i]<sSmall)
                {
                    sSmall = arr[i];
                }
            }
        }


        System.out.println("The second largest element is : " + sLarge);
        System.out.println("The second smallest element is : " + sSmall);


    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
/*
Note:
If they want distinct elements 

use this line in else if
(arr[i]>sLarge && largest!=arr[i])

 */