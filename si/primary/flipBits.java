/*
Flip Bits
You are given two numbers A and B. Write a program to count the number of bits to be flipped to change the number A to the number B. Flipping a bit of a number means changing a bit from 1 to 0 or vice versa.

Input Format
The first line of input contains T - the number of test cases. Each of the next T lines contains 2 integers A and B, separated by space.

Output Format
For each test case, print the number of bit flips required to convert A to B, separated by a new line.

Constraints
1 <= T <= 100000
0 <= A, B <= 109

Example
Input
4
20 10
16 8
1 153
549 24

Output
4
2
3
6

Explanation

Self Explanatory
*/

import java.util.*;

public class flipBits{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");

        int t = scanner.nextInt();

        while(t-->0)
        {
            System.out.println("Enter the first number : ");
            int a = scanner.nextInt();

            System.out.println("Enter the second number : ");
            int b = scanner.nextInt();

            int count = 0;

            int xor = a^b;

            while(xor!=0)
            {
                count += xor&1;
                xor >>= 1;
            }

            System.out.println("The number of bits to be flipped : " + count);
        }



    }
}


// Time Complexity : O(1) - Since, the number of bits in int of java are always 32
// Space Complexity : O(1)

/*
Note:
We used xor operation to get a value which represents the bit positions where the bits of 
a and b are not same 
So, we iterate through every bit in the xor variable and find positions where the bits are 1 (different bit values for a and b) 
 through performing "and" operation 
and count them this will give us the number of bits to be flipped. 
*/