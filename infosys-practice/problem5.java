/*Given an array, compute:

Sum
Minimum
Maximum
Average

in a single traversal.

*/

import java.util.*;

public class problem5{
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

        function(arr);
    }

    static void function(int[] arr)
    {
        int n = arr.length;

        int sum = arr[0];

        int max = arr[0];

        int min = arr[0];

        for(int i=1; i<n; i++)
        {
            sum += arr[i];

            if(max<arr[i])
            {
                max = arr[i];
            }

            if(min>arr[i])
            {
                min = arr[i];
            }


        }

        double average = (double)sum/n;

        System.out.println("Sum : " + sum);

        System.out.println("Maximum : " + max);

        System.out.println("Minimum : " + min);

        System.out.println("Average : " + average);


    }
}

