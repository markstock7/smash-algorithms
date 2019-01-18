package algorithms.hashtable

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import utils.Helper

@RunWith(classOf[JUnitRunner])
class GroupAnagramsSuite extends FunSuite {
  import GroupAnagrams._
  
  test("solution") {
    val a: Int = 1
    assert(
      Helper.llUnsortedCompare(
        solution(Array("eat", "tea", "tan", "ate", "nat", "bat")),
        List(List("ate", "eat", "tea"), List("nat", "tan"), List("bat"))
      )
    )
  }
}
