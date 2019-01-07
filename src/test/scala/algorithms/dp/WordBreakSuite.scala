package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class WordBreakSuite extends FunSuite {
  import WordBreak._
  
  test("solution") {
    assert(solution("carandcard", List("car", "rand", "and", "d")))
    assert(solution("applepenapple", List("apple", "pen")))
  }
}