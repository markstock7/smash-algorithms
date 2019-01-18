package algorithms.greedy


object JumpGame {
  import scala.util.control.Breaks._
  /**
    * https://leetcode.com/problems/jump-game
    * @param nums
    * @return
    */
  def canJump(nums: Array[Int]): Boolean = {
    if (nums.isEmpty) return false
    var max = 0
    val n = nums.length
    for (i <- nums.indices) {
      if (max >= n - 1) return true
      if (i > max) return false
      max = Math.max(max, i + nums(i))
    }
    false
  }
  
  /**
    * https://leetcode.com/problems/jump-game-ii/
    * T: O(n)
    * S: O(n)
    * j <= i + nums(i)
    * @param nums
    * @return
    */
  def jump(nums: Array[Int]): Int = {
    if (nums.isEmpty) return -1
    var max = 0
    val n = nums.length
    val d = Array.ofDim[Int](n)
    for (i <- nums.indices) {
      if (max >= n -1) return d(n -1)
      if (i > max) return -1
      max = Math.max(max, i + nums(i))
      val last = Math.min(max, n - 1)
      breakable {
        for (j <- last until i by -1) {
          if (d(j) != 0) break
          d(j) = d(i) + 1
        }
      }
    }
    -1
  }
  
  
  
  /**
    * https://leetcode.com/problems/jump-game-ii/
    * T: O(n)
    * S: O(1)
    * Every move that makes max bigger, then steps plus 1
    * @param nums
    * @return
    */
  def jump2(nums: Array[Int]): Int = {
    if (nums.isEmpty) return -1
    if (nums.length == 1) return 0
    var max = 0
    val n = nums.length
    var jumps = 0
    var curEnd = 0
    
    for (i <- nums.indices) {
      if (max >= n - 1) return jumps + 1
      if (i > max) return -1
      if (i > curEnd) {
        jumps += 1
        curEnd = max
      }
      max = Math.max(max, i + nums(i))
    }
    -1
  }
}
