package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LongestPalindromicSubstringSuite extends FunSuite {
  import LongestPalindromicSubstring._
  
  test("Longest Palindromic Substring") {
    assert(solution("babad") == "bab")
    assert(solution("abcbab") == "abcba")
    assert(solution("") == "")
    assert(solution("a") == "a")
    assert(solution("ab") == "a")
    assert(solution("ccc") == "ccc")
    assert(solution("abcda") == "a")
  }
}
