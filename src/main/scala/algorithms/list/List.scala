package algorithms.list

object List {

  /**
    * https://leetcode.com/problems/rotate-list/
    * @param head
    * @param k
    * @return
    */
  def rotateRight(head: ListNode, k: Int): ListNode = {
    if (head == null || head.next == null && k <= 0) return head
    
    var length = 1
    var end: ListNode = head

    while (end.next != null) {
      end = end.next
      length = length + 1
    }
    end.next = head
    
    var newEnd = head
    
    // avoid k > length
    for (i <- 0 until length - k % length -1 ) newEnd = newEnd.next
    
    val newHead = newEnd.next
    newEnd.next = null
    newHead
  }
  
  
  /**
    * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    * @param head
    * @param n
    * @return
    *
    */
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    var flag = head
    var p = head
    var _n = n

    for (_ <- 1 to n if flag != null) {
      flag = flag.next
      _n = _n - 1
    }

    if (flag == null && _n == 0) return head.next
    else if (flag == null && _n > 0) return head

    while (flag.next != null) {
      flag = flag.next
      p = p.next
    }
    p.next = p.next.next
    
    head
  }
  
  /**
    * https://leetcode.com/problems/reverse-linked-list/
    * @param head
    * @return
    */
  def reverse(head: ListNode): ListNode = {
    var p: ListNode = head
    var q: ListNode = null
    
    while (p != null) {
      val temp = p
      p = p.next
      temp.next = q
      q = temp
    }
  
    q
  }
  
  
  /**
    * https://leetcode.com/problems/middle-of-the-linked-list/
    * @param head
    * @return
    */
  def middleNode(head: ListNode): ListNode = {
    var slow = head
    var fast = head
    while (fast != null && fast.next != null) {
      slow = slow.next
      fast = fast.next.next
    }
    
    slow
  }
  
  /**
    * https://leetcode.com/problems/remove-linked-list-elements/
    * @param head
    * @param elem
    * @return
    */
  def remove(head: ListNode, elem: Int): ListNode = {
    val dummy = ListNode(0, head)
    var notEqual = dummy
    
    while(notEqual.next != null) {
      if (notEqual.next.elem == elem) notEqual.next = notEqual.next.next
      else notEqual = notEqual.next
    }
    
    dummy.next
  }
  
  /**
    * https://leetcode.com/problems/intersection-of-two-linked-lists/
    * @param p
    * @param q
    * @return
    */
  def intersection(headA: ListNode, headB: ListNode): ListNode = {
    if (headA == null || headB == null) return null
    var p = headA
    var q = headB
    while (p != q) {
      p = if (p == null) headB else p.next
      q = if (q == null) headA else q.next
    }
    p
  }
  
  /**
    * https://leetcode.com/problems/partition-list/
    * @param head
    * @param x
    * @return
    */
  def partition(head: ListNode, x: Int): ListNode = {
    if (head == null) return null
    val smaller = ListNode(0)
    val greater = ListNode(0)
    var ps = smaller
    var pg = greater
    var p = head
    while (p != null) {
      if (p.elem < x) { ps.next = p; ps = ps.next }
      else { pg.next = p; pg = pg.next }
      p = p.next
    }
    ps.next = greater.next
    pg.next = null
    smaller.next
  }
  
  /**
    * https://leetcode.com/problems/palindrome-linked-list/
    * @param head
    * @return
    */
  def isPalindrome(head: ListNode): Boolean = {
    var len = 0
    var p = head
    while(p != null) {
      len += 1
      p = p.next
    }
    var cur: ListNode = head
    var pre: ListNode = null
    for (_ <- 0 until len / 2) {
      val nex = cur.next
      cur.next = pre
      pre = cur
      cur = nex
    }
    if (len % 2 == 1) cur = cur.next
    while(pre != null && cur != null) {
      if (pre.elem != cur.elem) return false
      pre = pre.next
      cur = cur.next
    }
    true
  }
  
}