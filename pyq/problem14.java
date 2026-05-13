//Given an array, find all elements that appear more than once.

import java.util.*;

public class problem14{
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

        HashMap<Integer, Integer> hm = new LinkedHashMap<>();

        for(int x : arr)
        {
            hm.put(x, hm.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer, Integer> e : hm.entrySet())
        {
            if(e.getValue()>1)
            {
                System.out.print(e.getKey()+" ");
            }
        }

        System.out.println();
    }
}


// Time Complexity : O(N)
// Space Complexity : O(N)

/*
Using hashmap to get the frequency of elements 
Specifically, using LinkedHashMap to preserve the inserted order
*/