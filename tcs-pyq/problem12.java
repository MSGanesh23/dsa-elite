//Given an unsorted array, remove duplicates preserving first occurrence.

import java.util.*;

public class problem12{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array : ");

        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> unique = new LinkedHashSet<>();

        for(int i=0; i<n; i++)
        {
            unique.add(arr[i]);
        }

        for(int x : unique)
        {
            System.out.print(x+" ");
        }
        
        System.out.println();
    }
}