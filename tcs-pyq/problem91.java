//Remove all characters from s1 that are present in s2.

import java.util.*;

public class problem91{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string : ");

        String s1 = scanner.nextLine();
        
        System.out.println("Enter the second string : ");

        String s2 = scanner.nextLine();

        HashSet<Character> toRemove = new HashSet<>();

        for(char c : s2.toCharArray())
        {
            toRemove.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for(char c : s1.toCharArray())
        {
            if(!toRemove.contains(c))
            {
                sb.append(c);
            }
        }

        System.out.println("The resultant string : " + sb.toString());


    }
}

/*
# Problem Statement

**Remove all characters from `s1` that are present in `s2`.**

### Example

```text
s1 = computer
s2 = cat

Output:
ompuer
```

Explanation:

Characters in `s2`:

```text
c, a, t
```

Remove them from `s1`:

```text
computer
↓ remove c and t
ompuer
```

---

# Core Logic

The algorithm uses a **HashSet** for fast lookups.

### Steps

1. Store all characters of `s2` in a `HashSet`.
2. Traverse every character of `s1`.
3. Check whether the character exists in the set.
4. If not present, append it to the result.
5. Print the final string.

The key advantage is that **HashSet lookup is O(1)** on average.

---

# Step-by-Step Explanation

## 1. Read Input Strings

```java
String s1 = scanner.nextLine();
String s2 = scanner.nextLine();
```

Example:

```text
s1 = computer
s2 = cat
```

---

## 2. Create HashSet

```java
HashSet<Character> toRemove = new HashSet<>();
```

Purpose:

Store all characters that must be removed.

Initially:

```text
{}
```

---

## 3. Insert Characters of s2

```java
for(char c : s2.toCharArray())
{
    toRemove.add(c);
}
```

For:

```text
cat
```

Iterations:

### Iteration 1

```text
c
```

Set:

```text
{c}
```

---

### Iteration 2

```text
a
```

Set:

```text
{c,a}
```

---

### Iteration 3

```text
t
```

Set:

```text
{c,a,t}
```

Final set:

```text
{c,a,t}
```

---

## 4. Create Result StringBuilder

```java
StringBuilder sb = new StringBuilder();
```

Stores characters that survive.

Initially:

```text
""
```

---

## 5. Traverse s1

```java
for(char c : s1.toCharArray())
```

For:

```text
computer
```

Characters:

```text
c o m p u t e r
```

---

## 6. Check Membership

```java
if(!toRemove.contains(c))
```

### Character: c

```text
contains(c) = true
```

Skip.

Result:

```text
""
```

---

### Character: o

```text
contains(o) = false
```

Append.

Result:

```text
"o"
```

---

### Character: m

Append.

Result:

```text
"om"
```

---

### Character: p

Append.

Result:

```text
"omp"
```

---

### Character: u

Append.

Result:

```text
"ompu"
```

---

### Character: t

Present in set.

Skip.

Result:

```text
"ompu"
```

---

### Character: e

Append.

Result:

```text
"ompue"
```

---

### Character: r

Append.

Result:

```text
"ompuer"
```

---

## 7. Print Result

```java
System.out.println(sb.toString());
```

Output:

```text
ompuer
```

---

# Dry Run

### Input

```text
s1 = banana
s2 = an
```

Set:

```text
{a,n}
```

Process characters:

| Character | In Set? | Result |
| --------- | ------- | ------ |
| b         | No      | b      |
| a         | Yes     | b      |
| n         | Yes     | b      |
| a         | Yes     | b      |
| n         | Yes     | b      |
| a         | Yes     | b      |

Output:

```text
b
```

---

# Understanding the Time Complexity

Let:

* `n = length of s1`
* `m = length of s2`

---

## Loop 1: Build HashSet

```java
for(char c : s2.toCharArray())
```

Runs `m` times.

Each insertion:

```java
toRemove.add(c)
```

Average complexity:

```text
O(1)
```

Total:

```text
O(m)
```

---

## Loop 2: Process s1

```java
for(char c : s1.toCharArray())
```

Runs `n` times.

For each character:

```java
toRemove.contains(c)
```

Average complexity:

```text
O(1)
```

Append operation:

```java
sb.append(c)
```

Also:

```text
O(1)
```

Therefore:

```text
n × O(1)
=
O(n)
```

---

## Total Time Complexity

```text
O(m) + O(n)
```

Final:

```text
O(n + m)
```

---

# Why Not O(n × m)?

Without a HashSet, we might do:

```java
for(each char in s1)
{
    search entire s2
}
```

Complexity:

```text
O(n × m)
```

Example:

```text
s1 length = 1000
s2 length = 1000

1000 × 1000
=
1,000,000 operations
```

Using HashSet:

```text
1000 + 1000
=
2000 operations
```

Much faster.

---

# Space Complexity

## HashSet

Stores characters from `s2`.

Worst case:

```text
m unique characters
```

Space:

```text
O(m)
```

---

## StringBuilder

Can store up to all characters of `s1`.

Space:

```text
O(n)
```

---

## Total Space

```text
O(n + m)
```

---

# Algorithm Summary

1. Store all characters of `s2` in a `HashSet`.
2. Traverse every character of `s1`.
3. If the character is not in the set:

   * append to result.
4. Print the final string.

---

# Final Complexity

| Metric           | Complexity   |
| ---------------- | ------------ |
| Time Complexity  | **O(n + m)** |
| Space Complexity | **O(n + m)** |

Where:

* `n` = length of `s1`
* `m` = length of `s2`

### Key Java Concepts Used

* `HashSet`
* Fast membership lookup (`contains`)
* `StringBuilder`
* Character arrays (`toCharArray`)
* Filtering characters
* Hashing

### Interview Explanation

> First, all characters of `s2` are inserted into a `HashSet`, which takes **O(m)** time. Then every character of `s1` is checked against the set in **O(1)** average time and appended if not present, taking **O(n)** time. Therefore, the overall time complexity is **O(n + m)** and the space complexity is **O(n + m)**.

*/