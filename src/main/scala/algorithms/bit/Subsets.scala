package algorithms.bit

/**
  * https://leetcode.com/problems/subsets
  */
object Subsets {
  def solution(nums: Array[Int]): List[List[Int]] = {
    if (nums.isEmpty) return List(List())
    var result: List[List[Int]] = List.empty
    
    val N = Math.pow(2, nums.length).toInt
    
    for (i <- 0 until N) {
      var elem: List[Int] = List.empty
      for (j <- nums.indices) {
        if (((i >> j) & 1) == 1) elem  = elem :+ nums(j)
      }
      result = result :+ elem
    }
    
    result
  }
}
