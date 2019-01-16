package algorithms.bit

object MissingNumber {
  def solution(nums: Array[Int]): Int = {
    var result = nums.length
    for (i <- nums.indices) {
      result = result ^ i ^ nums(i)
    }
    result
  }
}
