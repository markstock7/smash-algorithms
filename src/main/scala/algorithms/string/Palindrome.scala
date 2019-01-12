package algorithms.string

import utils.StringUtil._

object Palindrome {

	/**
		* https://algocasts.io/episodes/4rpaqpZb
		* https://leetcode.com/problems/valid-palindrome/
		*/
	def isPalindrome(s: String): Boolean = {
		if (s.isEmpty) return true

		var i = 0; var j = s.length - 1
		var times = 0
		while (i < j) {
			while (i < j && !isAlphanumeric(s.charAt(i))) i = i + 1
			while (i < j && !isAlphanumeric(s.charAt(j))) j = j - 1
			if (i < j && !isEqualIgnoreCase(s.charAt(i), s.charAt(j))) return false
			i = i + 1; j = j - 1
		}

		true
	}
}
