package algorithms.string

object LongestSubstringWithoutRepeatingCharacters {
	def solution(s: String): Int = {
		var (j, max) = (0, 0)
		val counts: Array[Int] = Array.ofDim(256)
		for (i <- s.indices) {
			while (j < s.length) {
				if (counts(s.charAt(j)) == 0) {
					counts(s.charAt(j)) = 1
				}
			}
			max = Math.max(max, j - i)
			counts(s.charAt(i)) -= 1
		}
		max
	}
}