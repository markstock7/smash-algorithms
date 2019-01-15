package algorithms.hashtable

import scala.collection.mutable

/**
  * https://leetcode.com/problems/two-sum/
  */
object TwoSum {
  def solution(nums: Array[Int], target: Int): Array[Int] = {
    var map: mutable.Map[Int, Int] = mutable.Map.empty
    for(i <- nums.indices) {
      val num = target - nums(i)
      if (map.contains(num)) return Array(map(num), i)
      map(nums(i)) = i
    }
    Array(-1, -1)
  }
}