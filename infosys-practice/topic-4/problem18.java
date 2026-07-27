//Find both the maximum and minimum using one traversal.

import java.util.*;

public class problem18{
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
        
        int smallest = arr[0];
        int largest = arr[0];

        for(int i=1; i<n; i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }

            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element : " + smallest);
        System.out.println("Largest element : " + largest);
    }
}