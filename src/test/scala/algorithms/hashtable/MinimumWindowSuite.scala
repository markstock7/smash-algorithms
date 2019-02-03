package algorithms.hashtable

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import utils.Helper

@RunWith(classOf[JUnitRunner])
class MinimumWindowSuite extends FunSuite {
  import MinimumWindow._
  test("Minimum Window") {
    assert(solution("adbcacab", "aab") == "acab")
    assert(solution("ADOBECODEBANC", "ABC") == "BANC")
  }
}
