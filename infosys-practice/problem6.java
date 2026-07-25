//Print every element of an array from left to right.

import java.util.*;

public class problem6{
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

        printArray(arr);
    }

    static void printArray(int[] arr)
    {
        int n = arr.length;

        System.out.println("Array elements : ");
        
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}