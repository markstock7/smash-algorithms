package algorithms.array



object MergeIntervals {

	/**
		* https://leetcode.com/problems/merge-intervals
		* @param intervals
		* @return
		*/
	def solution(intervals: List[Interval]):  List[Interval] = {

		if (intervals.isEmpty) return intervals

		def merge(result: List[Interval], current: Interval, rest: List[Interval]): List[Interval] = {
			// no more interval need to merge
			if (rest.isEmpty) {
				result :+ current
			} else if (current.start <= rest.head.start && current.end >= rest.head.start) {
				merge(result, current.copy(end = Math.max(rest.head.end, current.end)), rest.tail)
			} else {
				merge(result :+ current, rest.head, rest.tail)
			}
		}

		val sortedIntervals = intervals.sortBy(_.start)
		merge(List.empty, sortedIntervals.head, sortedIntervals.tail)
	}
}