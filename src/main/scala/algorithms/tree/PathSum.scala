package algorithms.tree

object PathSum {
  def solution(root: TreeNode, sum: Int): Boolean = {
    if (root == null) return false
    if (sum == root.value && root.left == null && root.right == null) return true
    (root.left != null && solution(root.left, sum - root.value)) || (root.right != null && solution(root.right, sum - root.value))
  }
}