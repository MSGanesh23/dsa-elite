/*
Count Set Bits
Given a number N, find the number of bits that are set to 1 in its binary representation.

Input Format
The first line of input contains T - the number of test cases. It is followed by T lines, each line contains a single integer N.

Output Format
For each test case, print the number of bits set to 1 in the binary representation of N, separated by a new line.

Constraints
1 <= T <= 104
0 <= N <= 1018

Example
Input
3
4
15
10

Output
1
4
2

Explanation

Test-Case 1
The binary representation of 4 is 100.
The number of 1's in the binary representation of 4 is 1.

Test-Case 2
The binary representation of 15 is 1111.
The number of 1's in the binary representation of 15 is 4.
*/


import java.util.*;

public class countSetBits{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");

        int t = scanner.nextInt();

        while(t-->0)
        {
            System.out.println("Enter the number to count bits : ");

            int n = scanner.nextInt();

            int count = 0;

            while(n!=0)
            {
                count += n&1;
                n>>=1;
            }

            System.out.println(count);
        }
    }
}

// Time Complexity : O(1)
// Space Complexity : O(1)

/*
Note:
Counter Variable
int count = 0;

Stores number of set bits.

Main Logic
while(n!=0)
{
    count += n&1;
    n>>=1;
}

This loop checks every bit of the number.

Understanding n & 1
Bitwise AND
n & 1

Checks the last bit.

Why?

Because:

1 in binary = 0001

AND operation:

Last Bit of n	Result of n & 1
0	0
1	1

So:

if last bit is 1 → add 1 to count
if last bit is 0 → add 0
Understanding n >>= 1
n >>= 1;

Right shift by 1 bit.

This removes the last bit.

Example:

13 = 1101

After shift:

1101 >> 1 = 110

which is:

6
Full Example Walkthrough

Suppose input:

13

Binary:

1101
Iteration 1
n = 1101
n & 1 = 1
count = 1

Shift:

1101 → 110
Iteration 2
n = 110
n & 1 = 0
count = 1

Shift:

110 → 11
Iteration 3
n = 11
n & 1 = 1
count = 2

Shift:

11 → 1
Iteration 4
n = 1
n & 1 = 1
count = 3

Shift:

1 → 0

Loop stops.

Output:

3
Time Complexity

The loop runs once for every bit in the number.

For an integer with b bits:

O(b)

For a 32-bit integer:

O(32)

which is effectively:

O(1)

because integer size is fixed.

If considering general numbers:

O(logn)
Space Complexity

Only a few variables are used:

n
count
t

No extra arrays or data structures.

So:

O(1)
*/