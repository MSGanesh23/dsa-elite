/*
Bubble Sort
Implement Bubble Sort and print the total number of swaps involved to sort the array.

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines. The first line of each test case contains N - the size of the array. The next line contains N integers - the elements of the array.

Output Format
For each test case, print the total number of swaps, separated by a new line.

Constraints
1 <= T <= 100
1 <= N <= 100
-1000 <= ar[i] <= 1000

Example
Input
4
8
176 -272 -272 -45 269 -327 -945 176
2
-274 161
7
274 204 -161 481 -606 -767 -351
2
154 -109

Output
15
0
16
1

Explanation

Self Explanatory
*/

import java.util.*;


public class bubbleSort{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");

        int t = scanner.nextInt();

        while(t-->0)
        {
            System.out.println("Enter the size of array : ");

            int n = scanner.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the array elements : ");

            for(int i=0; i<n; i++)
            {
                arr[i] = scanner.nextInt();
            }

            int count = 0;

            for(int i=1; i<n-1; i++)
            {
                for(int j=0; j<n-i; j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        count++;
                    }
                }
            }

            System.out.println("The swap count is : " + count);
        }
    }
}

// Time Complexity : O(N²) - Sum of n natural numbers for the inner loop
// Space Complexity : O(1)