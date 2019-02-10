package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MaximumSubarraySuite extends FunSuite {
  import MaximumSubarray._
  
  test("Maximum Subarray") {
    assert(solution(Array(-2,1,-3,4,-1,2,1,-5,4)) == 6)
    assert(solution(Array(-2,-1)) == -1)
    assert(solution(Array(-1,-2)) == -1)
  }
}