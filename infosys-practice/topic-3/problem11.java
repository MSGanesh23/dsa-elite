//Return true if a target exists in an array; otherwise return false.

import java.util.*;

public class problem11{
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

        if(linearSearch(arr, key))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

    static boolean linearSearch(int[] arr, int key)
    {
        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            if(arr[i]==key)
            {
                return true;
            }
        }

        return false;
    }
}