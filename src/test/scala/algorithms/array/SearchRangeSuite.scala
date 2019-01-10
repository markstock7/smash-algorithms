package algorithms.array

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SearchRangeSuite extends FunSuite {
  import SearchRange._
  
  test("solution") {
    assert(solution(Array(1, 2, 2, 4, 4, 8, 8), 2) sameElements Array(1, 2))
    assert(solution(Array(1, 2, 2, 4, 4, 8, 8), 0) sameElements Array(-1, -1))
  }
  
}