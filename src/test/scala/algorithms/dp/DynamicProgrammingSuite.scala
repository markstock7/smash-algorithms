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
  
  test("Longest Increasing Subsequence") {
    import LongestIncreasingSubsequence._
    assert(solution(Array(10,9,2,5,3,7,101,18)) == 4, "10, 15, 2010,9,2,5,3,7,101,18")
    assert(solution(Array(1, 8, 2, 6, 4, 5)) == 4, "1, 8, 2, 6, 4, 5")
    assert(solutionBs(Array(10,9,2,5,3,7,101,18)) == 4, "10, 15, 2010,9,2,5,3,7,101,18")
    assert(solutionBs(Array(1, 8, 2, 6, 4, 5)) == 4, "1, 8, 2, 6, 4, 5")
  }

  test("Maximum Product Subarray") {
    import MaximumProductSubarray.maxProduct
    assert(maxProduct(Array(2,3,-2,4)) == 6)
    assert(maxProduct(Array(-2, 0, -1)) == 0)
  }
}

