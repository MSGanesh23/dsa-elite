//Find the smallest element and its index.

import java.util.*;

public class problem3{
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

        smallestElement(arr);
    }

    static void smallestElement(int[] arr)
    {
        int n = arr.length;

        int smallest = arr[0];
        int index = 0;

        for(int i=1; i<n; i++)
        {
            if(smallest>arr[i])
            {
                smallest = arr[i];
                index = i;
            }
        }

        System.out.println("Smallest element in array : " + smallest);
        System.out.println("Index : " + index);
    }
}