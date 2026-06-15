//Find the word that has the highest count of any repeated letter.

import java.util.*;

public class problem96{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        int max = 0;

        String best = "";

        for(String w : words)
        {
            int[] freq = new int[256];

            for(char c : w.toCharArray()) 
            {
                freq[c]++;
            }


            int localMax = 0;

            for(int f : freq) 
            {
                localMax = Math.max(localMax, f);
            }

            if(localMax>max)
            {
                max = localMax;
                best = w;

            }
        }

        System.out.println("The resultant string : " + best);
    }
}

/*
# Problem Statement

Given a sentence, find the **word that contains the highest repetition of any single letter**.

### Example

```text
Input:
apple committee banana

Output:
committee
```

Why?

```text
apple      -> p appears 2 times
committee  -> m appears 2 times, t appears 2 times, e appears 2 times
banana     -> a appears 3 times
```

Actually, in this example `banana` would win because the highest repeated letter count is **3** (`a` occurs 3 times).

The program selects the word whose **most frequent character** occurs the maximum number of times.

---

# Core Logic

For every word:

1. Count the frequency of each character.
2. Find the maximum frequency within that word.
3. Compare it with the global maximum seen so far.
4. If larger, update the answer.

Finally, print the word having the highest repeated-letter count.

---

# Step-by-Step Explanation

## 1. Read the Sentence

```java
String sentence = scanner.nextLine();
```

Example:

```text
hello banana committee
```

---

## 2. Split Into Words

```java
String[] words = sentence.split(" ");
```

Result:

```java
["hello", "banana", "committee"]
```

---

## 3. Initialize Global Variables

```java
int max = 0;
String best = "";
```

* `max` → highest repetition count found so far.
* `best` → corresponding word.

---

## 4. Process Each Word

```java
for(String w : words)
```

Processes one word at a time.

---

## 5. Create Frequency Array

```java
int[] freq = new int[256];
```

Stores frequency of characters using ASCII values as indices.

Example:

```text
freq['a']
freq['b']
freq['c']
...
```

---

## 6. Count Character Frequencies

```java
for(char c : w.toCharArray())
{
    freq[c]++;
}
```

### Example

Word:

```text
banana
```

Counting:

```text
b → 1
a → 3
n → 2
```

Frequency table:

| Character | Count |
| --------- | ----- |
| b         | 1     |
| a         | 3     |
| n         | 2     |

---

## 7. Find Maximum Frequency Inside This Word

```java
int localMax = 0;
```

Then:

```java
for(int f : freq)
{
    localMax = Math.max(localMax, f);
}
```

For `"banana"`:

```text
max(1,3,2)
=
3
```

Therefore:

```java
localMax = 3;
```

---

## 8. Compare With Global Maximum

```java
if(localMax > max)
{
    max = localMax;
    best = w;
}
```

If this word has a larger repeated-letter count than all previous words:

* Update global maximum
* Store current word

---

## 9. Print Result

```java
System.out.println("The resultant string : " + best);
```

---

# Dry Run

### Input

```text
hello banana committee
```

---

## Word 1: "hello"

Frequencies:

```text
h = 1
e = 1
l = 2
o = 1
```

Maximum frequency:

```text
2
```

Update:

```text
max = 2
best = hello
```

---

## Word 2: "banana"

Frequencies:

```text
b = 1
a = 3
n = 2
```

Maximum frequency:

```text
3
```

Since:

```text
3 > 2
```

Update:

```text
max = 3
best = banana
```

---

## Word 3: "committee"

Frequencies:

```text
c = 1
o = 1
m = 2
i = 1
t = 2
e = 2
```

Maximum frequency:

```text
2
```

Since:

```text
2 > 3
```

False.

No update.

---

### Output

```text
banana
```

---

# Important Observation

The code does **not** count total repeated letters.

It only looks at the **highest frequency of a single character**.

Example:

```text
committee
```

Counts:

```text
m = 2
t = 2
e = 2
```

Maximum frequency:

```text
2
```

Not:

```text
2 + 2 + 2 = 6
```

---

# What Happens in a Tie?

Example:

```text
apple butter
```

Both have:

```text
Maximum repeated character count = 2
```

Since the condition is:

```java
if(localMax > max)
```

and not:

```java
if(localMax >= max)
```

the **first occurring word wins**.

Output:

```text
apple
```

---

# Time Complexity

Let:

* `n` = total number of characters in the sentence
* `w` = number of words

---

### Frequency Counting

Every character is processed once:

```text
O(n)
```

---

### Finding Local Maximum

```java
for(int f : freq)
```

Array size is fixed:

```java
256
```

So:

```text
O(256)
=
O(1)
```

for each word.

For `w` words:

```text
O(256 × w)
=
O(w)
```

---

### Total

```text
O(n + w)
```

Since `w ≤ n`:

```text
O(n)
```

---

# Space Complexity

For each word:

```java
int[] freq = new int[256];
```

Fixed-size array.

Space:

```text
O(256)
=
O(1)
```

Only constant extra memory is used regardless of input size.

---

# Algorithm Summary

1. Split sentence into words.
2. For each word:

   * Count character frequencies.
   * Find the most repeated character.
3. Track the word with the highest repetition count.
4. Print that word.

---

# Final Complexity

| Metric           | Complexity |
| ---------------- | ---------- |
| Time Complexity  | **O(n)**   |
| Space Complexity | **O(1)**   |

### Key Java Concepts Used

* `split()`
* Enhanced for loops
* Frequency arrays
* Character counting
* ASCII indexing
* `Math.max()`
* String processing

### Example

```text
Input:
apple banana success

apple   -> p = 2
banana  -> a = 3
success -> s = 3

Output:
banana
```

`banana` is returned because it reaches the maximum frequency (`3`) first.


Let's break down the **time complexity** of your `problem96` code very carefully.

## Step 1: Define Input Size

Suppose the input sentence is:

```text
hello banana committee success
```

Let:

* `n` = total number of characters in the entire sentence
* `w` = number of words

For complexity analysis, we usually measure work in terms of **n**.

---

## First Loop: Iterate Through Every Word

```java
for(String w : words)
```

Suppose there are `w` words.

Example:

```java
["hello", "banana", "committee"]
```

This loop runs once per word.

---

## Second Loop: Count Frequencies

```java
for(char c : w.toCharArray())
{
    freq[c]++;
}
```

For a word of length `k`, this loop runs `k` times.

Example:

```text
banana
```

Length = 6

Iterations:

```text
b
a
n
a
n
a
```

6 operations → O(6)

More generally:

```text
O(k)
```

---

### Important Observation

All words together contain exactly `n` characters.

Example:

```text
hello banana committee
```

Characters:

```text
5 + 6 + 9 = 20
```

Across all words, this frequency-counting loop processes every character exactly once.

Therefore:

```text
O(n)
```

---

## Third Loop: Find Maximum Frequency

```java
for(int f : freq)
{
    localMax = Math.max(localMax, f);
}
```

`freq` size is always:

```java
new int[256]
```

Regardless of input size.

So this loop always executes:

```text
256 iterations
```

Which is:

```text
O(256)
```

In Big-O notation, constants are ignored:

```text
O(1)
```

(Constant Time)

---

## Combined Per Word

For a word of length `k`:

```text
Frequency count = O(k)

Finding max = O(1)
```

Total:

```text
O(k + 1)
=
O(k)
```

---

## Across All Words

Suppose word lengths are:

```text
k₁, k₂, k₃, ..., kₙ
```

Total work:

```text
O(k₁ + k₂ + k₃ + ...)
```

The sum of all word lengths equals total characters:

```text
n
```

Therefore:

```text
O(n)
```

---

# Example Calculation

Input:

```text
apple banana success
```

Lengths:

```text
apple   = 5
banana  = 6
success = 7
```

Work done:

```text
5 + 6 + 7 = 18
```

characters processed.

Plus:

```text
256 + 256 + 256
```

for max-frequency scans.

Since 256 is fixed:

```text
18 + 768
```

becomes:

```text
O(n)
```

because constants are ignored.

---

# Why Not O(n²)?

Many students see nested loops and immediately think:

```text
O(n²)
```

But here the loops are **not nested over the same input size**.

Consider:

```java
for(String w : words)
{
    for(char c : w.toCharArray())
```

The inner loop processes only the characters of the current word.

Across all iterations, every character is visited once.

Example:

```text
hello banana
```

Characters visited:

```text
h e l l o b a n a n a
```

Exactly once each.

Not:

```text
11 × 11
```

times.

So it is:

```text
O(n)
```

not

```text
O(n²)
```

---

## Final Answer

### Time Complexity

```text
O(n)
```

where `n` is the total number of characters in the input sentence.

### Reason

* Frequency counting visits every character exactly once → O(n)
* Scanning the frequency array is always 256 operations → O(1)
* Therefore:

```text
O(n) + O(1)
=
O(n)
```

### Space Complexity

```text
O(1)
```

because the frequency array size (`256`) never changes with input size.

*/