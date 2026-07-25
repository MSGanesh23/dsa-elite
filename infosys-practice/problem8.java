//Count how many positive, negative, and zero values are present in an array.

import java.util.*;

public class problem8{
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

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i]>0)
            {
                positive++;
            }
            else
            {
                if(arr[i]<0)
                {
                    negative++;
                }
                else
                {
                    zero++;
                }

            }
        }

        System.out.println("Positive Number : " + positive);
        System.out.println("Negative Number : " + negative);
        System.out.println("Zeroes : " + zero);
    }
}