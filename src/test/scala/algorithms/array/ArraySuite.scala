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

	test("Search Insert Position") {
		import SearchInsertPosition.searchInsert
		assert(searchInsert(Array(1,3,5,6), 7) == 4)
		assert(searchInsert(Array(1,3,5,6), 5) == 2)
		assert(searchInsert(Array(), 5) == -1)
	}

	test("Move Zeroes") {
		import MoveZeroes._
		val array = Array(0,1,0,3,12)
		solution(array)
		assert(array sameElements Array(1,3,12,0,0))
	}
}