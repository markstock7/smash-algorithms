package algorithms.tree

object SymmetricTree {
	def isSymmetric(root: TreeNode): Boolean = {
		if (root == null) return true

		def isSame(t1: TreeNode, t2: TreeNode): Boolean = {
			if ((t1 == null && t2 != null) || (t1 != null && t2 == null)) return false
			if (t1 == null && t2 == null) return true
			if (t1.value == t2.value) {
				return isSame(t1.left, t2.right) && isSame(t1.right, t2.left)
			}
			false
		}
		isSame(root.left, root.right)
	}
}