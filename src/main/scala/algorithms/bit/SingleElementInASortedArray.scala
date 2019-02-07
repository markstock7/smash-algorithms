package algorithms.bit

object SingleElementInASortedArray {
  def solution(nums: Array[Int]): Int = {
    nums.tail.fold(nums.head)(_ ^ _)
  }
  
  def solutionII(nums: Array[Int]): Int = {
    var low = 0
    var high = nums.length - 1
    while (low <= high) {
      var mid = low + (high - low) / 2
      if (mid + 1 < nums.length && nums(mid) == nums(mid + 1)) {
      } else if (mid - 1 >= 0 && nums(mid) == nums(mid - 1)) {
        mid = mid - 1
      } else {
        return nums(mid)
      }
      if ((mid - low) % 2 == 1) high = mid - 1
      else low = mid + 2
    }
    -1
  }
}
