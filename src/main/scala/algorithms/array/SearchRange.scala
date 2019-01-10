package algorithms.array

object SearchRange {
  
  private def binarySearchLastOne(nums: Array[Int], target: Int): Int = {
    var low = 0
    var high = nums.length - 1
    
    while (low <= high) {
      val mid = low + (high - low) / 2
      if (target < nums(mid)) high = mid - 1
      else low = mid + 1
    }
    high
  }
  
  def solution(nums: Array[Int], target: Int): Array[Int] = {
    if (nums == null || (nums.length == 0)) return Array[Int](-1, -1)
    val end = binarySearchLastOne(nums, target)
    val start = binarySearchLastOne(nums, target - 1) + 1
    
    if (start >= 0 && start <= end && end < nums.length)  Array[Int](start, end)
    else  Array[Int](-1, -1)
  }
}