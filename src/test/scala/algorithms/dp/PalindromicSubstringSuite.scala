package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PalindromicSubstringSuite extends FunSuite {
  import PalindromicSubstrings._
  
  test("countSubPalindrome") {
    assert(solution("abc") == 3)
    assert(solution("abbc") == 5)
    assert(solution("acc") == 4)
  }
}