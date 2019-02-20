package algorithms.tree

object InvertTree {
	def invertTree(root: TreeNode): TreeNode = {
		if (root == null) return null
		if (root.left == null && root.right == null) return root
		root.copy(left = invertTree(root.right), right = invertTree(root.left))
	}
}