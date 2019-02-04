package algorithms.array

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class NextPermutationSuite extends FunSuite {
  import NextPermutation._
  
  test("Next Permutation") {
    val array = Array(2, 1, 8, 4, 2, 1)
    solution(array)
    assert(array.mkString(",") == "2,2,1,1,4,8")
    solution(array)
    assert(array.mkString(",") == "2,2,1,1,8,4")
  }
  
}