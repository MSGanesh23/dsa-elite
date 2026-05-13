//To reverse the array in-place

import java.util.*;

public class problem4{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array : ");

        int n = scanner.nextInt();

        System.out.println("Enter the elements of the array : ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<n/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        System.out.println("The reverse order of array : ");

        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();


    }
}

//Time complexity : O(N)
//Space Complexity : O(1)

/*
The logic : 
Traverse half the array and swap the corresponding elements
*/

