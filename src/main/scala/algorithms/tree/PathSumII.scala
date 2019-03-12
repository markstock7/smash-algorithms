package algorithms.tree

object PathSumII {
	def pathSum(root: TreeNode, sum: Int): List[List[Int]] = {

		if (root == null) return List.empty

		if (root.value == sum && root.left == null && root.right == null)
			return List(List(sum))
		else if (root.value != sum && root.left == null && root.right == null)
			return List.empty

		pathSum(root.left, sum - root.value)
			.filter(_.nonEmpty).map(root.value :: _) ++
		pathSum(root.right, sum - root.value)
			.filter(_.nonEmpty).map(root.value :: _)
	}
}