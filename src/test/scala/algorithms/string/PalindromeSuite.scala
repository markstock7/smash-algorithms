package algorithms.string


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PalindromeSuite extends FunSuite {
	import Palindrome._

	test("isPalindrome") {
		assert(isPalindrome(" race a E-car "), "")
		assert(!isPalindrome(123))
		assert(isPalindrome(121))
		assert(!isPalindrome(-121))
		assert(isPalindrome(0))
	}
	
	test("countSubPalindrome") {
		assert(countSubPalindrome("abc") == 3)
		assert(countSubPalindrome("abbc") == 5)
		assert(countSubPalindrome("acc") == 4)
	}
	
}