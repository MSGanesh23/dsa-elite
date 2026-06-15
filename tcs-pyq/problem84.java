//Find all characters that appear exactly once.


import java.util.*;

public class problem84{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = scanner.next();

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char c : str.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
            if(e.getValue()==1)
            {
                System.out.print(e.getKey()+" ");
            }
        }




    }
}

/*
# Purpose

Find and print **all characters that occur exactly once** in a string.

### Example

```text
Input  : programming
Output : p o a i n
```

Because these characters appear only one time.

---

# Core Logic

## Step 1: Read the Input

```java
String str = scanner.next();
```

Reads a string from the user.

Example:

```text
programming
```

---

## Step 2: Create a Frequency Map

```java
HashMap<Character, Integer> map = new LinkedHashMap<>();
```

This map stores:

| Character | Frequency |
| --------- | --------- |
| p         | 1         |
| r         | 2         |
| o         | 1         |
| g         | 2         |
| ...       | ...       |

### Why `LinkedHashMap`?

Unlike `HashMap`, `LinkedHashMap` preserves insertion order.

So if the input is:

```text
programming
```

the characters are stored in the order:

```text
p → r → o → g → a → m → i → n
```

This ensures the output appears in the same order as the string.

---

## Step 3: Count Character Frequencies

```java
for(char c : str.toCharArray())
{
    map.put(c, map.getOrDefault(c,0)+1);
}
```

### How it works

For each character:

```java
map.getOrDefault(c,0)
```

* Returns current frequency if present.
* Returns `0` if character is not yet present.

Then:

```java
+1
```

increments the count.

---

### Dry Run

Input:

```text
programming
```

Frequency map after the loop:

| Character | Frequency |
| --------- | --------- |
| p         | 1         |
| r         | 2         |
| o         | 1         |
| g         | 2         |
| a         | 1         |
| m         | 2         |
| i         | 1         |
| n         | 1         |

---

## Step 4: Print Characters with Frequency 1

```java
for(Map.Entry<Character, Integer> e : map.entrySet())
{
    if(e.getValue()==1)
    {
        System.out.print(e.getKey()+" ");
    }
}
```

### What happens?

For every entry:

* Check frequency using:

```java
e.getValue()
```

If frequency equals 1:

```java
if(e.getValue()==1)
```

print the character.

---

### Example Traversal

| Character | Frequency | Printed? |
| --------- | --------- | -------- |
| p         | 1         | Yes      |
| r         | 2         | No       |
| o         | 1         | Yes      |
| g         | 2         | No       |
| a         | 1         | Yes      |
| m         | 2         | No       |
| i         | 1         | Yes      |
| n         | 1         | Yes      |

Output:

```text
p o a i n
```

---

# Why LinkedHashMap is Important

Suppose input:

```text
swiss
```

Frequencies:

```text
s → 3
w → 1
i → 1
```

Using `LinkedHashMap`:

```text
w i
```

Order matches appearance in the string.

With ordinary `HashMap`, iteration order is not guaranteed and output order could vary.

---

# Time Complexity

## Frequency Counting Loop

```java
for(char c : str.toCharArray())
```

Runs `n` times.

Each:

```java
getOrDefault()
put()
```

takes **O(1)** average time.

Cost:

```text
O(n)
```

---

## Printing Unique Characters

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
abcdefg
```

All characters are unique.

Map size:

```text
n
```

Therefore:

# O(n)

---

# Key Interview Points

### 1. Frequency Counting Pattern

A very common interview technique:

```java
map.put(c, map.getOrDefault(c,0)+1);
```

Used in:

* Duplicate detection
* Character counting
* Word frequency
* Anagram problems

---

### 2. Why LinkedHashMap Instead of HashMap?

`LinkedHashMap`

✔ Preserves insertion order

`HashMap`

✘ No guaranteed order

So `LinkedHashMap` is the correct choice when output order matters.

---

### 3. Alternative Solution Using Two Passes

```java
int freq[] = new int[256];

for(char c : str.toCharArray())
    freq[c]++;

for(char c : str.toCharArray())
{
    if(freq[c] == 1)
        System.out.print(c + " ");
}
```

For ASCII characters:

* Time: **O(n)**
* Space: **O(1)** (fixed-size array)

---

# Final Complexity

| Metric           | Complexity                            |
| ---------------- | ------------------------------------- |
| Time Complexity  | **O(n)**                              |
| Space Complexity | **O(n)**                              |
| Data Structure   | **LinkedHashMap<Character, Integer>** |
| Technique        | **Frequency Counting**                |

### Interview Summary

The program:

1. Counts the frequency of every character using a `LinkedHashMap`.
2. Traverses the map.
3. Prints only characters whose frequency is exactly **1**, preserving their original order of appearance.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`

*/