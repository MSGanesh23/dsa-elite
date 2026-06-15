//Replace every letter with the next letter in alphabet (z wraps to a).

import java.util.*;

public class problem92{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = scanner.next();

        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray())
        {
            char base;
            if(Character.isLetter(c))
            {
            
            if(Character.isUpperCase(c))
            {
                base = 'A';
            }
            else
            {
               base = 'a';
            }

            sb.append((char)(base + (c-base+1)%26));
            }
            else
            {
                sb.append(c);
            }

            
        }

        System.out.println(sb.toString());
    }
}

/*
# Problem Statement

For every alphabet character in the string, replace it with the **next alphabet letter**.

Rules:

```text
a → b
b → c
...
y → z
z → a

A → B
B → C
...
Z → A
```

Non-alphabet characters remain unchanged.

---

# Core Logic

The program uses **character arithmetic** and **modulo (%)** to move each letter one position forward in the alphabet.

Key idea:

```java
(c - base + 1) % 26
```

* Find the letter's position in the alphabet.
* Add 1 to move to the next letter.
* `% 26` handles wrapping:

  * `z → a`
  * `Z → A`

---

# Step-by-Step Explanation

## 1. Read Input

```java
String s = new Scanner(System.in).next();
```

Example:

```text
abcXYZ
```

Stored as:

```java
s = "abcXYZ";
```

---

## 2. Create StringBuilder

```java
StringBuilder sb = new StringBuilder();
```

Used to efficiently build the result string.

---

## 3. Traverse Each Character

```java
for(char c : s.toCharArray())
```

Example:

```text
a b c X Y Z
```

Each character is processed one by one.

---

## 4. Check Whether Character is a Letter

```java
if(Character.isLetter(c))
```

Examples:

```text
a → true
Z → true
5 → false
@ → false
```

Only letters are modified.

---

## 5. Determine Alphabet Base

```java
char base = Character.isUpperCase(c) ? 'A' : 'a';
```

### Examples

For:

```text
D
```

base:

```text
'A'
```

For:

```text
k
```

base:

```text
'a'
```

This allows uppercase and lowercase letters to be handled separately.

---

## 6. Calculate Next Alphabet

```java
(base + (c - base + 1) % 26)
```

Let's break this down.

---

### Example 1: 'c'

#### Step 1

```java
c - base
```

```text
'c' - 'a'
=
2
```

Position in alphabet:

```text
a=0
b=1
c=2
```

---

#### Step 2

```java
2 + 1
=
3
```

Move to next position.

---

#### Step 3

```java
3 % 26
=
3
```

Still inside alphabet range.

---

#### Step 4

```java
'a' + 3
=
'd'
```

Result:

```text
c → d
```

---

### Example 2: 'z'

#### Step 1

```java
'z' - 'a'
=
25
```

---

#### Step 2

```java
25 + 1
=
26
```

---

#### Step 3

```java
26 % 26
=
0
```

Wrap around.

---

#### Step 4

```java
'a' + 0
=
'a'
```

Result:

```text
z → a
```

---

### Example 3: 'Z'

```java
base = 'A'
```

Calculation:

```text
('Z' - 'A' + 1) % 26
=
26 % 26
=
0
```

```text
'A' + 0
=
'A'
```

Result:

```text
Z → A
```

---

## 7. Append Result

```java
sb.append(...)
```

Adds the transformed character to the result string.

---

## 8. Non-Letters

```java
else sb.append(c);
```

Characters such as:

```text
1
@
#
_
```

remain unchanged.

Example:

```text
a1z
```

becomes:

```text
b1a
```

---

## 9. Print Result

```java
System.out.println(sb);
```

Example:

```text
Input:
abcXYZ

Output:
bcdYZA
```

---

# Dry Run

### Input

```text
Az9
```

---

### Character 1

```text
A
```

```text
A → B
```

Result:

```text
B
```

---

### Character 2

```text
z
```

```text
z → a
```

Result:

```text
Ba
```

---

### Character 3

```text
9
```

Not a letter.

Result:

```text
Ba9
```

---

### Output

```text
Ba9
```

---

# Time Complexity

Let:

```text
n = length of input string
```

Loop:

```java
for(char c : s.toCharArray())
```

runs once for every character.

Inside the loop:

* `isLetter()`
* `isUpperCase()`
* arithmetic operations
* `append()`

all take constant time:

```text
O(1)
```

per character.

Therefore:

```text
n × O(1)
=
O(n)
```

### Final Time Complexity

```text
O(n)
```

---

# Space Complexity

The `StringBuilder` stores the resulting string.

If input length is `n`:

```text
Result size = n
```

Extra memory:

```text
O(n)
```

---

# Algorithm Summary

1. Read the string.
2. Process each character:

   * If alphabet:

     * Determine whether uppercase/lowercase.
     * Move to next alphabet using modulo arithmetic.
   * Otherwise keep unchanged.
3. Append to `StringBuilder`.
4. Print result.

---

# Final Complexity

| Metric           | Complexity |
| ---------------- | ---------- |
| Time Complexity  | **O(n)**   |
| Space Complexity | **O(n)**   |

### Key Concepts Used

* Character arithmetic
* ASCII/Unicode values
* Modulo operator (`%`)
* Wrap-around logic (`z → a`)
* Ternary operator (`?:`)
* `Character.isLetter()`
* `Character.isUpperCase()`
* `StringBuilder`

### Interview Explanation

> The algorithm scans the string once and performs constant-time operations for each character. Therefore, the time complexity is **O(n)**. A `StringBuilder` is used to store the transformed string, requiring **O(n)** extra space. The modulo operation ensures that `z` wraps to `a` and `Z` wraps to `A`.

*/