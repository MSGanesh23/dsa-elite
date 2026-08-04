//Find the second smallest distinct element in:

import java.util.*;

public class problem2{
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
        int second = Integer.MAX_VALUE;

        for(int i=1; i<n; i++)
        {
            if(arr[i]<smallest)
            {
                second = smallest;
                smallest = arr[i];
            }
            else
            {
                if(arr[i]>smallest && second>arr[i])
                {
                    second = arr[i];
                }
            }
        }

        if(second!=Integer.MAX_VALUE)
        {
            System.out.println("Second smallest element is : " + second);
        }
        else
        {
            System.out.println("Second smallest could not be found!");
        }
    }
}