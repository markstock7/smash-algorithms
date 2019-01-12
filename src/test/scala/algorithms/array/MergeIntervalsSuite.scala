package algorithms.array


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MergeIntervalsSuite extends FunSuite {
	import MergeIntervals._

	test("merge") {
		val intervals = List(Interval(1, 3), Interval(2,6), Interval(8,9), Interval(10,15))
		val intervals2 =  List(Interval(1, 3))
		assert(solution(intervals) ==  List(Interval(1,6), Interval(8,9), Interval(10,15)), "")
		assert(solution(intervals2) ==  List(Interval(1, 3)), "")
		assert(solution(List.empty) ==  List.empty, "")
		assert(solution(List(Interval(1,4), Interval(2,3))) == List(Interval(1, 4)), "")
	}

}