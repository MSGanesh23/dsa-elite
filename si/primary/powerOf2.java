/*
Power of 2
Given a number, check if it is a power of 2.

Input Format
The first line of input contains T - the number of test cases. It's followed by T lines, each line containing a single positive integer.

Output Format
For each test case, print "True" or "False", separated by a new line.

Constraints
1 <= T <= 10000
1 <= N <= 1018

Example
Input
5
1
8
10
25
512

Output
True
True
False
False
True

Explanation

Self Explanatory

*/



import java.util.*;

public class powerOf2{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");

        int t = scanner.nextInt();

        while(t-->0)
        {
            System.out.println("Enter the number to check : ");

            int n = scanner.nextInt();

            if(n>0 && (n&(n-1))==0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }


    }
}


// Time Complexity : O(1)
// Space Complexity : O(1)

/*
Note:

The expression:

(n & (n - 1))

is a classic bit manipulation trick used to check whether a number is a power of 2.

Step 1: Understand Binary Representation

Every number is stored in binary (0s and 1s).

Examples:

Decimal	Binary
1	0001
2	0010
4	0100
8	1000
16	10000

Notice something special:

Powers of 2 always contain exactly one 1 bit.

Step 2: What Happens When We Subtract 1?

Subtracting 1 from a power of 2 changes the bits in a predictable way.

Example:

Example: n = 8

Binary of 8:

1000

Now calculate:

8 - 1 = 7

Binary of 7:

0111

Notice:

the single 1 becomes 0
all bits to the right become 1
Step 3: Apply Bitwise AND (&)

Bitwise AND compares bits:

A	B	A & B
0	0	0
0	1	0
1	0	0
1	1	1

Now:

  1000   (8)
& 0111   (7)
-------
  0000

Result is 0.

Key Insight

For every power of 2:

n & (n - 1) == 0

because the operation removes the only set bit.

*/