package algorithms.array


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TwoSumSuite extends FunSuite {
  import TwoSum._
  
  test("solution") {
    assert(solution(Array(2, 7, 11, 15), 9) sameElements Array(0,1))
  }
}