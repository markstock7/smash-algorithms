package algorithms.bit

object Hamming {

	/**
		* https://leetcode.com/problems/number-of-1-bits/
		* Time: O(k) k is the number of 1 in n
		* Space: O(1)
		*
		* @param n
		* @return
		*/
	def hammingWeight(n: Int): Int = {
		var count: Int = 0
		var _n = n
		while (_n != 0) {
			count = count + 1
			_n &= (_n - 1)
		}
		count
	}

	/**
		* https://leetcode.com/problems/hamming-distance/
		* @param x
		* @param y
		* @return
		*/
	def hammingDistance(x: Int, y: Int): Int = hammingWeight(x ^ y)

}