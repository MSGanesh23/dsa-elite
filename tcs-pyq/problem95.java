//Count the number of words in a string.

import java.util.*;

public class problem95{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = scanner.nextLine();

        String[] arr = str.split(" ");

        System.out.println("The number of words in the string are : " + arr.length);
    }
}

/*
# Core Logic

The program counts the number of words in a string by:

1. Taking a sentence as input.
2. Splitting the sentence wherever a space `" "` occurs.
3. Storing the resulting words in an array.
4. Printing the length of that array.

---

## Step-by-Step Explanation

### 1. Read Input String

```java
String str = scanner.nextLine();
```

Example input:

```text
I love Java programming
```

---

### 2. Split the String

```java
String[] arr = str.split(" ");
```

The `split(" ")` method breaks the string at every space.

Example:

```java
"I love Java programming".split(" ")
```

Produces:

```java
["I", "love", "Java", "programming"]
```

Array representation:

| Index | Word        |
| ----- | ----------- |
| 0     | I           |
| 1     | love        |
| 2     | Java        |
| 3     | programming |

---

### 3. Count Words

```java
arr.length
```

Number of elements:

```text
4
```

---

### 4. Print Result

```java
System.out.println(arr.length);
```

Output:

```text
The number of words in the string are : 4
```

---

# Dry Run

### Input

```text
Hello World Java
```

### After Split

```java
arr = ["Hello", "World", "Java"]
```

### Length

```java
arr.length = 3
```

### Output

```text
The number of words in the string are : 3
```

---

# Time Complexity

Let:

* `n` = length of the input string

---

### Operation Performed

```java
String[] arr = str.split(" ");
```

To split the string, Java must scan every character to find spaces.

Example:

```text
Hello World Java
```

Java checks:

```text
H e l l o _ W o r l d _ J a v a
```

Every character is visited once.

Therefore:

```text
O(n)
```

---

### Getting Array Length

```java
arr.length
```

Array length is stored internally.

Accessing it takes:

```text
O(1)
```

(Constant Time)

---

### Total Time Complexity

```text
O(n) + O(1)
=
O(n)
```

---

# Space Complexity

The `split()` method creates a new array containing all words.

Example:

```java
["I", "love", "Java", "programming"]
```

If the input contains many words, the array size grows accordingly.

Therefore extra memory required is proportional to the input size:

```text
O(n)
```

---

# Important Limitation

Your code uses:

```java
split(" ")
```

This splits only on a **single space**.

Example:

```text
Hello    World
```

(multiple spaces)

Result may contain empty strings:

```java
["Hello", "", "", "", "World"]
```

which can lead to incorrect word counts.

### Better Version

```java
String[] arr = str.trim().split("\\s+");
```

Explanation:

* `trim()` removes leading/trailing spaces.
* `\\s+` means one or more whitespace characters.

Example:

```text
"   Hello    World   Java   "
```

becomes:

```java
["Hello", "World", "Java"]
```

Correct count:

```text
3
```

---

# Final Complexity

| Metric           | Complexity |
| ---------------- | ---------- |
| Time Complexity  | **O(n)**   |
| Space Complexity | **O(n)**   |

### Key Java Concepts Used

* `Scanner`
* `nextLine()`
* `String.split()`
* Arrays
* `length`
* String tokenization

### Interview Explanation

> The algorithm scans the string once to identify spaces and split it into words. Since every character is processed at most once, the time complexity is **O(n)**. The `split()` method creates a new array of words, requiring additional memory proportional to the input size, so the space complexity is **O(n)**.

*/


