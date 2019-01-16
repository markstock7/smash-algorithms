package algorithms.bit


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MissingNumberSuite extends FunSuite {
  import MissingNumber._
  
  test("missingNumber") {
    assert(solution(Array(0, 1,4,2)) == 3)
  }
}