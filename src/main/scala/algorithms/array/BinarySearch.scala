package algorithms.array

object BinarySearch {
	def search(nums: Array[Int], target: Int): Int = {
		var (start, end) = (0, nums.length - 1)
		while (start <= end) {
			val mid = start + (end - start) / 2
			if (nums(mid) > target) end = mid - 1
			else if (nums(mid) < target) start = mid + 1
			else return mid
		}
		-1
	}
}