package algorithms.tree

object PreOrder {
	def solution(root: TreeNode): List[Int] = {
		if (root == null) return List()
		root.value :: solution(root.left) ++ solution(root.right)
	}
}