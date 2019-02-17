package algorithms.tree

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TreeSuite extends FunSuite {

	test("Symmetric Tree") {
		import SymmetricTree._
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
			TreeNode(17),
			TreeNode(17)
		)
		assert(!isSymmetric(tree1))
		assert(!isSymmetric(tree2))
		assert(isSymmetric(tree3))
	}
}
