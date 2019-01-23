package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class DecodeWaysSuite extends FunSuite {
  import DecodeWays._
  
  test("DecodeWays") {
    assert(numDecodings("123") == 3, "123")
    assert(numDecodings("1234") == 3, "1234")
    assert(numDecodings("0") == 0, "0")
    assert(numDecodings("2") == 1, "2")
    assert(numDecodings("22") == 2, "22")
    assert(numDecodings("221") == 3, "221")
    assert(numDecodings("2210") == 2, "2210")
    assert(numDecodings("2260") == 0, "2210")
  }
}
