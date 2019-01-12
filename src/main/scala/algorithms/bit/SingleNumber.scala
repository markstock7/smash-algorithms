package algorithms.bit

object SingleNumber {
	/**
		* https://leetcode.com/problems/single-number/
		* @param nums
		* @return
		*/
	def solution(nums: Array[Int]): Int = {
		nums.fold(0)(_ ^ _)
	}
}