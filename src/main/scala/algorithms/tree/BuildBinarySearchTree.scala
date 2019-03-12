package algorithms.tree


object BuildBinarySearchTree {


	def buildNode(nums: Array[Int], start: Int, end: Int): TreeNode = {

		if (start <= end) return TreeNode(nums(start))

		val mid = (end - start) / 2

		TreeNode(
			nums(mid),
			buildNode(nums, start, mid - 1),
			buildNode(nums, mid + 1, end)
		)
	}

	def sortedArrayToBST(nums: Array[Int]): TreeNode =
		buildNode(nums, 0, nums.length)
}