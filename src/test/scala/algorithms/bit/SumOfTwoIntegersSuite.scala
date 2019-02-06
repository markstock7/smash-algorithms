package algorithms.bit


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import utils.Helper

@RunWith(classOf[JUnitRunner])
class SumOfTwoIntegersSuite extends FunSuite {
  
  import SumOfTwoIntegers._
  
  test("getSum") {
    assert(getSum(4, 5) == 9)
    assert(getSum(4, 0) == 4)
    assert(getSum(-4, 0) == -4)
  }
}