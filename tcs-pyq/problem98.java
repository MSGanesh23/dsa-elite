//Concatenate two strings without using built-in concatenation.

import java.util.*;

public class problem98{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string : ");

        String str1 = scanner.nextLine();

        System.out.println("Enter the second string : ");

        String str2 = scanner.nextLine();

        char[] result = new char[str1.length() + str2.length()];

        int i = 0;

        for(char c : str1.toCharArray())
        {
            result[i++] = c;
        }

        for(char c : str2.toCharArray())
        {
            result[i++] = c;
        }

        System.out.println("Concatenated String : " + new String(result));
    }
}

/*
# Problem Statement

**Concatenate two strings without using built-in concatenation operators (`+`) or methods like `concat()`.**

Example:

```text
Input:
str1 = Hello
str2 = World

Output:
HelloWorld
```

---

# Core Logic

The idea is to manually create a new character array large enough to hold both strings and then copy the characters of each string into it.

Steps:

1. Create a character array of size `str1.length() + str2.length()`.
2. Copy all characters of `str1` into the array.
3. Copy all characters of `str2` immediately after them.
4. Convert the character array back to a String.

This mimics how string concatenation works internally.

---

# Step-by-Step Explanation

## 1. Read Both Strings

```java
String str1 = scanner.nextLine();
String str2 = scanner.nextLine();
```

Example:

```text
str1 = "Hello"
str2 = "Java"
```

---

## 2. Create Result Array

```java
char[] result = new char[str1.length() + str2.length()];
```

Length calculation:

```text
Hello → 5
Java  → 4

Total → 9
```

Array:

```text
[_, _, _, _, _, _, _, _, _]
```

---

## 3. Initialize Index Variable

```java
int i = 0;
```

This keeps track of the next available position in the result array.

---

## 4. Copy First String

```java
for(char c : str1.toCharArray())
{
    result[i++] = c;
}
```

### Iterations

| Character | Position |
| --------- | -------- |
| H         | 0        |
| e         | 1        |
| l         | 2        |
| l         | 3        |
| o         | 4        |

Array becomes:

```text
[H,e,l,l,o,_,_,_,_]
```

`i = 5`

---

## 5. Copy Second String

```java
for(char c : str2.toCharArray())
{
    result[i++] = c;
}
```

### Iterations

| Character | Position |
| --------- | -------- |
| J         | 5        |
| a         | 6        |
| v         | 7        |
| a         | 8        |

Array becomes:

```text
[H,e,l,l,o,J,a,v,a]
```

---

## 6. Convert Character Array to String

```java
new String(result)
```

Creates:

```text
HelloJava
```

---

## 7. Print Result

```java
System.out.println("Concatenated String : " + new String(result));
```

Output:

```text
Concatenated String : HelloJava
```

---

# Dry Run

### Input

```text
str1 = Code
str2 = Chef
```

---

### Result Array Size

```text
4 + 4 = 8
```

```text
[_,_,_,_,_,_,_,_]
```

---

### After Copying str1

```text
[C,o,d,e,_,_,_,_]
```

---

### After Copying str2

```text
[C,o,d,e,C,h,e,f]
```

---

### Output

```text
CodeChef
```

---

# Why This Works

Strings in Java are immutable (cannot be modified after creation).

Instead of modifying `str1`, we:

1. Allocate new memory (`char[] result`)
2. Copy characters from both strings
3. Create a new String from that array

This is exactly the concept behind manual string concatenation.

---

# Time Complexity

Let:

* `n = str1.length()`
* `m = str2.length()`

### First Loop

```java
for(char c : str1.toCharArray())
```

Runs `n` times.

Complexity:

```text
O(n)
```

---

### Second Loop

```java
for(char c : str2.toCharArray())
```

Runs `m` times.

Complexity:

```text
O(m)
```

---

### Total

```text
O(n + m)
```

Every character is copied exactly once.

---

# Space Complexity

Result array size:

```java
char[] result = new char[n + m];
```

Requires:

```text
O(n + m)
```

additional space.

---

# Algorithm Summary

1. Read two strings.
2. Create a character array of combined length.
3. Copy first string characters into the array.
4. Copy second string characters after them.
5. Convert array to String.
6. Print the concatenated result.

---

# Final Complexity

| Metric           | Complexity   |
| ---------------- | ------------ |
| Time Complexity  | **O(n + m)** |
| Space Complexity | **O(n + m)** |

### Key Java Concepts Used

* `char[]`
* Enhanced for loop (`for-each`)
* `toCharArray()`
* Manual array copying
* `new String(char[])`
* String immutability

*/