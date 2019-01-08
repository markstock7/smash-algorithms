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
}