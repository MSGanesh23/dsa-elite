//Sort characters of a string in alphabetical order.

import java.util.*;

public class problem94{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = scanner.next();

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        System.out.println("Sorted String : " + new String(arr));
    }
}

/*
# Problem Statement

**Sort all characters of a string in alphabetical order.**

### Example

```text
Input:
dcba

Output:
abcd
```

---

# Core Logic

The program:

1. Reads a string.
2. Converts it into a character array.
3. Sorts the character array using `Arrays.sort()`.
4. Converts the sorted array back into a string.
5. Prints the result.

The actual sorting work is done by Java's built-in:

```java
Arrays.sort(arr);
```

---

# Step-by-Step Explanation

## 1. Read Input

```java
String str = scanner.next();
```

Example:

```text
dcba
```

Stored as:

```java
str = "dcba";
```

---

## 2. Convert String to Character Array

```java
char[] arr = str.toCharArray();
```

Result:

```java
['d', 'c', 'b', 'a']
```

Array representation:

| Index | Value |
| ----- | ----- |
| 0     | d     |
| 1     | c     |
| 2     | b     |
| 3     | a     |

---

## 3. Sort the Array

```java
Arrays.sort(arr);
```

Characters are sorted according to their ASCII/Unicode values.

Before sorting:

```text
d c b a
```

After sorting:

```text
a b c d
```

Array becomes:

```java
['a', 'b', 'c', 'd']
```

---

## 4. Convert Back to String

```java
new String(arr)
```

Creates:

```java
"abcd"
```

---

## 5. Print Result

```java
System.out.println("Sorted String : " + new String(arr));
```

Output:

```text
Sorted String : abcd
```

---

# Dry Run

### Input

```text
program
```

### Character Array

```java
['p','r','o','g','r','a','m']
```

### After Sorting

```java
['a','g','m','o','p','r','r']
```

### Output

```text
agmoprr
```

---

# How `Arrays.sort()` Works

For primitive arrays (`char[]`, `int[]`, etc.), Java uses an optimized sorting algorithm called **Dual-Pivot Quicksort**.

Conceptually:

```text
Input:
d c b a

Choose pivots
Partition elements
Recursively sort smaller parts

Result:
a b c d
```

You don't need to implement sorting manually because Java provides an optimized implementation.

---

# Time Complexity

Let:

```text
n = length of the string
```

### Conversion to Character Array

```java
str.toCharArray()
```

Copies every character once.

Time:

```text
O(n)
```

---

### Sorting

```java
Arrays.sort(arr)
```

Sorting `n` characters requires:

```text
O(n log n)
```

comparisons in average and worst cases for Java's primitive sorting implementation.

---

### Creating New String

```java
new String(arr)
```

Copies all characters.

Time:

```text
O(n)
```

---

## Total Time Complexity

```text
O(n) + O(n log n) + O(n)
```

The dominant term is:

```text
O(n log n)
```

### Final Time Complexity

```text
O(n log n)
```

---

# Why O(n log n)?

Example:

```text
n = 8
```

Sorting roughly performs:

```text
8 × log₂8
=
8 × 3
=
24
```

operations.

For:

```text
n = 1024
```

```text
1024 × log₂1024
=
1024 × 10
=
10240
```

Hence:

```text
O(n log n)
```

---

# Space Complexity

### Character Array

```java
char[] arr = str.toCharArray();
```

Stores all characters.

Space:

```text
O(n)
```

---

### Sorting

Java's Dual-Pivot Quicksort uses recursion internally.

Additional stack space:

```text
O(log n)
```

---

### Total Space Complexity

Dominated by the character array:

```text
O(n)
```

---

# Example Cases

### Case 1

```text
Input:
dcba

Output:
abcd
```

---

### Case 2

```text
Input:
banana

Output:
aaabnn
```

---

### Case 3

```text
Input:
zyxwv

Output:
vwxyz
```

---

### Case 4 (Mixed Case)

```text
Input:
BaCa
```

Output:

```text
BCaa
```

Because ASCII ordering is:

```text
A-Z before a-z
```

---

# Algorithm Summary

1. Read string.
2. Convert to character array.
3. Sort the array.
4. Convert array back to string.
5. Print result.

---

# Final Complexity

| Metric           | Complexity     |
| ---------------- | -------------- |
| Time Complexity  | **O(n log n)** |
| Space Complexity | **O(n)**       |

### Key Java Concepts Used

* `toCharArray()`
* `Arrays.sort()`
* Character arrays
* String conversion
* Sorting algorithms
* ASCII/Unicode ordering

### Interview Explanation

> The string is first converted into a character array. Java's `Arrays.sort()` sorts the characters in `O(n log n)` time. Finally, the sorted array is converted back to a string. Therefore, the overall time complexity is **O(n log n)** and the space complexity is **O(n)**.

*/