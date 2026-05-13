//Given an array of N integers, count and print the frequency of each distinct element.

import java.util.*;

public class problem5{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array : ");

        int n = scanner.nextInt();

        System.out.println("Enter the array elements : ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int x : arr)
        {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey()+" -> "+e.getValue());
        }

    }
}

//Time Complexity : O(N)
//Space Complexity : O(N)

/*
-> LinkedHashMap is used to save the inserted order
-> take a look at syntax for iterating through the entry set
*/