package algorithms.array

object FindMinimumInRotatedSortedArray {
	def findMin(nums: Array[Int]): Int = {
		var (low, high) = (0, nums.length - 1)
		while ( low < high) {
			if (nums(low) < nums(high)) return nums(low)
			val mid = low + (high - low) / 2
			if (nums(mid) > nums(high)) low = mid + 1
			else high = mid
		}
		nums(low)
	}
}