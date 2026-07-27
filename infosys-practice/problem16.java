//Find the largest element in an array.

import java.util.*;

public class problem16{
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
        
        int largest = arr[0];

        for(int i=1; i<n; i++)
        {
            if(largest<arr[i])
            {
                largest = arr[i];
            }
        }

        System.out.println("Largest element : " + largest);
    }
}