//Given an array, rearrange so first half is sorted ascending and second half sorted descending.

import java.util.*;

public class problem6{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array : ");

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        
        int mid = n/2;

        int i = mid;
        int j = n-1;

        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("The resultant array : ");

        for(int x : arr)
        {
            System.out.print(x+" ");
        }

        System.out.println();
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)