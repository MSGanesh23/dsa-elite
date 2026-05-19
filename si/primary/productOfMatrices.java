/*
Product of 2 Matrices
Given 2 matrices, find their product.

Input Format
The first line of input contains T - the number of test cases. The first line of each test case contains N1, M1 - the size of the 1st matrix. It is followed by N1 lines each containing M1 integers - elements of the 1st matrix. The next line contains N2, M2 - the size of the 2nd matrix. It is followed by N2 lines each containing M2 integers - elements of the 2nd matrix. Note that M1 = N2.

Output Format
For each test case, print the resultant product matrix, separated by a new line.

Constraints
1 <= T <= 100
1 <= N1,M1,N2,M2 <= 50
-100 <= mat[i][j] <= 100

Example
Input
2
2 2
1 2
3 -1
2 3
1 -2 3
2 3 -1
2 3
27 29 53
-28 49 -24
3 4
23 52 -38 72
-64 15 -59 -10
-75 43 10 25

Output
5 4 1
1 -9 10
-5210 4118 -2207 2979
-1980 -1753 -2067 -3106

Explanation

Self Explanatory
*/

import java.util.*;

public class productOfMatrices{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");

        int t = scanner.nextInt();

        while(t-->0)
        {
            System.out.println("Enter the rows of first matrix : ");
            int m1 = scanner.nextInt();

            System.out.println("Enter the columns of first matrix : ");
            int n1 = scanner.nextInt();

            int[][] mat1 = new int[m1][n1];

            System.out.println("Enter the matrix elements : ");
            for(int i=0; i<m1; i++)
            {
                for(int j=0; j<n1; j++)
                {
                    mat1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter the rows of second matrix : ");
            int m2 = scanner.nextInt();

            System.out.println("Enter the columns of second matrix : ");
            int n2 = scanner.nextInt();


            int[][] mat2 = new int[m2][n2];

            for(int i=0; i<m2; i++)
            {
                for(int j=0; j<n2; j++)
                {
                    mat2[i][j] = scanner.nextInt();
                }
            }

            int[][] result = new int[m1][n2];

            for(int i=0; i<n1; i++)
            {
                for(int j=0; j<n2; j++)
                {
                    for(int k=0; k<n1; k++)
                    {
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }

            System.out.println("The resultant matrix : ");

            for(int i=0; i<m1; i++)
            {
                for(int j=0; j<n2; j++)
                {
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}


// Time Complexity : O(N^3)
// Space Complexity : O(NM)

