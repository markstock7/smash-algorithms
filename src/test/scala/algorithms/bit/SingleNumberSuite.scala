package algorithms.bit


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SingleNumberSuite extends FunSuite {
	import SingleNumber._

	test("singleNumber") {
		assert(singleNumber(Array(1, 3, 1, 3, 2)) == 2)
	}
}