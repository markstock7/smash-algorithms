package algorithms.heap

import scala.collection.mutable

/**
  * https://leetcode.com/problems/kth-largest-element-in-a-stream/
  *
  * @param _k
  * @param _nums
  */
class KthLargest(_k: Int, _nums: Array[Int]) {
  private object MinOrder extends Ordering[Int] {
    def compare(x:Int, y:Int): Int = y compare x
  }
  
  private val minHeap: mutable.PriorityQueue[Int] = mutable.PriorityQueue.empty[Int](MinOrder)
  
  _nums.foreach(add)
  
  def add(num: Int): Int = {
    if (minHeap.size < _k)
      minHeap += num
    else if (num > minHeap.head) {
      minHeap.dequeue()
      minHeap += num
    }
    minHeap.head
  }
  
}
