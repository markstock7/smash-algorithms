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
}