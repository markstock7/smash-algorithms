package algorithms.heap

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class KthLargestSuite extends FunSuite {
  import algorithms.heap
  
  test("KthLargest") {
    val kthLargest = new KthLargest(3, Array(4,5,8,2));
    assert(kthLargest.add(3) == 4)
    assert(kthLargest.add(5) == 5)
    assert(kthLargest.add(10) == 5)
    assert(kthLargest.add(9) == 8)
    assert(kthLargest.add(4) == 8)
  }
}
