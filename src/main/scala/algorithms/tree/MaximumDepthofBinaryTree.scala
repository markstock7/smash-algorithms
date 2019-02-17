package algorithms.tree

object MaximumDepthofBinaryTree {
	def maxDepth(root: TreeNode): Int = {
		def depth(node: TreeNode, curDepth: Int): Int = {
			if (node == null) return curDepth
			else if (node.left != null && node.right == null) return depth(node.left, curDepth + 1)
			else if (node.right != null && node.left == null) return depth(node.right, curDepth + 1)
			else Math.max(depth(node.right, curDepth + 1), depth(node.left, curDepth + 1))
		}
		depth(root, 0)
	}
}