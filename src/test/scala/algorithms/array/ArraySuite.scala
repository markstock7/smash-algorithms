package algorithms.array

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ArraySuite extends FunSuite {

	test("Binary Search") {
		import BinarySearch.search
		assert(search(Array(-2, 0, 2, 4, 5, 8, 9), 5) ==  4, "")
	}
}