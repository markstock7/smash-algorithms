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

#### Symmetric Tree

[[LeetCode]](https://leetcode.com/problems/symmetric-tree/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/tree/SymmetricTree.scala#L4)

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```
But the following [1,2,2,null,3,null,3] is not:
```
    1
   / \
  2   2
   \   \
   3    3
```

#### Same Tree

[[LeetCode]](https://leetcode.com/problems/same-tree/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/tree/SameTree.scala#L4)

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:
```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
```