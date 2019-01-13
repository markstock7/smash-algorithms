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
	
	/**
		* https://leetcode.com/problems/palindrome-number/
		* @param s
		* @return
		*/
	def isPalindrome(s: Int): Boolean = if (s < 0) false else isPalindrome(s.toString)
	
	/**
		* https://leetcode.com/problems/palindromic-substrings/
		* @param s
		* @return
		*/
	def countSubPalindrome(s: String): Int = {
		if (s.isEmpty) return 0
		
		var count = 0
		
		def expand(left: Int, right: Int): Unit = {
			var _left = left
			var _right = right
			while(_left >= 0 && _right < s.length && s.charAt(_left) == s.charAt(_right)) {
				count += 1
				_left += -1
				_right += 1
			}
		}
		
		for (i <- 0 to s.length) {
			expand(i, i)
			expand(i, i + 1)
		}
		
		count
	}
}
