package algorithms.tree

object SearchInABinarySearchTree {
	def searchBST(root: TreeNode, `val`: Int): TreeNode = {
		if (root ==null || root.value == `val`)root
		else if (`val` < root.value) searchBST(root.left, `val`)
		else searchBST(root.right, `val`)
	}
}