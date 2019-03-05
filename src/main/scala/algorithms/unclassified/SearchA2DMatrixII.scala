package algorithms.unclassified

object SearchA2DMatrixII {
	def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {

		if (matrix.isEmpty || matrix.head.isEmpty) return false

		val (m, n) = (matrix.length, matrix.head.length)
		var (i, j) = (0, n - 1)
		while (i < m && j >= 0) {
			if (target < matrix(i)(j)) j -= 1
			else if (target > matrix(i)(j)) i += 1
			else return true
		}
		 false
	}
}