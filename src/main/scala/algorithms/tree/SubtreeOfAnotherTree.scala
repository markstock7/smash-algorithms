package algorithms.tree


object SubtreeOfAnotherTree {
  
  private def isIdentity(s: TreeNode, t: TreeNode): Boolean = {
    if (s == null && t == null) true
    else if (s == null || t == null) false
    else s.value == t.value && isIdentity(s.left, t.left) && isIdentity(s.right, t.right)
  }
  
  // Time: O(M*N), Space: O(h)
  def isSubtree(s: TreeNode, t: TreeNode): Boolean = {
    if (t == null) true
    else if (s == null) false
    else isIdentity(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t)
  }
  
  import scala.collection.mutable
  private val map: mutable.Map[TreeNode, Int] = mutable.Map.empty
  private def preOrderHash(s: TreeNode): String = {
    if (s == null) return "#"
    val hash = s"${preOrderHash(s.left)}${s.value}${preOrderHash(s.right)}"
    map(s) = hash.hashCode
    hash
  }
  
  private def isIdentityHash(s: TreeNode, t: TreeNode): Boolean = {
    if (t == null) return true
    if (s == null) return false
    map.get(s).equals(map.get(t)) || isIdentityHash(s.left, t) || isIdentityHash(s.right, t)
  }
  
  // Time: O(M + N)，Space: O(h)
  def isSubtreeHash(s: TreeNode, t: TreeNode): Boolean = {
    if (t == null) return true
    if (s == null) return false
    preOrderHash(s)
    preOrderHash(t)
    isIdentityHash(s, t)
  }
  
}