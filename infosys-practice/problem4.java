//Count how many elements are even and how many are odd.

import java.util.*;

public class problem4{
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

        oddEven(arr);
    }

    static void oddEven(int[] arr)
    {
        int oddCount = 0;
        int evenCount = 0;

        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            if((arr[i]&1)==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        System.out.println("Count of odd numbers : " + oddCount + "\n" + "Count of even numbers : " + evenCount);
    }
}