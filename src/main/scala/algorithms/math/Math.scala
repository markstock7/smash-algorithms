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
	
	/**
		* https://leetcode.com/problems/ugly-number/
		* @param num
		* @return
		*/
	def isUgly(num: Int): Boolean = {
		var _num = num
		if (_num <= 0) return false
		while (_num % 2 == 0) _num /= 2
		while (_num % 3 == 0) _num /= 3
		while (_num % 5 == 0) _num /= 5
		
		_num == 1
	}
	
	/**
		* https://leetcode.com/problems/number-of-digit-one/
		* @param n
		* @return
		*/
	def countDigitOne(n: Int): Int = {
		if (n < 1) return 0
		var count: Long = 0
		var factor: Long = 1
		while (n / factor != 0) {
			var digit: Long = (n / factor) % 10
			var  high: Long = n / (10 * factor)
			if (digit == 0) {
				count += high * factor
			} else if (digit == 1) {
				count += high * factor
				count += (n % factor) + 1
			} else {
				count += (high + 1) * factor
			}
			factor = factor * 10
		}
		count.toInt
	}
}