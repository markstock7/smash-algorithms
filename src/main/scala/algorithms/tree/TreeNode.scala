package algorithms.tree

case class TreeNode(
  value: Int,
  left: TreeNode,
  right: TreeNode
) {
  override def toString: String = {
    dlr.mkString(",")
  }

  def dlr: List[Int] = {
    val lV = if (left == null) Nil else left.dlr
    val rV = if (right == null) Nil else right.dlr
    lV ::: List(value) ::: rV
  }
}

object TreeNode {
  def apply(elem: Int): TreeNode = TreeNode(elem, null, null)
}