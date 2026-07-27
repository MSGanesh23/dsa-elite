//Find the last occurrence of a target in an array.

import java.util.*;

public class problem14{
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
        
        System.out.println("Enter the target key : ");

        int key = scanner.nextInt();

        int index = linearSearch(arr, key);

        if(index!=-1)
        {
            System.out.println("Last occurance of target : " + index);
        }
        else
        {
            System.out.println("Target not found");
        }
    }

    static int linearSearch(int[] arr, int key)
    {
        int n = arr.length;

        int index = -1;

        for(int i=0; i<n; i++)
        {
            if(arr[i]==key)
            {
                index = i;
            }
        }

        return index;
    }
}