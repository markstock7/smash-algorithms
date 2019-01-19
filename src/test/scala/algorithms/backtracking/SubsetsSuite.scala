package algorithms.backtracking


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import utils.Helper

@RunWith(classOf[JUnitRunner])
class SubsetsSuite extends FunSuite {
  
  import Subsets._
  
  test("solution") {
    assert(Helper.llUnsortedCompare(
      solution(Array(1, 2, 3, 6)),
      List(List(), List(6),List(3),List(3,6),List(2),List(2,6),List(2,3),List(2,3,6),List(1),List(1,6),List(1,3),List(1,3,6),List(1,2),List(1,2,6),List(1,2,3),List(1,2,3,6)))
    )
  }
}