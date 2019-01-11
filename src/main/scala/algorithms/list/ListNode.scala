package algorithms.list

case class ListNode(var x: Int, var next: ListNode = null) {
  override def toString: String = {
    var s = x.toString
    var end = next
    while(end != null) {
      s = s + "," + end.x
      end = end.next
    }
    s
  }
}
