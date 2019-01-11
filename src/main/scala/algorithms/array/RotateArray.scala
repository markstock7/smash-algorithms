package algorithms.array

object RotateArray {

	/**
		* https://leetcode.com/problems/rotate-image/
		* @param matrix
		*/
	def rotate(matrix: Array[Array[Int]]): Unit = {
		val n = matrix.length
		
		for (x <- 0 until n) {
			for (y <- x until n) {
				val tmp = matrix(x)(y)
				matrix(x)(y) = matrix(y)(x)
				matrix(y)(x) = tmp
			}
		}
		
		for (x <- 0 until n) {
			for (y <- 0 until n /2) {
				val tmp = matrix(x)(y)
				matrix(x)(y) = matrix(x)(n - 1 - y)
				matrix(x)(n - 1 - y) = tmp
			}
		}
	}
	

	private def reverse(nums: Array[Int], i: Int, j: Int): Unit = {
		var _i = i
		var _j = j
		while (_i < _j) {
			val tmp = nums(_i)
			nums(_i) = nums(_j)
			nums(_j) = tmp
			_i = _i + 1
			_j = _j - 1
		}
	}
	
	/**
		* https://leetcode.com/problems/rotate-array/
		*/
	def rotate(nums: Array[Int], k: Int): Unit = {
		if (nums.isEmpty || k <= 0) return
		val n: Int = nums.length
		val m: Int = k % n
		reverse(nums, 0, n - 1)
		reverse(nums, 0, m - 1)
		reverse(nums, m, n - 1)
	}
}