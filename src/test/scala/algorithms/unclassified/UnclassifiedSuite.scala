package algorithms.unclassified


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class UnclassifiedSuite extends FunSuite {

	test("SearchA2DMatrixII") {
		val array = Array(
			Array(1,4,7,11,15),
			Array(2,5,8,12,19),
			Array(3,6,9,16,22),
			Array(10,13,14,17,24),
			Array(18,21,23,26,30)
		)
		assert(SearchA2DMatrixII.searchMatrix(array, 9))
		assert(!SearchA2DMatrixII.searchMatrix(array, 229))
		assert(SearchA2DMatrixII.searchMatrix(array, 1))
		assert(!SearchA2DMatrixII.searchMatrix(array, -9))
	}

}