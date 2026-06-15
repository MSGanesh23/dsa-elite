//Count the frequency of each character in a string.

import java.util.*;

public class problem83{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String s = scanner.nextLine();

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
            System.out.print(e.getKey()+"->"+e.getValue()+" ");

        }

        System.out.println();
    }
}

/*
# Purpose

Count the **frequency of each character** in a string and display the result.

### Example

```text
Input  : banana
Output : b->1 a->3 n->2
```

This shows how many times each character appears in the string.

---

# Core Logic

## Step 1: Read the Input String

```java
String s = scanner.nextLine();
```

Reads the entire line entered by the user.

Example:

```text
banana
```

---

## Step 2: Create a Map to Store Frequencies

```java
HashMap<Character, Integer> map = new LinkedHashMap<>();
```

The map stores:

| Key       | Value     |
| --------- | --------- |
| Character | Frequency |

Example after processing `"banana"`:

```text
b → 1
a → 3
n → 2
```

### Why LinkedHashMap?

`LinkedHashMap` maintains the order in which characters first appear.

For `"banana"`:

```text
b → a → n
```

Output will follow the same order.

If a normal `HashMap` were used, the order could be unpredictable.

---

## Step 3: Count Character Frequencies

```java
for(char c : s.toCharArray())
{
    map.put(c, map.getOrDefault(c,0)+1);
}
```

### How it Works

`toCharArray()` converts the string into an array of characters.

For each character:

```java
map.getOrDefault(c,0)
```

* Returns current frequency if the character exists.
* Returns `0` if it does not exist.

Then:

```java
+1
```

increments the count and stores it back.

---

## Dry Run

Input:

```text
banana
```

### Iteration 1

Character:

```text
b
```

Map:

```text
{b=1}
```

---

### Iteration 2

Character:

```text
a
```

Map:

```text
{b=1, a=1}
```

---

### Iteration 3

Character:

```text
n
```

Map:

```text
{b=1, a=1, n=1}
```

---

### Iteration 4

Character:

```text
a
```

Map:

```text
{b=1, a=2, n=1}
```

---

### Iteration 5

Character:

```text
n
```

Map:

```text
{b=1, a=2, n=2}
```

---

### Iteration 6

Character:

```text
a
```

Map:

```text
{b=1, a=3, n=2}
```

Final map:

```text
b → 1
a → 3
n → 2
```

---

## Step 4: Print the Frequencies

```java
for(Map.Entry<Character, Integer> e : map.entrySet())
{
    System.out.print(e.getKey()+"->"+e.getValue()+" ");
}
```

### Explanation

Each map entry contains:

```java
e.getKey()     // Character
e.getValue()   // Frequency
```

For `"banana"`:

| Character | Frequency |
| --------- | --------- |
| b         | 1         |
| a         | 3         |
| n         | 2         |

Output:

```text
b->1 a->3 n->2
```

---

# Time Complexity

## Frequency Counting

```java
for(char c : s.toCharArray())
```

Runs `n` times.

Each `put()` and `getOrDefault()` operation takes **O(1)** average time.

Cost:

```text
O(n)
```

---

## Printing Frequencies

```java
for(Map.Entry<Character,Integer> e : map.entrySet())
```

Let:

```text
k = number of distinct characters
```

Runs `k` times.

Cost:

```text
O(k)
```

---

## Total Time Complexity

```text
O(n) + O(k)
```

Since:

```text
k ≤ n
```

### Final Time Complexity

# O(n)

---

# Space Complexity

The map stores every distinct character.

Worst case:

```text
abcdef
```

All characters are unique.

Map size becomes:

```text
n
```

Therefore:

# O(n)

---

# Key Interview Points

### 1. Frequency Counting Pattern

The most important line:

```java
map.put(c, map.getOrDefault(c,0)+1);
```

This is a standard frequency-counting technique used in:

* Character counting
* Word frequency analysis
* Duplicate detection
* Anagram problems
* Hashing-based interview questions

---

### 2. Why LinkedHashMap?

| HashMap                    | LinkedHashMap              |
| -------------------------- | -------------------------- |
| No guaranteed order        | Preserves insertion order  |
| Faster in theory           | Slightly more memory       |
| Output order unpredictable | Output order matches input |

For frequency display, `LinkedHashMap` makes the output easier to understand.

---

### 3. Alternative Approach (ASCII Only)

```java
int freq[] = new int[256];

for(char c : s.toCharArray())
{
    freq[c]++;
}
```

Then print all non-zero frequencies.

* Time: **O(n)**
* Space: **O(1)** (fixed-size array)

This can be faster than using a `HashMap` when character range is limited.

---

# Final Complexity

| Metric           | Complexity                            |
| ---------------- | ------------------------------------- |
| Time Complexity  | **O(n)**                              |
| Space Complexity | **O(n)**                              |
| Data Structure   | **LinkedHashMap<Character, Integer>** |
| Technique        | **Frequency Counting using Hashing**  |

### Interview Summary

The algorithm:

1. Traverses the string once.
2. Uses a `LinkedHashMap` to count occurrences of each character.
3. Traverses the map to print character-frequency pairs.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`
**Approach:** Hashing / Frequency Counting.

*/