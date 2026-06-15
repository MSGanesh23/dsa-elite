//Toggle the case of each character (uppercase to lowercase and vice versa).

//Let us use the bit wise method

import java.util.*;

public class problem97{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String s = scanner.nextLine();

        char[] arr = s.toCharArray();

        for(int i=0; i<arr.lengthc; i++)
        {
            arr[i] = (char)(arr[i]^32);
        }

        System.out.println("Resultant String : " + new String(arr));
    }
}

/*
## Problem Statement

**Toggle the case of each character in a string**:

* Uppercase → Lowercase
* Lowercase → Uppercase

The code uses a **bitwise XOR operation** instead of built-in methods like `Character.toUpperCase()` or `Character.toLowerCase()`.

---

## Note: There is a Typo

Your code contains:

```java
for(int i=0; i<arr.lengthc; i++)
```

It should be:

```java
for(int i=0; i<arr.length; i++)
```

Otherwise, the code will not compile.

---

## Core Logic

The solution exploits the ASCII representation of letters.

### ASCII Values

| Character | ASCII |
| --------- | ----- |
| A         | 65    |
| B         | 66    |
| ...       | ...   |
| Z         | 90    |
| a         | 97    |
| b         | 98    |
| ...       | ...   |
| z         | 122   |

Observe:

```text
A = 65  = 01000001
a = 97  = 01100001
```

Difference:

```text
32 = 00100000
```

The **6th bit** distinguishes uppercase from lowercase letters.

Therefore:

```java
c ^ 32
```

toggles that bit:

* Uppercase → Lowercase
* Lowercase → Uppercase

---

## Step-by-Step Explanation

### 1. Read Input String

```java
String s = scanner.nextLine();
```

Example:

```text
Hello
```

---

### 2. Convert String to Character Array

```java
char[] arr = s.toCharArray();
```

Array:

```text
['H','e','l','l','o']
```

---

### 3. Traverse Every Character

```java
for(int i=0; i<arr.length; i++)
```

Process each character one by one.

---

### 4. Toggle Case Using XOR

```java
arr[i] = (char)(arr[i] ^ 32);
```

#### Example 1: Uppercase → Lowercase

```text
H = 72
```

Binary:

```text
72 = 01001000
32 = 00100000
```

XOR:

```text
01001000
00100000
---------
01101000
```

Result:

```text
104 = 'h'
```

---

#### Example 2: Lowercase → Uppercase

```text
e = 101
```

Binary:

```text
101 = 01100101
 32 = 00100000
```

XOR:

```text
01100101
00100000
---------
01000101
```

Result:

```text
69 = 'E'
```

---

### 5. Create New String

```java
new String(arr)
```

Converts the modified character array back into a string.

---

### 6. Print Result

```java
System.out.println("Resultant String : " + new String(arr));
```

Output:

```text
hELLO
```

---

# Dry Run

### Input

```text
AbCdE
```

### Character Transformations

| Original | XOR 32   | Result |
| -------- | -------- | ------ |
| A        | 65 ^ 32  | a      |
| b        | 98 ^ 32  | B      |
| C        | 67 ^ 32  | c      |
| d        | 100 ^ 32 | D      |
| E        | 69 ^ 32  | e      |

Result:

```text
aBcDe
```

---

## Important Limitation

This trick works correctly **only for English alphabet letters (A-Z, a-z)**.

### Example

```text
'1' ^ 32
```

does not produce a meaningful case conversion.

Similarly:

```text
'@'
'#'
' '
```

will become different symbols.

For example:

```text
' ' (space) = 32

32 ^ 32 = 0
```

which becomes a null character.

### Safer Version

```java
if(arr[i] >= 'A' && arr[i] <= 'Z' ||
   arr[i] >= 'a' && arr[i] <= 'z')
{
    arr[i] = (char)(arr[i] ^ 32);
}
```

This toggles only alphabetic characters.

---

## Time Complexity

Let `n` be the length of the string.

Loop:

```java
for(int i=0; i<arr.length; i++)
```

runs once per character.

### Time Complexity

```text
O(n)
```

---

## Space Complexity

Character array:

```java
char[] arr = s.toCharArray();
```

stores all characters.

### Space Complexity

```text
O(n)
```

---

## Algorithm Summary

1. Convert string to character array.
2. Traverse each character.
3. XOR with `32`.
4. Convert array back to string.
5. Print the result.

---

## Final Complexity

| Metric           | Complexity |
| ---------------- | ---------- |
| Time Complexity  | **O(n)**   |
| Space Complexity | **O(n)**   |

### Key Concepts Used

* ASCII encoding
* Bitwise XOR (`^`)
* Character arrays
* String manipulation
* Case conversion using bit operations

**Key Insight:** In ASCII, uppercase and lowercase versions of the same letter differ only by the bit represented by decimal `32`, so XORing with `32` flips the case.

*/