package algorithms.bit


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HammingSuite extends FunSuite {
	import Hamming._

	test("hammingWeight") {
		assert(hammingWeight(1) == 1, "")
		assert(hammingWeight(5) == 2, "")
		assert(hammingWeight(55) == 5, "")
	}

	test("hammingDistance") {
		assert(hammingDistance(3, 8) == 3, "")
	}

}