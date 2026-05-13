//Given an array of N integers, calculate the sum of all elements.

import java.util.*;

public class problem7{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array :" );

        int n = scanner.nextInt();

        System.out.println("Enter the elements of array : ");

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;

        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }

        System.out.println("The sum of array elements is : " + sum);
    }
}

//Time Complexity : O(N)
//Space Complexity : O(1)
/*
Note:
Initialize the variable "sum" as long depending on the constraints
in the problem 
*/