//Print all characters that appear more than once with their count.

import java.util.*;

public class problem90
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String s = scanner.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);

        }

        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
            if(e.getValue()>1)
            {
                System.out.print(e.getKey()+"->"+e.getValue()+" ");
            }
        }

        System.out.println();
    }
}

/*
# Problem Statement

**Print all characters that occur more than once in a string along with their frequency.**

### Example

```text
Input:
programming

Output:
r -> 2
g -> 2
m -> 2
```

---

# Core Logic

The algorithm uses a **HashMap<Character, Integer>** to count how many times each character appears.

### Steps

1. Traverse the string.
2. Store/update the frequency of each character in a HashMap.
3. Traverse the HashMap entries.
4. Print only those characters whose frequency is greater than 1.

This is a classic **frequency counting** problem.

---

# Step-by-Step Explanation

## 1. Read Input String

```java
String s = scanner.nextLine();
```

Example:

```text
programming
```

---

## 2. Create Frequency Map

```java
HashMap<Character, Integer> map = new HashMap<>();
```

Initially:

```text
{}
```

The map stores:

```text
Character → Frequency
```

Example:

```text
a → 3
b → 1
c → 2
```

---

## 3. Count Character Frequencies

```java
for(char c : s.toCharArray())
{
    map.put(c, map.getOrDefault(c, 0) + 1);
}
```

### Understanding `getOrDefault()`

```java
map.getOrDefault(c, 0)
```

Returns:

* current count if character exists
* otherwise returns `0`

Then:

```java
+1
```

increments the frequency.

---

### Dry Run

Input:

```text
banana
```

---

### Character: b

```java
map.getOrDefault('b',0)
=
0
```

Store:

```text
b → 1
```

Map:

```text
{b=1}
```

---

### Character: a

Store:

```text
a → 1
```

Map:

```text
{b=1, a=1}
```

---

### Character: n

Store:

```text
n → 1
```

Map:

```text
{b=1, a=1, n=1}
```

---

### Character: a

Existing count:

```text
1
```

Update:

```text
2
```

Map:

```text
{b=1, a=2, n=1}
```

---

### Character: n

Update:

```text
n → 2
```

Map:

```text
{b=1, a=2, n=2}
```

---

### Character: a

Update:

```text
a → 3
```

Final Map:

```text
{b=1, a=3, n=2}
```

---

## 4. Traverse Map Entries

```java
for(Map.Entry<Character, Integer> e : map.entrySet())
```

Visits every key-value pair.

Example:

```text
(b,1)
(a,3)
(n,2)
```

---

## 5. Print Repeated Characters Only

```java
if(e.getValue() > 1)
```

Meaning:

```text
Frequency > 1
```

For our example:

| Character | Count | Printed? |
| --------- | ----- | -------- |
| b         | 1     | No       |
| a         | 3     | Yes      |
| n         | 2     | Yes      |

Output:

```text
a->3 n->2
```

---

# Dry Run Example

### Input

```text
programming
```

Frequencies:

| Character | Count |
| --------- | ----- |
| p         | 1     |
| r         | 2     |
| o         | 1     |
| g         | 2     |
| a         | 1     |
| m         | 2     |
| i         | 1     |
| n         | 1     |

---

### Printed Output

```text
r->2 g->2 m->2
```

*(Order may vary because HashMap does not preserve insertion order.)*

---

# Important Observation

Since you used:

```java
HashMap
```

the output order is **not guaranteed**.

Example:

```text
banana
```

Possible outputs:

```text
a->3 n->2
```

or

```text
n->2 a->3
```

Both are valid.

---

### If Order Matters

Use:

```java
LinkedHashMap<Character,Integer>
```

instead of:

```java
HashMap<Character,Integer>
```

This preserves insertion order.

---

# Time Complexity

Let:

```text
n = length of the string
```

---

## First Loop

```java
for(char c : s.toCharArray())
```

Runs `n` times.

Each operation:

```java
getOrDefault()
put()
```

takes **O(1)** average time in a HashMap.

Therefore:

```text
O(n)
```

---

## Second Loop

```java
for(Map.Entry<Character,Integer> e : map.entrySet())
```

Suppose there are `k` distinct characters.

Runs:

```text
O(k)
```

times.

Since:

```text
k ≤ n
```

Worst case:

```text
O(n)
```

---

## Total Time Complexity

```text
O(n) + O(k)
```

Since `k ≤ n`:

```text
O(n)
```

### Final Time Complexity

```text
O(n)
```

---

# Why Not O(n²)?

A naive approach might do:

```java
for each character
    count occurrences by scanning entire string
```

Complexity:

```text
O(n²)
```

Example:

```text
1000 × 1000
=
1,000,000 operations
```

Using a HashMap:

```text
Single pass counting
+
Single pass printing
```

Only:

```text
O(n)
```

Much more efficient.

---

# Space Complexity

The HashMap stores frequencies.

Suppose there are `k` distinct characters.

Space:

```text
O(k)
```

Worst case:

```text
Every character unique
```

```text
k = n
```

Therefore:

```text
O(n)
```

---

# Algorithm Summary

1. Create a HashMap.
2. Count frequency of every character.
3. Traverse all map entries.
4. Print entries whose count is greater than 1.

---

# Final Complexity

| Metric           | Complexity |
| ---------------- | ---------- |
| Time Complexity  | **O(n)**   |
| Space Complexity | **O(n)**   |

Where:

* `n` = length of the string

### Key Java Concepts Used

* `HashMap`
* Frequency counting
* `getOrDefault()`
* `Map.Entry`
* `entrySet()`
* Character processing

### Interview Explanation

> The algorithm counts character frequencies using a HashMap in one traversal of the string. HashMap insertion and lookup take O(1) average time, so counting takes O(n). A second traversal over the distinct characters prints only repeated ones, taking O(k), where k is the number of unique characters. Since k ≤ n, the overall time complexity is O(n) and the space complexity is O(n).

*/