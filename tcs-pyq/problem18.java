//Replace each element with its rank. Smallest gets rank 1, next gets 2, etc.

import java.util.*;

public class problem18{
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

        int[] sorted = arr.clone();

        HashMap<Integer, Integer> ranks = new HashMap<>();

        Arrays.sort(sorted); //O(NlogN)

        int rank = 1;

        for(int x : sorted)
        {
            if(!ranks.containsKey(x))
            {
                ranks.put(x, rank++);
            }
        }

        System.out.println("The resultant array is : ");

        for(int i=0; i<n; i++)
        {
            System.out.print(ranks.get(arr[i]) + " ");
        }

        System.out.println();


    }
}

// Time Complexity : O(NlogN)
// Space Complexity : O(N)

/*
arr.clone() is used to duplicate the array
Time complexity is high due to sorting 
*/