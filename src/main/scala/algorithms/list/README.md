# List

#### Palindrome Linked List
[[LeetCode]](https://leetcode.com/problems/palindrome-linked-list/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/list/List.scala#L162)

Given a singly linked list, determine if it is a palindrome.

Example 1:
```
Input: 1->2
Output: false
```

Example 2:
```
Input: 1->2->2->1
Output: true
```

#### Merge Two Sorted Lists
[[LeetCode]](https://leetcode.com/problems/merge-two-sorted-lists/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/list/MergeTwoSortedLists.scala#L4)

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:
```
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
```

#### Linked List Cycle

[[LeetCode]](https://leetcode.com/problems/linked-list-cycle/)
[[Code]](https://github.com/markstock7/smash-algorithms/blob/master/src/main/scala/algorithms/list/LinkedListCycle.scala#L4)

Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

 
Example 1:
```
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.
```
![alt tag](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png) 