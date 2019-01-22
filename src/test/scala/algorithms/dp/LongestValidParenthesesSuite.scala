package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LongestValidParenthesesSuite extends FunSuite {
  import LongestValidParentheses._
  
  test("LongestValidParentheses") {
    assert(solutionDP("()()") == 4)
    assert(solutionStack("()()") == 4)
    assert(solutionDP(")()()") == 4)
    assert(solutionStack(")()()") == 4)
  }
}