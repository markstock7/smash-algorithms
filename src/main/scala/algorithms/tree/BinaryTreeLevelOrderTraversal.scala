package algorithms.tree

object BinaryTreeLevelOrderTraversal {
	def levelOrder(root: TreeNode): List[List[Int]] = {
		def go(queue: List[TreeNode], rst: List[List[Int]]): List[List[Int]] = {
			if (queue.isEmpty) rst
			else {
				val next = queue.flatMap(node => List(node.left, node.right).filter(_ != null))
				go(next, rst :+ queue.map(_.value))
			}
		}
		go(if(root == null) List.empty else List(root), List())
	}
}
