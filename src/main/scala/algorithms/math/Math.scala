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
		var x = n
		while(x * x > n) x = (n / x + x) /2
		x
	}

	/**
		* Using Newton's method
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
}