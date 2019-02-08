# Tree

## Problems

#### [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/)

Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. 
A subtree of s is a tree consists of a node in s and all of this node's descendants. 
The tree s could also be considered as a subtree of itself.

**Examples**

```
Given tree s:                Given tree t:

     3                             4
    / \                           / \
   4   5                         1   2
  / \
 1   2
```

```
Given tree s:               Given tree t:
     3                             4
    / \                           / \ 
   4   5                         1   2
  / \
 1   2
    /
   0
```

**Solution**


#### Path Sum

[[LeetCode]](https://leetcode.com/problems/path-sum/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/tree/PathSum.scala#L4)

Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,
```
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1

```
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.