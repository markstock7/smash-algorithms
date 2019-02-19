package algorithms.array

object SearchInsertPosition {
	def searchInsert(nums: Array[Int], target: Int): Int = {
		if (nums.isEmpty) return -1
		var (low, high) = (0, nums.length - 1)
		while( low <= high) {
			val mid = low + (high - low) / 2
			if (nums(mid) < target) low = mid + 1
			else if (nums(mid) > target) high = mid - 1
			else return mid
		}
		low
	}
}