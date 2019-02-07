package algorithms.array

object MergeSortedArray {
  def solution(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var k = m + n - 1
    var (i, j) = (m - 1, n - 1)
    while (i >= 0 && j >= 0) {
      if (nums2(j) > nums1(i)) {
        nums1(k) = nums2(j)
        j -= 1
      } else {
        nums1(k) = nums1(i)
        i -= 1
      }
      k -= 1
    }
    while ( j >= 0) {
      nums1(k) = nums2(j)
      k -= 1
      j -= 1
    }
  }
}