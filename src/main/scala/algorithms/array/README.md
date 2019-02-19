# Array

## Problems

#### Next Permutation 
[[LeetCode]](https://leetcode.com/problems/next-permutation)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/array/NextPermutation.scala#L11)

Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

```
1,  2,  3 → 1,  3,  2
3,  2,  1 → 1,  2,  3
1,  1,  5 → 1,  5,  1
```

#### Majority Element 
[[LeetCode]](https://leetcode.com/problems/majority-element/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/array/MajorityElement.scala#L4)

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

```
Input: [3,2,3]
Output: 3
```

Example 2:
```
Input: [2,2,1,1,1,2,2]
Output: 2
```

####M Merge Sorted Array
[[LeetCode]](https://leetcode.com/problems/merge-sorted-array/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/array/MergeSortedArray.scala#L4)

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:
```
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
```

#### Search Insert Position
[[LeetCode]](https://leetcode.com/problems/search-insert-position/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/array/SearchInsertPosition.scala#L4)

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:
```
Input: [1,3,5,6], 5
Output: 2
```

### Binary Search
[[Leetcode]](https://leetcode.com/problems/binary-search/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/array/BinarySearch.scala#L4)

Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. If target exists, then return its index, otherwise return -1.


Example 1:
```
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
```

### Move Zeroes 
[[Leetcode]](https://leetcode.com/problems/move-zeroes/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/array/MoveZeroes.scala#L4)

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:
```
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
```