package algorithms.list

object MergeTwoSortedLists {
	def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
		val dummy = ListNode(0)
		var p = dummy
		var (p1, p2) = (l1, l2)

		while (p1 != null && p2 != null) {
			if (p1.elem < p2.elem) {
				p.next = p1
				p1 = p1.next
			} else {
				p.next = p2
				p2 = p2.next
			}
			p = p.next
		}

		if (p1 != null) p.next = p1
		if (p2 != null) p.next = p2
		dummy.next
	}
}