//To find the smallest number in the array 

import java.util.*;

public class problem1{
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<n; i++)
        {
            smallest = Math.min(smallest, arr[i]);
        }

        System.out.println("The smallest number is : " + smallest);
    }
}


//Time Complexity : O(N)
//Space Complexity : O(1)