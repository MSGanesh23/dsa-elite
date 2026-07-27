//Find the smallest element in an array.

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
        
        int smallest = arr[0];

        for(int i=1; i<n; i++)
        {
            if(smallest>arr[i])
            {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element : " + smallest);
    }
}