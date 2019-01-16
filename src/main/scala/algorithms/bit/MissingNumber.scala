package algorithms.bit

/**
  * https://leetcode.com/problems/missing-number/
  */
object MissingNumber {
  def solution(nums: Array[Int]): Int = {
    var result = nums.length
    for (i <- nums.indices) {
      result = result ^ i ^ nums(i)
    }
    result
  }
}
