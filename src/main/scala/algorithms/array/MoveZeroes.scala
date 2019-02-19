package algorithms.array

object MoveZeroes {
	def solution(nums: Array[Int]): Unit = {
		if (nums.isEmpty) return
		var slow = 0
		for (fast <- nums.indices) {
			if (nums(fast) != 0) {
				val tmp = nums(slow)
				nums(slow) = nums(fast)
				nums(fast) = tmp
				slow += 1
			}
		}
	}
}