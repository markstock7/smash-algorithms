package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HouseRobberIISuite extends FunSuite {
  import HouseRobberII._
  
  test("rot") {
    assert(rob(Array(1,2,3,1)) == 4)
    assert(rob(Array(2,3,2,5,7)) == 10)
  }
}
