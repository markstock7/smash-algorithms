package algorithms.design

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class DesignSuite extends FunSuite {

	test("MinStack") {
		import algorithms.design.MinStack
		val stack = new MinStack

		stack.push(3)
		assert(stack.min.get == 3)
		assert(stack.top.get == 3)

		stack.push(1)
		assert(stack.min.get == 1)
		assert(stack.top.get == 1)

		stack.push(4)
		assert(stack.min.get == 1)
		assert(stack.top.get == 4)

		stack.push(1)
		assert(stack.min.get == 1)
		assert(stack.top.get == 1)

		stack.pop
		assert(stack.min.get == 1)
		assert(stack.top.get == 4)

		stack.pop
		assert(stack.min.get == 1)
		assert(stack.top.get == 1)

		stack.pop
		assert(stack.min.get == 3)
		assert(stack.top.get == 3)
	}
}
