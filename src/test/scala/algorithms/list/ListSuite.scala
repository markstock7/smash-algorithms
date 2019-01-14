package algorithms.list


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ListSuite extends FunSuite {
  import List._
  
  def createList: ListNode = {
    val l5 = ListNode(5, null)
    val l4 = ListNode(4, l5)
    val l3 = ListNode(3, l4)
    val l2 = ListNode(2, l3)
    val l1 = ListNode(1, l2)
    l1
  }
  test("rotateRight") {
    assert(rotateRight(createList, 2).toString == "4,5,1,2,3")
    assert(rotateRight(ListNode(5, null), 1).toString == "5")
  }
  
  test("removeNthFromEnd") {
    assert(removeNthFromEnd(createList, 3).toString == "1,2,4,5")
    assert(removeNthFromEnd(createList, 5).toString == "2,3,4,5")
    assert(removeNthFromEnd(createList, 6).toString == "1,2,3,4,5")
  }
  
  test("reverse") {
    assert(reverse(createList).toString == "5,4,3,2,1")
  }
  
  test("middleNode") {
    val head = ListNode(0, createList)
    assert(middleNode(createList).toString == "3,4,5")
    assert(middleNode(head).toString == "3,4,5")
    assert(middleNode(ListNode(1, null)).toString == "1")
  }
  
  test("remove") {
    assert(remove(createList, 1).toString == "2,3,4,5")
    assert(remove(createList, 5).toString == "1,2,3,4")
  }
}