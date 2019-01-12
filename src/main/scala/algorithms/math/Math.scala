package algorithms.math

object Math {

	def sqrtWithBinarySearch(n: Int): Int = {
		var low = 0
		var high = n
		while (low <= high) {
			val mid = low + (high - low) / 2
			val mid2 = mid * mid

			if (mid2 < n) low = mid + 1
			else if (mid2 > n) high = mid - 1
			else return mid.toInt
		}

		high
	}

	def sqrt(n: Int): Int = {
		var x: Long  = n
		while(x * x > n) x = (n / x + x) /2
		x.toInt
	}

	/**
		* Using Newton's method
		* https://leetcode.com/problems/sqrtx/
		* https://blog.csdn.net/ccnt_2012/article/details/81837154
		*
		* @param n
		* @return
		*/
	def sqrt(n: Double): Double = {
		var x = n
		while(x * x > n) x = (n / x + x) /2
		x
	}

	/**
		* https://leetcode.com/problems/powx-n/
		* https://algocasts.io/episodes/Z5mzJmdn
		* @param x
		* @param n
		* @return
		*/
	def pow(x: Double, n: Int): Double = {
		var result = 1D
		var base = x
		var N = math.abs(n.asInstanceOf[Long])

		while (N != 0) {
			if ((N & 1) == 1) result = result * base
			base = base * base
			N >>= 1
		}

		if (n < 0) 1 / result else result
	}
}