package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class NthUglyNumberSuite extends FunSuite {
  import NthUglyNumber._
  
  test("NthUglyNumber") {
    assert(solution(10) == 12)
    assert(solution(9) == 10)
    assert(solution(1) == 1)
  }
}