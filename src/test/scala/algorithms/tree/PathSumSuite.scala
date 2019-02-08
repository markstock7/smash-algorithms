package algorithms.tree

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PathSumSuite extends FunSuite {
  import PathSum._
  
  test("has Path Sum") {
    val tree1 = TreeNode(
      5,
      TreeNode(4, TreeNode(11, TreeNode(7), TreeNode(2)), null),
      TreeNode(8, TreeNode(13), TreeNode(4))
    )
    assert(solution(tree1, 22))
  
    val tree2 = TreeNode(
      -2,
      null,
      TreeNode(-3)
    )
    assert(solution(tree2, -5))
  }
}