package algorithms.dp

/**
  * https://leetcode.com/problems/ugly-number-ii/
  */
object NthUglyNumber {
  def solution(n: Int): Int = {
    val uglyNumbers: Array[Int] = Array.ofDim(n)
    uglyNumbers(0) = 1
    var p2 = 0
    var p3 = 0
    var p5 = 0
    for (i <- 1 until n) {
      val min = Math.min(Math.min(uglyNumbers(p2) * 2, uglyNumbers(p3) * 3), uglyNumbers(p5) * 5)
      uglyNumbers(i) = min
      if (min == uglyNumbers(p2) * 2) p2 += 1
      if (min == uglyNumbers(p3) * 3) p3 += 1
      if (min == uglyNumbers(p5) * 5) p5 += 1
    }
    uglyNumbers(n - 1)
  }
}