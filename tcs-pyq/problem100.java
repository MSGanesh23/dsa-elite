//Reverse the order of words in a sentence.

import java.util.*;

public class problem100{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence : ");

        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1; i>=0; i--)
        {
            sb.append(words[i]);

            if(i>0)
            {
                sb.append(" ");
            }
        }

        System.out.println("Reversed Sentence : " + sb.toString());
    }
}


/*
# Problem Statement

**Reverse the order of words in a sentence.**

Example:

```text
Input:
I love Java

Output:
Java love I
```

---

# Core Logic

The program:

1. Takes a sentence as input.
2. Splits the sentence into individual words.
3. Traverses the words array from the last word to the first.
4. Appends each word into a `StringBuilder`.
5. Prints the newly formed sentence.

The words themselves are **not reversed**; only their **positions** are reversed.

---

# Step-by-Step Explanation

## 1. Read the Sentence

```java
String sentence = scanner.nextLine();
```

Example input:

```text
I love Java programming
```

---

## 2. Split the Sentence into Words

```java
String[] words = sentence.split(" ");
```

This creates an array:

```java
["I", "love", "Java", "programming"]
```

### Array Representation

| Index | Word        |
| ----- | ----------- |
| 0     | I           |
| 1     | love        |
| 2     | Java        |
| 3     | programming |

---

## 3. Create StringBuilder

```java
StringBuilder sb = new StringBuilder();
```

Used because repeated string concatenation is inefficient.

---

## 4. Traverse from End to Beginning

```java
for(int i=words.length-1; i>=0; i--)
```

For our example:

| Iteration | i | Word        |
| --------- | - | ----------- |
| 1         | 3 | programming |
| 2         | 2 | Java        |
| 3         | 1 | love        |
| 4         | 0 | I           |

---

## 5. Append Current Word

```java
sb.append(words[i]);
```

After each iteration:

```text
programming
programming Java
programming Java love
programming Java love I
```

---

## 6. Add Space Between Words

```java
if(i > 0)
{
    sb.append(" ");
}
```

This prevents an extra space at the end.

Without this condition:

```text
programming Java love I_
```

(extra trailing space)

---

## 7. Print Result

```java
System.out.println("Reversed Sentence : " + sb.toString());
```

Output:

```text
Reversed Sentence : programming Java love I
```

---

# Dry Run

### Input

```text
Hello World Java
```

### After Split

```java
words = ["Hello", "World", "Java"]
```

---

### Iteration 1

```java
i = 2
```

Append:

```text
Java
```

---

### Iteration 2

```java
i = 1
```

Append:

```text
Java World
```

---

### Iteration 3

```java
i = 0
```

Append:

```text
Java World Hello
```

---

### Output

```text
Java World Hello
```

---

# Time Complexity

Let:

* `n` = length of the sentence
* `w` = number of words

### Splitting

```java
sentence.split(" ");
```

Scans the entire string once:

```text
O(n)
```

---

### Reversing Words

```java
for(...)
```

Visits each word once:

```text
O(w)
```

---

### Total

```text
O(n)
```

Since `w ≤ n`, the overall complexity remains linear.

---

# Space Complexity

### Words Array

```java
String[] words
```

Stores all words:

```text
O(w)
```

---

### StringBuilder

Stores the reversed sentence:

```text
O(n)
```

---

### Total

```text
O(n)
```

---

# Algorithm Summary

1. Read sentence.
2. Split sentence into words.
3. Traverse words from last to first.
4. Append words into `StringBuilder`.
5. Print the reversed sentence.

---

# Final Complexity

| Metric           | Complexity |
| ---------------- | ---------- |
| Time Complexity  | **O(n)**   |
| Space Complexity | **O(n)**   |

### Key Java Concepts Used

* `Scanner`
* `nextLine()`
* `split()`
* Arrays
* Reverse traversal
* `StringBuilder`
* String manipulation

*/