package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ClimbingStairsSuite extends FunSuite {
  import ClimbingStairs._
  
  test("rot") {
    assert(solution(0) == 0)
    assert(solution(1) == 1)
    assert(solution(2) == 2)
    assert(solution(3) == 3)
  }
}
