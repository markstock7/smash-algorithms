package algorithms.sorting


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SortSuite extends FunSuite {
  
  test("bubbleSort") {
    assert(Sort.bubbleSort(Array(4,3,6)) sameElements  Array(3,4,6))
  }
 
}