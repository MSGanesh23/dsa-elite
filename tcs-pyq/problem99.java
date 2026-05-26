//Find a substring within a string and display its starting index.

import java.util.*;

public class problem99{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String s = scanner.nextLine();

        System.out.println("Enter the substring : ");

        String sub = scanner.nextLine();


        System.out.println("The index of substring is : " + s.indexOf(sub));


    }
}

/*
# Problem Statement

**Find a substring within a string and display its starting index.**

Example:

```text
Input String : Hello World
Substring    : World

Output:
The index of substring is : 6
```

---

# Core Logic

The program uses Java's built-in method:

```java
indexOf()
```

to search for a substring inside a string.

* If the substring is found, `indexOf()` returns the **starting index** of its first occurrence.
* If the substring is not found, it returns **-1**.

---

# Step-by-Step Explanation

## 1. Read the Main String

```java
String s = scanner.nextLine();
```

Example:

```text
Hello World
```

Stored as:

```java
s = "Hello World"
```

---

## 2. Read the Substring

```java
String sub = scanner.nextLine();
```

Example:

```text
World
```

Stored as:

```java
sub = "World"
```

---

## 3. Search for the Substring

```java
s.indexOf(sub)
```

Java scans the string from left to right and checks where the substring first appears.

For:

```java
s = "Hello World"
sub = "World"
```

Character positions:

```text
H e l l o _ W o r l d
0 1 2 3 4 5 6 7 8 9 10
```

`World` starts at index **6**.

Result:

```java
6
```

---

## 4. Print the Result

```java
System.out.println(
    "The index of substring is : " + s.indexOf(sub)
);
```

Output:

```text
The index of substring is : 6
```

---

# Dry Run

## Input

```text
String     : programming
Substring  : gram
```

---

### Search Process

Check positions:

```text
programming
01234567890
```

Substring `"gram"` begins at:

```text
pro[gram]ming
```

Starting index:

```text
3
```

---

### Output

```text
The index of substring is : 3
```

---

# What if Substring is Not Present?

### Input

```text
String     : programming
Substring  : xyz
```

Search fails.

`indexOf()` returns:

```java
-1
```

Output:

```text
The index of substring is : -1
```

---

# How `indexOf()` Works Internally

Conceptually:

```java
for each position i in string
{
    compare substring characters
    if all match
        return i;
}
return -1;
```

Example:

```text
String = abcdef
Substring = cd
```

Comparisons:

```text
ab -> no
bc -> no
cd -> yes
```

Return:

```text
2
```

---

# Time Complexity

Let:

* `n` = length of main string
* `m` = length of substring

### Worst Case

Java may compare the substring at many positions.

Example:

```text
String    = aaaaaaaaaa
Substring = aaaab
```

Many partial matches occur before failure.

Worst-case complexity:

```text
O(n × m)
```

---

# Space Complexity

No extra data structures are created.

Only a few variables are used.

```text
O(1)
```

(Constant space)

---

# Example Cases

### Case 1

```text
Input:
banana
ana

Output:
1
```

(`ana` first appears starting at index 1)

---

### Case 2

```text
Input:
computer
put

Output:
3
```

---

### Case 3

```text
Input:
hello
xyz

Output:
-1
```

---

# Algorithm Summary

1. Read the main string.
2. Read the substring.
3. Use `indexOf()` to locate the first occurrence.
4. Print the returned index.
5. If not found, `-1` is printed automatically.

---

# Final Complexity

| Metric           | Complexity                |
| ---------------- | ------------------------- |
| Time Complexity  | **O(n × m)** (worst case) |
| Space Complexity | **O(1)**                  |

### Key Java Concepts Used

* `Scanner`
* `nextLine()`
* `String.indexOf()`
* String searching
* String manipulation

*/