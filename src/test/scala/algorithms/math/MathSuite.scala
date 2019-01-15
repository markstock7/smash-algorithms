package algorithms.math


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MathSuite extends FunSuite {
	import Math._

	test("sqrtWithBinarySearch") {
		assert(sqrtWithBinarySearch(8) == 2)
	}
	test("sqrt") {
		assert(sqrt(8) == 2, "integer value sqrt")
		assert(sqrt(8D) == 2.82842712474619, "double value sqrt")
	}

	test("pow") {
		assert(pow(1, 10) == 1)
		assert(pow(2, 5) == 32)
	}
	
	test("isUgly") {
		assert(isUgly(45))
		assert(!isUgly(46))
		assert(isUgly(1))
		assert(!isUgly(0))
	}
}