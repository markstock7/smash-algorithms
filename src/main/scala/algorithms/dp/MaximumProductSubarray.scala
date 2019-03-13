package algorithms.dp

object MaximumProductSubarray {
	def maxProduct(nums: Array[Int]): Int = {
		nums.tail.foldLeft((nums.head, nums.head, nums.head))((res, num) => {
			var (curMax, curMin, max) = res
			val (a, b) = (curMax * num, curMin * num)
			curMax = Math.max(Math.max(a, b), num)
			curMin = Math.min(Math.min(a, b), num)
			max = Math.max(max, curMax)
			(curMax, curMin, max)
		})._3
	}
}