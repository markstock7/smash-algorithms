package algorithms.tree

object BinaryTreeLevelOrderTraversalII {
	def levelOrderBottom(root: TreeNode): List[List[Int]] = {
		import scala.collection.mutable
		if (root == null) return List.empty
		var result: List[List[Int]] = List.empty
		val q: mutable.Queue[TreeNode] = mutable.Queue()
		q.enqueue(root)
		while (q.nonEmpty) {
			var elems: List[Int] = List.empty
			val size = q.size
			for (i <- 0 until size) {
				val node = q.dequeue()
				elems = elems :+ node.value
				if (node.left != null) q.enqueue(node.left)
				if (node.right != null) q.enqueue(node.right)
			}
			result = elems :: result
		}
		result
	}
}