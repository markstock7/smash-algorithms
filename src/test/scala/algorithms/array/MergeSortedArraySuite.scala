package algorithms.array

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MergeSortedArraySuite extends FunSuite {
  import MergeSortedArray._
  
  test("Merge Sorted Array") {
    val arr = Array(1,2,3,0,0,0)
    solution(arr, 3, Array(2,5,6), 3)
    assert(arr.mkString(",") == "1,2,2,3,5,6")
  }
  
}