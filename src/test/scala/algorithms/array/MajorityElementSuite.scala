package algorithms.array


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MajorityElementSuite extends FunSuite {
  import MajorityElement._
  
  test("Majority Element") {
    assert(solution(Array(2,3,4,2)) ==  2, "")
  }
}