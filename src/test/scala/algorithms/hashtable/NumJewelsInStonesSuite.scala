package algorithms.hashtable

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class NumJewelsInStonesSuite extends FunSuite {
  import NumJewelsInStones._
  
  test("solution") {
    assert(solution("aA","aAAbbbb") == 3)
    assert(solution("","aAAbbbb") == 0)
  }
}
