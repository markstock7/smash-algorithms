package algorithms.tree

object BalancedBinaryTree {
	def isBalancedTopDown(root: TreeNode): Boolean = {

		def height(node: TreeNode): Int = {
			if (node == null) return 0
			Math.max(height(node.left), height(node.right)) + 1
		}

		if (root == null) return true
		Math.abs(height(root.left) - height(root.right)) <= 1 && isBalancedTopDown(root.left) && isBalancedTopDown(root.right)
	}

	def isBalancedBottomUp(root: TreeNode): Boolean = {
		def getHeightAndCheck(root: TreeNode): Int = {
			if (root == null) return 0
			val left = getHeightAndCheck(root.left)
			if (left == -1) return -1
			val right = getHeightAndCheck(root.right)
			if (right == -1) return -1
			if (Math.abs(left - right) > 1) return -1
			Math.max(left, right) + 1
		}
		getHeightAndCheck(root) != -1
	}
}