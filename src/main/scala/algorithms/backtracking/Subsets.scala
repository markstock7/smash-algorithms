package algorithms.backtracking

/**
  * https://leetcode.com/problems/subsets
  */
object Subsets {
  def solution(nums: Array[Int]): List[List[Int]] = {
    if (nums.isEmpty) return List(List())
    val next = solution(nums.tail)
    next ++ next.map(_ :+ nums.head)
  }
}
