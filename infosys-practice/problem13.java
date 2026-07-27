//Count how many times a target appears in an array.

import java.util.*;

public class problem13{
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

        int freq = linearSearch(arr, key);

        System.out.println("Count of the key element in array : " + freq);

        
    }

    static int linearSearch(int[] arr, int key)
    {
        int n = arr.length;

        int count = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i]==key)
            {
                count++;
            }
        }

        return count;
    }

}