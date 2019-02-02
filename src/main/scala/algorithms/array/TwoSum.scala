package algorithms.array

object TwoSum {
  /**
    * https://leetcode.com/problems/two-sum/
    * @param nums
    * @param target
    * @return
    */
  def twoSumI(nums: Array[Int], target: Int): Array[Int] = {
    for(i <- nums.indices) {
      for (j <- i + 1 until nums.length) {
        if (nums(i) + nums(j) == target) return Array(i, j)
      }
    }
    Array(-1, -1)
  }
  
  /**
    * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    * @param numbers
    * @param target
    * @return
    */
  def twoSumII(numbers: Array[Int], target: Int): Array[Int] = {
    var i = 0
    var j = numbers.length - 1
    while (i < j) {
      if (numbers(i) + numbers(j) > target) j = j - 1
      else if (numbers(i) + numbers(j) < target) i = i +1
      else return Array(i + 1, j + 1)
    }
    Array(-1, -1)
  }
}