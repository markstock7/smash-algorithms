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

#### Unique Paths
[[LeetCode]](https://leetcode.com/problems/unique-paths/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/UniquePaths.scala#L4)


A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

Example :

```
Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right
```

#### Unique Paths II
[[LeetCode]](https://leetcode.com/problems/unique-paths-ii/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/UniquePathsII.scala#L4)

A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

Note: m and n will be at most 100.

Example:
```
Input:
[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
Output: 2
Explanation:
There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right
```

#### House Robber
[[LeetCode]](https://leetcode.com/problems/house-robber/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/HouseRobber.scala#L4)

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:
```
Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
```
Example 2:
```
Input: [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
```

#### House Robber II
[[LeetCode]](https://leetcode.com/problems/house-robber-ii/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/HouseRobberII.scala#L4)

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:
```
Input: [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2),
             because they are adjacent houses.
```
Example 2:
```
Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
```

#### Maximum Subarray
[[LeetCode]](https://leetcode.com/problems/maximum-subarray/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/MaximumSubarray.scala#L4)

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:
```
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```

#### Longest Palindromic Substring
[[LeetCode]](https://leetcode.com/problems/longest-palindromic-substring/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/LongestPalindromicSubstring.scala#L4)

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:
```
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
```
Example 2:
```
Input: "cbbd"
Output: "bb"
```

#### Climbing Stairs
[[LeetCode]](https://leetcode.com/problems/climbing-stairs/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/ClimbingStairs.scala#L4)

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:
```
Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
```
Example 2:
```
Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```

#### Best Time to Buy and Sell Stock

[[LeetCode]](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/BestTimeToBuyAndSellStock.scala#L4)


If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:
```
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
```

#### Coin Change
[[LeetCode]](https://leetcode.com/problems/coin-change/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/CoinChange.scala#L4)

You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:
```
Input: coins = [1, 2, 5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
```
Example 2:
```
Input: coins = [2], amount = 3
Output: -1
```
#### Coin Change II

You are given coins of different denominations and a total amount of money. Write a function to compute the number of combinations that make up that amount. You may assume that you have infinite number of each kind of coin.

[[LeetCode]](https://leetcode.com/problems/coin-change-2/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/CoinChangeII.scala#L4)


Example 1:
```
Input: amount = 5, coins = [1, 2, 5]
Output: 4
Explanation: there are four ways to make up the amount:
5=5
5=2+2+1
5=2+1+1+1
5=1+1+1+1+1
```
Example 2:
```
Input: amount = 3, coins = [2]
Output: 0
Explanation: the amount of 3 cannot be made up just with coins of 2.
```
Example 3:
```
Input: amount = 10, coins = [10]
Output: 1
```

#### Min Cost Climbing Stairs

[[LeetCode]](https://leetcode.com/problems/min-cost-climbing-stairs/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/MinCostClimbingStairs.scala#L4)


On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.

Example 1:
```
Input: cost = [10, 15, 20]
Output: 15
Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
```
Example 2:
```
Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6
Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
```

#### Longest Increasing Subsequence
[[LeetCode]](https://leetcode.com/problems/longest-increasing-subsequence/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/LongestIncreasingSubsequence.scala#L4)

Given an unsorted array of integers, find the length of longest increasing subsequence.

Example:
```
Input: [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
```


#### Maximum Product Subarray
[[LeetCode]](https://leetcode.com/problems/maximum-product-subarray/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/dp/MaximumProductSubarray.scala#L4)

Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

Example :
```
Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
```