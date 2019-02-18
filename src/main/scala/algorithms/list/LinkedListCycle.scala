package algorithms.list

object LinkedListCycle {
	def hasCycle(head: ListNode): Boolean = {
		var fast = head
		var slow = head
		while(fast != null && slow != null && fast.next != null) {
			fast = fast.next.next
			slow = slow.next
			if (fast == slow) return true
		}
		false
	}
}