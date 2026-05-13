/*
Interleavings
Given 2 strings A and B, print all the interleavings of the 2 strings. An interleaved string of given two strings preserves the order of characters in individual strings and uses all the characters of both the strings. For simplicity, you can assume that the strings have unique characters.

Input Format
The first line of input contains T - the number of test cases. It's followed by T lines, each containing 2 space-separated strings A and B.

Output Format
For each test case, print the test case number, followed by the interleavings of the 2 strings in a sorted order, separated by a new line.

Constraints
1 <= T <= 100
'a' <= A[i], B[i] <= 'z'
1 <= len(A), len(B) <= 10

Example
Input
2
nkb gl
bn zh

Output
Case #1:
glnkb
gnkbl
gnklb
gnlkb
ngkbl
ngklb
nglkb
nkbgl
nkgbl
nkglb
Case #2:
bnzh
bzhn
bznh
zbhn
zbnh
zhbn

Explanation

Self Explanatory
*/

import java.util.*;

public class Interleavings{

    static List<String> result = new ArrayList<>();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");

        int T = scanner.nextInt();

        for(int t=1; t<=T; t++)
        {
            System.out.println("Test Case : #" + t);

            result = new ArrayList<>();

            String a = scanner.next();
            String b = scanner.next();

            StringBuilder path = new StringBuilder();

            backTrack(a,b,0,0,path);

            Collections.sort(result);

            for(String s : result)
            {
                System.out.println(s);
            }

        }

    }

    static void backTrack(String a, String b, int i, int j, StringBuilder path)
    {
        if(i==a.length() && j==b.length())
        {
            result.add(path.toString());
            return;
        }

        if(i<a.length())
        {
            path.append(a.charAt(i));
            backTrack(a,b,i+1,j,path);
            path.deleteCharAt(path.length()-1);
        }

        if(j<b.length())
        {
            path.append(b.charAt(j));
            backTrack(a,b,i,j+1,path);
            path.deleteCharAt(path.length()-1);
        }
    }
}