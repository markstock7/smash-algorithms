package algorithms.bit


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SingleElementInASortedArraySuite extends FunSuite {
  import SingleElementInASortedArray._
  
  test("Single Element In A Sorted Array using Bit operation") {
    assert(solution(Array(1,1,2,3,3,4,4,8,8)) == 2, "")
    assert(solution(Array(3,3,7,7,10,11,11)) == 10)
  }
  
  test("Single Element In A Sorted Array using Binary Search") {
    assert(solutionII(Array(1,1,2,3,3,4,4,8,8)) == 2, "")
    assert(solutionII(Array(3,3,7,7,10,11,11)) == 10)
  }
  
}