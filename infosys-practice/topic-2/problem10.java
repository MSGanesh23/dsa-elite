//Given an array of integers, determine whether the array is strictly increasing (every element is greater than the previous one) using a single traversal.

import java.util.*;

public class problem10{
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

        if(function(arr))
        {
            System.out.println("Array is strictly increasing");
        }
        else
        {
            System.out.println("Array is not strictly increasing");
        }
    }

    static boolean function(int[] arr)
    {
        int n = arr.length;

        int a = arr[0];

        for(int i=1; i<n; i++)
        {
            if(arr[i]>a)
            {
                a = arr[i];
            }
            else
            {
                return false;
            }
        }

        return true;
    }
}