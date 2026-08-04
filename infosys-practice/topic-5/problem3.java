//Find the third largest distinct element using one traversal.

import java.util.*;

public class problem3{
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

        int first = arr[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=1; i<n; i++)
        {
            if(arr[i]>first)
            {
                third = second;
                second = first;
                first = arr[i];
            }
            else
            {
                if(arr[i]>second && arr[i]<first)
                {
                    third = second;
                    second = arr[i];
                }
                else
                {
                    if(arr[i]>third && arr[i]<second)
                    {
                        third = arr[i];
                    }
                }
            }
        }


        System.out.println("Third largest element : " + third);

    }
}