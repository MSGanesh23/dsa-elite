//Find the largest element in an array.

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

        System.out.println("Largest element in array : " + largestElement(arr));


    }

    static int largestElement(int[] arr)
    {
        int n = arr.length;

        int largest = arr[0];

        for(int i=1; i<n; i++)
        {
            if(largest<arr[i])
            {
                largest = arr[i];
            }
        }

        return largest;


    }
}