/*
Insertion Sort
Implement Insertion Sort and print the index at which the ith element gets inserted [i>=1].

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines. The first line of each test case contains N - the size of the array. The next line contains N integers - elements of the array.

Output Format
For each test case, print the index at which the ith element gets inserted [i>=1], separated by space. Separate the output of different tests by a new line.

Constraints
1 <= T <= 100
2 <= N <= 100
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
0 1 2 4 0 0 6
1
0 0 3 0 0 2
0

Explanation

Self Explanatory
*/

import java.util.*;

public class insertionSort{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");

        int t = scanner.nextInt();

        while(t-->0)
        {
            System.out.println("Enter the array size : ");

            int n = scanner.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the array elements : ");

            for(int i=0; i<n; i++)
            {
                arr[i] = scanner.nextInt();
            }

            for(int i=1; i<n; i++)
            {
                int j = i-1;
                int temp = arr[i];

                while(j>=0 && arr[j]>temp)
                {
                    arr[j+1] = arr[j];
                    j--;
                }

                arr[j+1] = temp;
                System.out.print((j+1)+" ");

            }

            System.out.println();
        }
    }
}

// Time Complexity : O(N²)

// For every element, you compare and shift all previous elements.

// Total operations:

// 1 + 2 + 3 + ... + (N-1)
// = N(N-1)/2
// = O(N²)

// Space Complexity : O(1)