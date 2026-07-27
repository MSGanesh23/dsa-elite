//Find both the largest and smallest element using one traversal.

import java.util.*;

public class problem9{
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

        function(arr);
    }

    static void function(int[] arr)
    {
        int smallest = arr[0];
        int largest = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            if(smallest>arr[i])
            {
                smallest = arr[i];
            }

            if(largest<arr[i])
            {
                largest = arr[i];
            }
        }

        System.out.println("Largest element : " + largest);

        System.out.println("Smallest element : " + smallest);


    }
}