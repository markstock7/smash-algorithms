package algorithms.dp

object CountBits {
  def solution(num: Int): Array[Int] = {
    val d = new Array[Int](num + 1)
    for (i <- 1 to num) d(i) = d(i & (i - 1)) + 1
    d
  }
}
