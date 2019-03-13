package algorithms.string


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class StringSuite extends FunSuite {

//	test("Longest Substring Without Repeating Characters") {
//		import LongestSubstringWithoutRepeatingCharacters._
//		assert(solution("") == 0)
//		assert(solution("abcabcbb") == 3)
//	}

	test("LongestPalindrome") {
		import LongestPalindrome.solution
		assert(solution("civilwartestingwhetherthmldof") == 17)
		assert(solution("abccccdd") == 7)
		assert(solution("") == 0)
	}

	test("First Unique Character In A String") {
		import algorithms.string.FirstUniqueCharacterInAString.firstUniqChar
		assert(firstUniqChar("leetcode") == 0)
		assert(firstUniqChar("loveleetcode") == 2)
	}
}