package algorithms.tree

case class TreeNode(
  value: Int,
  left: TreeNode,
  right: TreeNode
)

object TreeNode {
  def apply(elem: Int): TreeNode = TreeNode(elem, null, null)
}