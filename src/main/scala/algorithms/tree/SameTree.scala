package algorithms.tree

object SameTree {
	def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
		if ((p == null && q != null) || (p != null && q == null)) return false
		if (p == null && q == null) return true
		if (p.value == q.value) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
		}
		false
	}
}