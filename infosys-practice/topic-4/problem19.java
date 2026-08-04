//Find the second largest element in an array.

import java.util.*;

public class problem19{
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
        
        int largest = arr[0];
        int second = Integer.MIN_VALUE;

        for(int i=1; i<n; i++)
        {
            if(arr[i]>largest)
            {
                second = largest;
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i]>second)
            {
                second = arr[i];
            }
        }

        if(second!=Integer.MIN_VALUE)
        {
            System.out.println("Second largest element : " + second);
        } 
        else
        {
            System.out.println("There is no second element");
        }


    }
}