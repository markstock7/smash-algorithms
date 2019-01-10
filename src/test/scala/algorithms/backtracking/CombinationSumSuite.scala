package algorithms.backtracking


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CombinationSumSuite extends FunSuite {
  
  import CombinationSum._
  
  test("solution") {
    assert(solution(Array(4, 2, 8), 6) == List(List(2, 4), List(2, 2, 2)), "")
  }
}