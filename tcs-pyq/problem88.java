//Find the character that occurs the most in a string.

import java.util.*;

public class problem88{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String s = scanner.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int max = 0;

        char result = ' ';

        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
            if(e.getValue() >= max)
            {
                max = e.getValue();
                result = e.getKey();
            }
        }

        System.out.println("Most frequent character : " + result);

    }
}

/*
# Purpose

Find the **most frequently occurring character** in a given string.

Example:

```
Input  : programming
Output : g
```

Because `'g'` appears 2 times, which is the highest frequency.

---

# Core Logic

## Step 1: Read the input string

```java
String s = scanner.nextLine();
```

The user enters a string, which is stored in `s`.

---

## Step 2: Count frequency of each character

```java
HashMap<Character, Integer> map = new HashMap<>();
```

A `HashMap` is used where:

| Key       | Value     |
| --------- | --------- |
| Character | Frequency |

Example:

For `"banana"`:

```
b → 1
a → 3
n → 2
```

---

### Frequency Counting Loop

```java
for(char c : s.toCharArray())
{
    map.put(c, map.getOrDefault(c,0)+1);
}
```

### How it works

`toCharArray()` converts the string into an array of characters.

For each character:

```java
map.getOrDefault(c,0)
```

returns:

* existing frequency if character is already present
* `0` if character is not present

Then:

```java
+1
```

increments the count.

Example for `"banana"`:

| Character | Map After Update |
| --------- | ---------------- |
| b         | {b=1}            |
| a         | {b=1,a=1}        |
| n         | {b=1,a=1,n=1}    |
| a         | {b=1,a=2,n=1}    |
| n         | {b=1,a=2,n=2}    |
| a         | {b=1,a=3,n=2}    |

---

## Step 3: Find the maximum frequency character

```java
int max = 0;
char result = ' ';
```

* `max` stores highest frequency found so far.
* `result` stores corresponding character.

---

### Traverse the HashMap

```java
for(Map.Entry<Character, Integer> e : map.entrySet())
```

Each entry contains:

```java
e.getKey()     // character
e.getValue()   // frequency
```

---

### Compare frequencies

```java
if(e.getValue() >= max)
{
    max = e.getValue();
    result = e.getKey();
}
```

If current frequency is greater than or equal to the current maximum:

* update `max`
* update `result`

---

## Dry Run

Input:

```
banana
```

Frequency map:

```
b → 1
a → 3
n → 2
```

Traversal:

| Character | Frequency | max | result |
| --------- | --------- | --- | ------ |
| b         | 1         | 1   | b      |
| a         | 3         | 3   | a      |
| n         | 2         | 3   | a      |

Final:

```
Most frequent character : a
```

---

# Important Observation

You used:

```java
if(e.getValue() >= max)
```

instead of

```java
if(e.getValue() > max)
```

This means:

* If two characters have the same highest frequency,
* the character visited later in the HashMap traversal will be chosen.

Example:

```
Input : aabb
```

Frequencies:

```
a → 2
b → 2
```

Because of `>=`, whichever entry appears last during iteration becomes the result.

Since `HashMap` does **not guarantee order**, the output may vary.

A safer version:

```java
if(e.getValue() > max)
```

This keeps the first maximum encountered.

---

# Time Complexity

## Frequency Counting

```java
for(char c : s.toCharArray())
```

Runs `n` times.

HashMap operations:

```java
getOrDefault()
put()
```

Average case: **O(1)**

So:

**O(n)**

---

## Finding Maximum

```java
for(Map.Entry<Character,Integer> e : map.entrySet())
```

Let:

* `k` = number of distinct characters

Runs `k` times.

Time:

**O(k)**

---

## Total Time Complexity

```
O(n) + O(k)
```

Since:

```
k ≤ n
```

Overall:

# Time Complexity = O(n)

---

# Space Complexity

HashMap stores frequencies of distinct characters.

Worst case:

```
abcdef...
```

All characters are unique.

Map size becomes:

```
n
```

Therefore:

# Space Complexity = O(n)

---

# Key Interview Points

### 1. Frequency Counting Pattern

Very common pattern:

```java
map.put(x, map.getOrDefault(x,0)+1);
```

Used in:

* Character counting
* Word frequency
* Duplicate detection
* Anagram problems

---

### 2. Why HashMap?

Because lookup and insertion are:

```
O(1) average
```

instead of

```
O(n)
```

for repeated searching.

---

### 3. Alternative Approach (ASCII Characters Only)

If input contains only ASCII characters:

```java
int freq[] = new int[256];

for(char c : s.toCharArray())
{
    freq[c]++;
}
```

Then find the maximum frequency.

* Time: **O(n)**
* Space: **O(1)** (fixed-size array)

This is often faster than a `HashMap`.

---

# Final Complexity

| Metric              | Complexity                              |
| ------------------- | --------------------------------------- |
| Time Complexity     | **O(n)**                                |
| Space Complexity    | **O(n)**                                |
| Data Structure Used | **HashMap<Character, Integer>**         |
| Technique           | **Frequency Counting + Maximum Search** |

This is the standard optimal solution for finding the most frequent character in a string containing arbitrary characters.

*/