package algorithms.tree

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SubtreeOfAnotherTreeSuite extends FunSuite {
  import SubtreeOfAnotherTree._
  
  test("isSubtree") {
    val tree1 = TreeNode(
      1,
      TreeNode(2, TreeNode(8), TreeNode(16)),
      TreeNode(4)
    )
    val tree2 = TreeNode(
      2,
      TreeNode(8),
      TreeNode(16)
    )
    val tree3 = TreeNode(
      2,
      TreeNode(8),
      TreeNode(17)
    )
    assert(isSubtree(tree1, tree2))
    assert(isSubtree(tree1, null))
    assert(!isSubtree(tree1, tree3))
  }
  
  test("isSubtreeHash") {
    val tree1 = TreeNode(
      1,
      TreeNode(2, TreeNode(8), TreeNode(16)),
      TreeNode(4)
    )
    val tree2 = TreeNode(
      2,
      TreeNode(8),
      TreeNode(16)
    )
    val tree3 = TreeNode(
      2,
      TreeNode(8),
      TreeNode(17)
    )
    assert(isSubtreeHash(tree1, null))
    assert(isSubtreeHash(tree1, tree2))
    assert(!isSubtreeHash(tree1, tree3))
  }
  
  
}