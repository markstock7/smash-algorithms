package algorithms.list

case class ListNode(var elem: Int, var next: ListNode = null) {
  override def toString: String = {
    var s = elem.toString
    var end = next
    while(end != null) {
      s = s + "," + end.elem
      end = end.next
    }
    s
  }
}
