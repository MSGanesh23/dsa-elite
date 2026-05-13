//Given an array of pairs (a, b), find all symmetric pairs where (b, a) also exists.

import java.util.*;

public class problem16
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size : ");

        int n = scanner.nextInt();

        int[][] pairs = new int[n][2];

        System.out.println("Enter the pairs : ");

        for(int i=0; i<n; i++)
        {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int[] pair : pairs)
        {
            if(hm.containsKey(pair[1]) && hm.get(pair[1])==pair[0])
            {
                System.out.println("(" + pair[1] + ", " + pair[0] + ")"+" -> "+"(" + pair[0] + ", " + pair[1] + ")");
            }
            else
            {
                hm.put(pair[0], pair[1]);
            }
        }


    }
}

//Time Complexity : O(N)
// Space Complexity : O(N)

/*
Note:
We will store the pairs in a two dimensional array 
Using the hashmap to store the already visited pairs 
If a visited pair has its symmetric pair, then the program will print it.
Else
It will get inserted into the hashmap
*/