package algorithms.array


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TrapRainWaterSuite extends FunSuite {
  import TrapRainWater._
  
  test("solution") {
    assert(solution(Array(0,1,0,2,1,0,1,3,2,1,2,1)) == 6)
    assert(solution(Array(0,2,0,4,0,1,2)) == 5)
  }
  
  test("solution2") {
    assert(solution2(Array(0,1,0,2,1,0,1,3,2,1,2,1)) == 6)
    assert(solution(Array(0,2,0,4,0,1,2)) == 5)
  }
  
}