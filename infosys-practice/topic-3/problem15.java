//Given an array and a target, return all indices where the target appears.

import java.util.*;

public class problem15{
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
        
        System.out.println("Enter the target key : ");

        int key = scanner.nextInt();

        ArrayList<Integer> res = linearSearch(arr, key);

        System.out.println("The indices of target are : ");

        for(int x : res)
        {
            System.out.print(x+" ");
        }

        System.out.println();
        
    }

    static ArrayList<Integer> linearSearch(int[] arr, int key)
    {
        int n = arr.length;

        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            if(arr[i]==key)
            {
                res.add(i);
            }
        }

        return res;
    }
}