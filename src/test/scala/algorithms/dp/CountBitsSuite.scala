package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountBitsSuite extends FunSuite {
  import CountBits._
  
  test("CountBits") {
    assert(solution(5) sameElements Array(0,1,1,2,1,2), "5")
  }
}
