package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class DynamicProgrammingSuite extends FunSuite {
  
  test("Min Cost Climbing Stairs") {
    import MinCostClimbingStairs._
    assert(solution(Array(10, 15, 20)) == 15, "10, 15, 20")
    assert(solution(Array(0, 0, 0)) == 0, "0, 0, 0")
    assert(solution(Array()) == 0, "")
    assert(solution(Array(3)) == 3, "3")
  }
}
