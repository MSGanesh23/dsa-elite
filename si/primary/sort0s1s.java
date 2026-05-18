/*
Sort 0s and 1s
You are given an array of 0's and 1's. Sort the array in ascending order and print it.

Note: 
 Solve using two-pointer technique.  Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines, the first line contains N - the size of the array. The second line contains the elements of the array.

Output Format
For each test case, sort the array in ascending order and print it in a new line.

Constraints
1 <= T <= 1000
1 <= N <= 1000
0 <= A[i] <= 1

Example
Input
2
5
0 1 1 0 1
6
1 1 1 1 1 0

Output
0 0 1 1 1
0 1 1 1 1 1

Explanation

Self Explanatory
*/

import java.util.*;

public class sort0s1s{
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

            int p1 = 0;
            int p2 = n-1;

            while(p2>p1)
            {
                if(arr[p1]!=1)
                {
                    p1++;
                }
                if(arr[p2]!=0)
                {
                    p2--;
                }
                else
                {
                    if(arr[p1]==1 && arr[p2]==0)
                    {
                        arr[p1] = 0;
                        arr[p2] = 1;
                        p1++;
                        p2--;
                    }
                }
            }

            for(int i=0; i<n; i++)
            {
                System.out.print(arr[i]+" ");
            }

            System.out.println();

        }
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)

/*
Note:
Two Pointers
int p1 = 0;
int p2 = n-1;
p1 starts from left
p2 starts from right

Example:

Index: 0 1 2 3 4
Array: 1 0 1 0 1
       ↑       ↑
      p1      p2
Main Sorting Logic
while(p2>p1)

Loop until pointers meet.

Case 1: Left side already has 0
if(arr[p1]!=1)
{
    p1++;
}

If current left element is not 1 (meaning it is 0), it is already in correct position.

Move p1 forward.

Case 2: Right side already has 1
if(arr[p2]!=0)
{
    p2--;
}

If right element is not 0 (meaning it is 1), it is already correct.

Move p2 backward.

Case 3: Swap Needed
else
{
    if(arr[p1]==1 && arr[p2]==0)
    {
        arr[p1] = 0;
        arr[p2] = 1;
        p1++;
        p2--;
    }
}

If:

left side has 1
right side has 0

swap them.

Example Walkthrough

Input:

1 0 1 0 1

Initial:

p1 = 0
p2 = 4

Array:

1 0 1 0 1
Step 1
arr[p1] = 1
arr[p2] = 1

Right side correct → p2--

p2 = 3
Step 2
arr[p1] = 1
arr[p2] = 0

Swap:

0 0 1 1 1

Move both pointers.

Step 3

Pointers cross → stop.

Sorted array:

0 0 1 1 1
Output Printing
for(int i=0; i<n; i++)
{
    System.out.print(arr[i]+" ");
}

Prints sorted array.
*/