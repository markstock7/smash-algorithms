# Dynamic Programming

Dynamic programming is both a mathematical optimization method and a computer programming method. 
The method was developed by Richard Bellman in the 1950s and has found applications in numerous fields, 
from aerospace engineering to economics. 

In both contexts it refers to simplifying a complicated problem by breaking it down into simpler sub-problems in a recursive manner. 
While some decision problems cannot be taken apart this way, decisions that span several points in time do often break apart recursively. 
Likewise, in computer science, if a problem can be solved optimally by breaking it into sub-problems and then recursively finding the optimal solutions to the sub-problems, 
then it is said to have optimal substructure.


* Top-down approach: This is the direct fall-out of the recursive formulation of any problem. 
If the solution to any problem can be formulated recursively using the solution to its sub-problems, and if its sub-problems are overlapping, then one can easily memoize or store the solutions to the sub-problems in a table. 
Whenever we attempt to solve a new sub-problem, we first check the table to see if it is already solved. 
If a solution has been recorded, we can use it directly, otherwise we solve the sub-problem and add its solution to the table.
* Bottom-up approach: Once we formulate the solution to a problem recursively as in terms of its sub-problems, 
we can try reformulating the problem in a bottom-up fashion: try solving the sub-problems first and use their solutions to build-on and arrive at solutions to bigger sub-problems. 
This is also usually done in a tabular form by iteratively generating solutions to bigger and bigger sub-problems by using the solutions to small sub-problems. For example, 
if we already know the values of F41 and F40, we can directly calculate the value of F42.

## References & Materials
- [Top 50 Dynamic Programming Practice Problems](https://medium.com/@codingfreak/top-50-dynamic-programming-practice-problems-4208fed71aa3)
- [Wikipedia](https://en.wikipedia.org/wiki/Dynamic_programming)


## Problems

#### **[Decode Ways](https://leetcode.com/problems/decode-ways)**

A message containing letters from A-Z is being encoded to numbers using the following mapping:

```
'A' -> 1
'B' -> 2
...
'Z' -> 26

```
**Examples:**

message "12" could be decoded as "AB" which is (1，2) or "L" which is (12)

message "120" could only be decoded ad "AT" which is (1, 20), since (12, 0) and (1, 2, 0) are illegal.


**Solution:**



#### **[Longest Valid Parentheses](https://leetcode.com/problems/decode-ways)**

#### **[Nth Ugly Number](https://leetcode.com/problems/decode-ways)**

#### **[Nth Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)**

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

```
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
```

Given N, calculate F(N).

**Example**
``` 
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
```
**Solution**

Since the F(N) = F(N - 1) + F(N - 2), We can calculate from F(1) to F(N)
```
F(0) = 0 
F(1) = 1
F(2) = F(0) + F(1) = 1
F(3) = F(1) + F(2) = 2

```

![nthfib](https://github.com/markstock7/smash-algorithms/blob/master/asserts/algos/dp/nthfib_01.gif?raw=true)

We define three variables first, second, and third. After a single iteration, we just need to return third if N > 1.