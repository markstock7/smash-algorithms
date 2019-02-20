package algorithms.list

object RemoveDuplicatesFromSortedList {
	def deleteDuplicates(head: ListNode): ListNode = {
		if (head == null) return null
		var cur = head
		var next = head.next
		while (next != null) {
			if (cur.elem == next.elem) cur.next = next.next
			else cur = cur.next
			next = next.next
		}
		head
	}
}