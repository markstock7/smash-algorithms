package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HouseRobberSuite extends FunSuite {
  import HouseRobber._
  
  test("rot") {
    assert(rob(Array(2,7,9,3,1)) == 12)
    assert(robII(Array(2,7,9,3,1)) == 12)
  }
}
