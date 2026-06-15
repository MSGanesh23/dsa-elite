//Find the longest word in a sentence.

import java.util.*;

public class problem93{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longest = "";

        for(String w : words)
        {
            if(w.length()>longest.length())
            {
                longest = w;
            }
        }

        System.out.println("The longest word : " + longest);
    }
}


/*
# Problem Statement

**Find the longest word in a given sentence.**

### Example

```text
Input:
I love competitive programming

Output:
competitive
```

Because:

```text
I            -> length 1
love         -> length 4
competitive  -> length 11
programming  -> length 11
```

Since `competitive` appears first among the longest words, it is chosen.

---

# Core Logic

The algorithm maintains a variable called `longest`.

For every word in the sentence:

1. Compare its length with the current longest word.
2. If it is longer, update `longest`.
3. After checking all words, print `longest`.

This is a classic **linear search for the maximum**.

---

# Step-by-Step Explanation

## 1. Read the Sentence

```java
String sentence = scanner.nextLine();
```

Example:

```text
I love Java programming
```

---

## 2. Split into Words

```java
String[] words = sentence.split(" ");
```

Result:

```java
["I", "love", "Java", "programming"]
```

---

## 3. Initialize Longest Word

```java
String longest = "";
```

Initially:

```text
longest = ""
length = 0
```

---

## 4. Traverse Every Word

```java
for(String w : words)
```

Checks each word one by one.

---

## 5. Compare Lengths

```java
if(w.length() > longest.length())
```

If the current word is longer than the current longest word:

```java
longest = w;
```

---

# Dry Run

### Input

```text
I love Java programming
```

---

### Initial State

```text
longest = ""
```

---

### Iteration 1

```text
w = "I"
length = 1
```

Check:

```text
1 > 0
```

True

```text
longest = "I"
```

---

### Iteration 2

```text
w = "love"
length = 4
```

Check:

```text
4 > 1
```

True

```text
longest = "love"
```

---

### Iteration 3

```text
w = "Java"
length = 4
```

Check:

```text
4 > 4
```

False

```text
longest remains "love"
```

---

### Iteration 4

```text
w = "programming"
length = 11
```

Check:

```text
11 > 4
```

True

```text
longest = "programming"
```

---

### Output

```text
The longest word : programming
```

---

# Understanding the Time Complexity

Let:

```text
n = total number of characters in the sentence
```

Example:

```text
"I love Java programming"
```

Total characters ≈ 23

---

## Step 1: split()

```java
String[] words = sentence.split(" ");
```

Java must scan the entire sentence to find spaces.

Example:

```text
I _ l o v e _ J a v a _ p r o g r a m m i n g
```

Every character is checked once.

Cost:

```text
O(n)
```

---

## Step 2: Loop Through Words

```java
for(String w : words)
```

Suppose there are:

```text
k words
```

For each word:

```java
w.length()
```

In Java, `String.length()` is stored internally and returned instantly.

Cost:

```text
O(1)
```

So each iteration performs constant work.

Total:

```text
O(k)
```

---

## Combining Both

```text
split()      -> O(n)
loop         -> O(k)
```

Since:

```text
k ≤ n
```

Overall:

```text
O(n + k)
=
O(n)
```

---

# Why Not O(n²)?

Many beginners think:

```java
for(String w : words)
```

means nested processing.

But there is only **one loop**.

Each word is visited once.

No word is compared with every other word.

Therefore:

```text
O(n)
```

not

```text
O(n²)
```

---

# Space Complexity

## Array Created by split()

```java
String[] words = sentence.split(" ");
```

Stores all words separately.

Example:

```java
["I", "love", "Java", "programming"]
```

Requires memory proportional to the input.

Space:

```text
O(n)
```

---

## Variable longest

```java
String longest
```

Only stores one reference.

Space:

```text
O(1)
```

---

## Total Space Complexity

Dominated by the words array:

```text
O(n)
```

---

# What Happens in a Tie?

Example:

```text
Input:
cat dog sun
```

All lengths:

```text
3
```

Condition:

```java
if(w.length() > longest.length())
```

Notice:

```text
>
```

not

```text
>=
```

Therefore the first longest word remains selected.

Output:

```text
cat
```

---

# Algorithm Summary

1. Read sentence.
2. Split into words.
3. Keep track of the current longest word.
4. Compare lengths of each word.
5. Update when a longer word is found.
6. Print the final longest word.

---

# Final Complexity

| Metric           | Complexity |
| ---------------- | ---------- |
| Time Complexity  | **O(n)**   |
| Space Complexity | **O(n)**   |

### Key Java Concepts Used

* `nextLine()`
* `split()`
* Enhanced for-loop
* `String.length()`
* Linear search
* Maximum element tracking

### Interview Explanation

> The sentence is first split into words, which takes **O(n)** time because every character is scanned once. Then each word is visited once to compare lengths, taking **O(k)** where `k` is the number of words. Since `k ≤ n`, the overall time complexity is **O(n)**. The `split()` method creates an array of words, so the space complexity is **O(n)**.

*/