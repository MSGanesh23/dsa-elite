# Topic 5: Second Largest Element in an Array

This is the next important array pattern because it teaches you to maintain **multiple pieces of state during one traversal**.

It is a very common interview-style problem and a good bridge from basic arrays toward more advanced optimization.

---

# STEP 1 — What is the Concept?

Suppose we have:

```text
[10, 5, 20, 8, 15]
```

The largest element is:

```text
20
```

The **second largest distinct element** is:

```text
15
```

We want to find it without sorting the entire array.

Think of a competition:

```text
Player       Score

A             10
B              5
C             20
D              8
E             15
```

We keep track of:

```text
1st place → largest
2nd place → second largest
```

When a new number arrives, we decide whether it belongs in first or second place.

---

# STEP 2 — Why Does This Algorithm Exist?

## What problem does it solve?

Find the **second largest distinct element** efficiently.

For example:

```text
[7, 2, 9, 4, 6]

Largest = 9
Second largest = 7
```

---

## Brute Force Approach

A beginner might think:

1. Sort the array.
2. Take the second-last element.

For example:

```text
[7, 2, 9, 4, 6]

Sort:

[2, 4, 6, 7, 9]

Second largest = 7
```

This works.

But sorting costs:

```text
O(n log n)
```

We don't actually need the entire array sorted.

We only need two values:

```text
largest
secondLargest
```

So we can solve it in:

```text
O(n)
```

---

## When should you recognize this technique?

Look for phrases like:

* Second largest
* Second smallest
* Third largest
* Top two
* Top three
* Largest and runner-up
* Maximum and second maximum

These suggest:

> **Maintain multiple best candidates during one traversal.**

---

# STEP 3 — Pattern Recognition

The important pattern is:

```text
Current value

       ↓

Is it greater than largest?

       ↓ YES

secondLargest = largest
largest = current
```

Otherwise:

```text
Is it smaller than largest
but greater than secondLargest?

       ↓ YES

secondLargest = current
```

Visualization:

```text
                 Current
                    |
                    v
           +----------------+
           | current > max? |
           +----------------+
               /       \
             YES        NO
              |          |
              v          v
       second = max   Is current >
       max = current  second?
                           |
                         YES
                           |
                           v
                    second = current
```

---

# STEP 4 — ASCII Visualization

Consider:

```text
arr = [10, 5, 20, 8, 15]
```

Initially:

```text
largest       = 10
secondLargest = -∞
```

Now process:

```text
[10] [5] [20] [8] [15]
  ^
```

After `10`:

```text
Largest       = 10
Second Largest = -∞
```

Move to `5`:

```text
[10] [5] [20] [8] [15]
      ^
```

```text
5 < 10

Largest       = 10
Second Largest = 5
```

Move to `20`:

```text
[10] [5] [20] [8] [15]
          ^
```

20 beats the current largest.

Therefore:

```text
Before:

Largest = 10
Second  = 5

After:

Largest = 20
Second  = 10
```

Move to `8`:

```text
[10] [5] [20] [8] [15]
              ^
```

8 doesn't beat either value:

```text
Largest = 20
Second  = 10
```

Move to `15`:

```text
[10] [5] [20] [8] [15]
                  ^
```

15 is less than 20 but greater than 10:

```text
Largest = 20
Second  = 15
```

Final:

```text
Largest       = 20
Second Largest = 15
```

---

# STEP 5 — Dry Run ONE Example

Input:

```text
[12, 7, 19, 5, 15, 19]
```

Important: we're looking for the **second largest distinct** value.

Expected answer:

```text
15
```

Let's process every element.

### Start

```text
largest = 12
second  = -∞
```

---

### Iteration 1

Current:

```text
7
```

Is:

```text
7 > 12?
```

No.

Is:

```text
7 > second?
```

Yes.

So:

```text
largest = 12
second  = 7
```

---

### Iteration 2

Current:

```text
19
```

Is:

```text
19 > 12?
```

Yes.

Before changing `largest`, preserve the old largest:

```text
second = largest
       = 12

largest = 19
```

State:

```text
largest = 19
second  = 12
```

---

### Iteration 3

Current:

```text
5
```

Is:

```text
5 > 19?
```

No.

Is:

```text
5 > 12?
```

No.

State remains:

```text
largest = 19
second  = 12
```

---

### Iteration 4

Current:

```text
15
```

Is:

```text
15 > 19?
```

No.

Is:

```text
15 > 12?
```

Yes.

Therefore:

```text
second = 15
```

State:

```text
largest = 19
second  = 15
```

---

### Iteration 5

Current:

```text
19
```

It's equal to the largest.

We want **distinct** values.

Therefore:

```text
19 == largest
```

Ignore it.

State:

```text
largest = 19
second  = 15
```

---

### Final Table

|   Current | Largest | Second Largest |
| --------: | ------: | -------------: |
| Start: 12 |      12 |             -∞ |
|         7 |      12 |              7 |
|        19 |      19 |             12 |
|         5 |      19 |             12 |
|        15 |      19 |             15 |
|        19 |      19 |             15 |

Answer:

```text
15
```

---

# STEP 6 — Brute-Force Solution

The simplest solution is:

1. Sort the array.
2. Starting from the end, find the first value different from the maximum.

Example:

```text
Original:

[12, 7, 19, 5, 15]

Sort:

[5, 7, 12, 15, 19]

              ↑
        second largest
```

### Java

```java
Arrays.sort(arr);

int largest = arr[arr.length - 1];

for (int i = arr.length - 2; i >= 0; i--) {
    if (arr[i] != largest) {
        return arr[i];
    }
}
```

### Time Complexity

Sorting:

```text
O(n log n)
```

### Space Complexity

For interview analysis, the auxiliary space depends on the sorting implementation; with Java's primitive `int[]`, `Arrays.sort` uses an in-place primitive sorting algorithm, so auxiliary space is small compared with the input, though you generally don't need to focus on this detail here.

### Why is it slower?

We're sorting **everything** even though we only need the top two distinct values.

---

# STEP 7 — Deriving the Optimized Solution

Ask:

> "Do I really need the entire array sorted?"

No.

We only need:

```text
largest
secondLargest
```

So while traversing:

### Case 1 — Current > largest

Example:

```text
largest = 20
second = 15

current = 30
```

Then:

```text
second = 20
largest = 30
```

---

### Case 2 — Current is between them

```text
largest = 30
second = 20

current = 25
```

Then:

```text
second = 25
```

---

### Case 3 — Current < second

```text
largest = 30
second = 25

current = 10
```

Ignore it.

---

### Case 4 — Current == largest

```text
largest = 30
current = 30
```

Ignore it because we're finding the **second largest distinct** element.

---

Therefore:

```text
Sorting:
O(n log n)

One traversal:
O(n)
```

This is a major interview lesson:

> **Don't sort unless the problem actually requires ordering.**

---

# STEP 8 — Interview-Quality Code

## Java — Primary

```java
public class SecondLargest {

    public static int findSecondLargest(int[] arr) {

        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException(
                "At least two elements are required"
            );
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            // Found a new largest value
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }

            // Found a value between largest and second largest
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(
                "No second distinct largest element exists"
            );
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {12, 7, 19, 5, 15, 19};

        System.out.println(findSecondLargest(arr)); // 15
    }
}
```

### Important observation

This initialization:

```java
int largest = Integer.MIN_VALUE;
```

is better than:

```java
int largest = 0;
```

because the input could contain only negative numbers:

```text
[-10, -20, -5, -15]
```

The answer should be:

```text
-10
```

---

## Python

```python
def find_second_largest(arr):

    if arr is None or len(arr) < 2:
        raise ValueError("At least two elements are required")

    largest = float("-inf")
    second_largest = float("-inf")

    for num in arr:

        # Found a new largest value
        if num > largest:
            second_largest = largest
            largest = num

        # Found a value between largest and second largest
        elif num > second_largest and num != largest:
            second_largest = num

    if second_largest == float("-inf"):
        raise ValueError("No second distinct largest element exists")

    return second_largest


arr = [12, 7, 19, 5, 15, 19]

print(find_second_largest(arr))  # 15
```

---

# STEP 9 — Complexity

### Time

```text
O(n)
```

Why?

We visit each element exactly once.

---

### Space

```text
O(1)
```

Why?

We only store:

```text
largest
secondLargest
```

No additional array or HashMap is required.

---

# STEP 10 — Common Mistakes

## Mistake 1 — Initializing with zero

```java
int largest = 0;
```

Fails for:

```text
[-5, -10, -2]
```

Use:

```java
Integer.MIN_VALUE
```

or initialize from actual array values.

---

## Mistake 2 — Duplicate maximum

Consider:

```text
[10, 20, 20, 15]
```

If the problem says **second largest distinct**, answer is:

```text
15
```

not:

```text
20
```

---

## Mistake 3 — Confusing "second largest" with "second distinct largest"

Always clarify the interpretation if the problem statement doesn't specify.

---

## Mistake 4 — Updating in the wrong order

Suppose:

```text
largest = 20
second = 15
current = 30
```

Correct:

```text
second = largest
largest = current
```

If you do this:

```text
largest = current
second = largest
```

then both become `30`.

You lost the old largest value.

---

## Mistake 5 — Forgetting the impossible case

For:

```text
[5, 5, 5]
```

there is no second **distinct** largest element.

Your program needs to handle that according to the problem's required output.

---

# STEP 11 — Practice Questions

Do **not** look at solutions yet.

### Easy

**1.** Find the second largest element in:

```text
[10, 5, 8, 20, 15]
```

Do it in `O(n)`.

---

### Easy

**2.** Find the second smallest distinct element in:

```text
[8, 3, 10, 2, 7]
```

---

### Medium

**3.** Find the **third largest distinct** element using one traversal.

Example:

```text
[10, 5, 20, 8, 15, 20]

Answer = 10
```

---

### Medium

**4.** Given an array, find the largest and second-largest **distinct** values.

Return both.

Example:

```text
[4, 9, 2, 9, 7]

Output:
Largest = 9
Second Largest = 7
```

---

### Hard — Infosys Level

**5.** Given an integer array, find the **second largest distinct element without sorting and without using any extra data structure**.

Your solution must be:

```text
Time:  O(n)
Space: O(1)
```

Also explain how your code handles:

```text
[5]
[5, 5]
[5, 5, 5]
[-10, -5, -20]
[10, 20, 20, 15]
```

---

# STEP 12 — Code Review

When you submit your solutions, I will review them as an interviewer:

### Correctness

Does it produce the right answer?

### Optimization

Did you avoid unnecessary sorting?

### Edge cases

Did you handle:

* Duplicates?
* Negative numbers?
* One element?
* All elements equal?
* No second distinct value?

### Complexity

Can you explain:

```text
O(n) time
O(1) space
```

### Interview communication

Can you explain the idea without reading the code?

---

# STEP 13 — Interview Cheat Sheet

### Core Pattern

```text
largest
secondLargest

For every number:

    if number > largest:
        secondLargest = largest
        largest = number

    else if number > secondLargest
         and number != largest:
        secondLargest = number
```

### Recognition Trick

Whenever you see:

> **Top K is small**

think about maintaining a few candidates.

For example:

```text
Largest              → 1 variable
Top 2                 → 2 variables
Top 3                 → 3 variables
```

For larger `K`, other techniques such as heaps become more useful.

### Important Principle

> **Don't sort an array just to find one or two extreme values.**

### When NOT to use this method

If the problem asks for:

* Top 1000 elements
* Kth largest for large `K`
* Dynamic insertion + top-K queries

consider:

* Heap / Priority Queue
* Quickselect
* Other specialized techniques

---

# STEP 14 — Confidence Checklist

Before moving on:

* □ I can find the largest element.
* □ I can find the second largest.
* □ I understand **distinct** values.
* □ I can handle duplicates.
* □ I can handle negative numbers.
* □ I can handle arrays with no valid second largest.
* □ I can solve it without sorting.
* □ I know why the optimized solution is `O(n)`.
* □ I can explain the algorithm in an interview.
* □ I can code it without looking.

Once you've attempted the practice questions and are confident, type:

**`NEXT`**
