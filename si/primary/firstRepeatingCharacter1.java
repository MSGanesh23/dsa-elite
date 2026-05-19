/*
First Repeating Character - 1
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
s
a

Explanation

Self Explanatory
*/

import java.util.*;

public class firstRepeatingCharacter1{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");

        int t = scanner.nextInt();

        while(t-->0)
        {
            System.out.println("Enter the string : ");

            String s = scanner.next();

            LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

            for(char c : s.toCharArray())
            {
                hm.put(c, hm.getOrDefault(c,0)+1);
            }

            boolean found = false;

            for(Map.Entry<Character, Integer> e : hm.entrySet())
            {
                if(e.getValue()>1)
                {
                    found = true;
                    System.out.println(e.getKey());
                    break;

                }
            }

            if(!found)
            {
                System.out.println(".");
            }
        }
    }
}

// Time Complexity : O(N)
// Space Complexity : O(N) - here n is the size of the string

/*

## Core Logic

This program finds the **first repeating character** in a string for multiple test cases.

A character is considered repeating if its frequency is greater than `1`.

The program uses a `LinkedHashMap` because:

* It stores character frequencies
* It maintains the insertion order of characters

That helps in identifying the **first repeating character** correctly.

---

# Step-by-Step Explanation

## 1. Read Number of Test Cases

```java
int t = scanner.nextInt();
```

The user enters how many strings need to be tested.

---

## 2. Process Each String

```java
while(t-->0)
```

Runs the loop `t` times.

---

## 3. Read Input String

```java
String s = scanner.next();
```

Example:

```text
aabccd
```

---

## 4. Store Frequency of Characters

```java
LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
```

This map stores:

| Character | Frequency |
| --------- | --------- |
| a         | 2         |
| b         | 1         |
| c         | 2         |
| d         | 1         |

---

### Frequency Counting Loop

```java
for(char c : s.toCharArray())
{
    hm.put(c, hm.getOrDefault(c,0)+1);
}
```

### How it works

For every character:

* If already present → increase count
* Else → start count at 1

Example for `"aabccd"`:

| Step | Character | Map               |
| ---- | --------- | ----------------- |
| 1    | a         | {a=1}             |
| 2    | a         | {a=2}             |
| 3    | b         | {a=2,b=1}         |
| 4    | c         | {a=2,b=1,c=1}     |
| 5    | c         | {a=2,b=1,c=2}     |
| 6    | d         | {a=2,b=1,c=2,d=1} |

---

## 5. Find First Repeating Character

```java
for(Map.Entry<Character, Integer> e : hm.entrySet())
```

Since `LinkedHashMap` preserves insertion order, traversal happens in the same order characters appeared.

---

### Check Frequency

```java
if(e.getValue()>1)
```

If frequency > 1:

* print character
* stop searching

Example:

* `a → 2`
* first repeating character = `a`

---

## 6. If No Repeating Character Exists

```java
if(!found)
{
    System.out.println(".");
}
```

Example:

```text
abcd
```

Output:

```text
.
```

---

# Why LinkedHashMap?

A normal `HashMap` does NOT maintain order.

Example:

```text
Input: aabccd
```

You need the **first** repeating character.

`LinkedHashMap` preserves insertion order, making it perfect here.

---

# Time Complexity

Let:

* `n` = length of the string

## Frequency Counting

```java
for(char c : s.toCharArray())
```

Runs `n` times.

Complexity:

```text
O(n)
```

---

## Searching First Repeating Character

```java
for(Map.Entry<Character, Integer> e : hm.entrySet())
```

In worst case, traverses all unique characters.

Worst case:

```text
O(n)
```

---

# Total Time Complexity

```text
O(n)
```

for each test case.

---

# Space Complexity

The map stores character frequencies.

In worst case:

* all characters are unique

Space used:

```text
O(n)
```

---

# Example Dry Run

## Input

```text
1
swiss
```

---

## Frequency Map

```text
s → 3
w → 1
i → 1
```

Insertion order:

```text
s, w, i
```

---

## Traversal

* s → 3 → repeating

Output:

```text
s
```

---

# Key Concepts Used

* `LinkedHashMap`
* Frequency counting
* `getOrDefault()`
* Enhanced for loop
* Map traversal using `entrySet()`

---

# Final Complexity

| Complexity Type  | Value |
| ---------------- | ----- |
| Time Complexity  | O(n)  |
| Space Complexity | O(n)  |

*/