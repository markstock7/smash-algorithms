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

	test("Same Tree") {
		import SameTree._
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
		assert(!isSameTree(tree1, tree2))
		assert(isSameTree(tree2, tree2))
		assert(isSameTree(tree3, tree3))
	}

	test("Minimum Depth of Binary Tree") {
		import MinimumDepthofBinaryTree._
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
			2
		)
		assert(minDepth(tree1) == 2)
		assert(minDepth(tree2) == 2)
		assert(minDepth(tree3) == 1)
	}

	test("Maximum Depth of Binary Tree") {
		import MaximumDepthofBinaryTree._
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
			2
		)
		assert(maxDepth(tree1) == 3)
		assert(maxDepth(tree2) == 2)
		assert(maxDepth(tree3) == 1)
	}
}
