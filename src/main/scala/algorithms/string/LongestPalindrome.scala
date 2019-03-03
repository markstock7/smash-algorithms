package algorithms.string

object LongestPalindrome {
	def solution(s: String): Int = {
		val d = new Array[Int](256)
		var oddNum = 0
		s.foreach { c =>
			d(c) += 1
		}
		d.foreach { count =>
			if (count % 2 == 1) oddNum += 1
		}
		s.length -  Math.max(0, oddNum - 1)
	}
}