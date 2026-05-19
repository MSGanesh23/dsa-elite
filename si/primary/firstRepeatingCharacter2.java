/*
First Repeating Character - 2
Given a string of characters, find the first repeating character.

Input Format
The first line of input contains T - the number of test cases. It's followed by T lines, each line contains a single string of characters.

Output Format
For each test case, print the first repeating character, separated by a new line. If there are none, print '.'.

Constraints
1 <= T <= 1000
'a' <= str[i] <= 'z'
1 <= len(str) <= 104

Example
Input
4
datastructures
algorithms
smartinterviews
hackerrank

Output
a
.
t
r

Explanation

Self Explanatory
*/

import java.util.*;

public class firstRepeatingCharacter2{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");

        int t = scanner.nextInt();

        while(t-->0)
        {
            System.out.println("Enter the string : ");

            String s = scanner.next();

            HashSet<Character> hs = new HashSet<>();

            boolean found = false;

            for(char c : s.toCharArray())
            {
                if(hs.contains(c))
                {
                    found = true;
                    System.out.println(c);
                    break;
                }
                else
                {
                hs.add(c);
                }
            }

            if(!found)
            {
                System.out.println(".");
            }
        }
    }
}

// Time Complexity : O(N) - n is the number of characters in the string 
// Space Complexity : O(N) - for the hashset

/*
Note:
What is a “First Repeating Character”?

It means:

The first character that appears again while scanning from left to right.

Example:

abccbd

Traversal:

Character	Seen Before?
a	No
b	No
c	No
c	Yes ← first repeating

Output:

c


Create HashSet
HashSet<Character> hs = new HashSet<>();

A HashSet stores unique characters.

Important property:

Fast lookup
No duplicates allowed
Boolean Flag
boolean found = false;

Used to track whether a repeating character was found.

Convert String to Character Array
for(char c : s.toCharArray())

toCharArray() converts string into array of characters.

Example:

"abc"
→ ['a', 'b', 'c']

Enhanced for-loop checks each character one by one.

Main Logic
if(hs.contains(c))

Checks:

“Have we already seen this character?”

If Character Already Exists
found = true;
System.out.println(c);
break;
Character repeats
Print it
Stop loop immediately
Otherwise
hs.add(c);

Store character in HashSet.

If No Repeating Character
if(!found)
{
    System.out.println(".");
}

If loop finishes without finding repetition:

Print:

.
Example Walkthrough

Input:

abca
Step 1

Character:

a

HashSet:

[a]
Step 2

Character:

b

HashSet:

[a, b]
Step 3

Character:

c

HashSet:

[a, b, c]
Step 4

Character:

a

Already exists in HashSet.

Output:

a

Loop stops.

Example 2

Input:

abc

Traversal:

a → add
b → add
c → add

No repeats found.

Output:

.
*/