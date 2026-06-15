//Remove duplicate characters keeping only the first occurrence.

import java.util.*;

public class problem89
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String s = scanner.nextLine();

        HashSet<Character> hs = new LinkedHashSet<>();

        for(char c : s.toCharArray())
        {
            hs.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for(char c : hs)
        {
            sb.append(c);
        }

        System.out.println("The resultant string : " + sb.toString());
    }
}

/*
# Problem Statement

**Remove duplicate characters from a string while keeping only the first occurrence of each character.**

### Example

```text
Input:
programming

Output:
progamin
```

Explanation:

```text
p r o g r a m m i n g
```

First occurrences:

```text
p r o g a m i n
```

Duplicates (`r`, `m`, `g`) are ignored.

---

# Core Logic

The program uses a **LinkedHashSet**.

A `LinkedHashSet` has two important properties:

1. **Stores only unique elements** (duplicates automatically ignored)
2. **Maintains insertion order**

This makes it perfect for this problem because we want:

* No duplicates
* Original order preserved

---

# Step-by-Step Explanation

## 1. Read Input String

```java
String s = scanner.nextLine();
```

Example:

```text
banana
```

---

## 2. Create LinkedHashSet

```java
HashSet<Character> hs = new LinkedHashSet<>();
```

Although the variable type is `HashSet`, the actual object created is:

```java
new LinkedHashSet<>()
```

which preserves insertion order.

Initially:

```text
{}
```

---

## 3. Insert Characters into Set

```java
for(char c : s.toCharArray())
{
    hs.add(c);
}
```

### Dry Run for `"banana"`

---

### Character: b

Set:

```text
[b]
```

---

### Character: a

Set:

```text
[b, a]
```

---

### Character: n

Set:

```text
[b, a, n]
```

---

### Character: a

Already exists.

Ignored.

Set remains:

```text
[b, a, n]
```

---

### Character: n

Already exists.

Ignored.

Set remains:

```text
[b, a, n]
```

---

### Character: a

Already exists.

Ignored.

Final Set:

```text
[b, a, n]
```

Notice:

* Duplicates removed automatically
* Original order maintained

---

## 4. Build Result String

```java
StringBuilder sb = new StringBuilder();
```

Initially:

```text
""
```

---

## 5. Traverse Set

```java
for(char c : hs)
{
    sb.append(c);
}
```

Characters visited:

```text
b
a
n
```

Result:

```text
ban
```

---

## 6. Print Output

```java
System.out.println(sb.toString());
```

Output:

```text
The resultant string : ban
```

---

# Dry Run Example

### Input

```text
mississippi
```

---

### Insert into LinkedHashSet

Characters:

```text
m i s s i s s i p p i
```

Stored:

```text
[m, i, s, p]
```

---

### Build String

```text
misp
```

---

### Output

```text
misp
```

---

# Why LinkedHashSet?

## HashSet

```java
HashSet<Character> hs = new HashSet<>();
```

Removes duplicates but order is unpredictable.

Example:

```text
banana
```

Possible output:

```text
nab
```

or

```text
abn
```

No guarantee.

---

## LinkedHashSet

```java
LinkedHashSet<Character> hs = new LinkedHashSet<>();
```

Maintains insertion order.

Example:

```text
banana
```

Output:

```text
ban
```

Always correct.

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
hs.add(c)
```

takes **O(1)** average time.

Total:

```text
O(n)
```

---

## Second Loop

```java
for(char c : hs)
```

Suppose there are:

```text
k = number of unique characters
```

Runs:

```text
O(k)
```

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

# Understanding It Intuitively

Example:

```text
abcdef
```

Every character unique.

Operations:

```text
Insert a
Insert b
Insert c
Insert d
Insert e
Insert f
```

6 operations.

Then:

```text
Append a
Append b
Append c
Append d
Append e
Append f
```

Another 6 operations.

Total:

```text
12
```

which grows linearly with input size.

Therefore:

```text
O(n)
```

---

# Space Complexity

The set stores unique characters.

Suppose every character is different:

```text
abcdef
```

Set stores:

```text
[a,b,c,d,e,f]
```

Size = `n`

Space:

```text
O(n)
```

---

## StringBuilder

May also store up to `n` characters.

Space:

```text
O(n)
```

---

## Total Space Complexity

```text
O(n)
```

(Big-O ignores constant factors.)

---

# Alternative Approach

Without a set:

```java
for each character
    check if already seen
```

would require searching repeatedly.

Complexity:

```text
O(n²)
```

Using `LinkedHashSet` reduces it to:

```text
O(n)
```

---

# Algorithm Summary

1. Create a `LinkedHashSet`.
2. Insert all characters of the string.
3. Duplicates are automatically discarded.
4. Traverse the set in insertion order.
5. Build the result string.
6. Print it.

---

# Final Complexity

| Metric           | Complexity |
| ---------------- | ---------- |
| Time Complexity  | **O(n)**   |
| Space Complexity | **O(n)**   |

### Key Java Concepts Used

* `LinkedHashSet`
* Hashing
* Duplicate removal
* Insertion order preservation
* `StringBuilder`
* Enhanced for-loop

### Interview Explanation

> The algorithm inserts each character into a `LinkedHashSet`, which automatically removes duplicates while preserving the order of first appearance. Insertion into a set takes O(1) average time, so processing all characters takes O(n). The unique characters are then traversed once to build the result string, resulting in an overall time complexity of O(n) and space complexity of O(n).

*/
