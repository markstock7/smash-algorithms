package algorithms.list


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ListSuite extends FunSuite {
  import List._
  
  test("rotateRight") {
    val l5 = ListNode(5, null)
    val l4 = ListNode(4, l5)
    val l3 = ListNode(3, l4)
    val l2 = ListNode(2, l3)
    val l1 = ListNode(1, l2)
    assert(rotateRight(l1, 2).toString == "4,5,1,2,3")
    assert(rotateRight(ListNode(5, null), 1).toString == "5")
  }
}