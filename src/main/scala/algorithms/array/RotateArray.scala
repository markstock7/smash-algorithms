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
}