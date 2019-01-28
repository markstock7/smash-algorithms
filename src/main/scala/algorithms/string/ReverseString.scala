package algorithms.string

object ReverseString {
  /**
    * https://leetcode.com/problems/reverse-string
    * @param s
    */
  def solution(s: Array[Char]): Unit = {
    var j = s.length - 1
    var i = 0
    while (i < j) {
      val temp = s(i)
      s(i) = s(j)
      s(j) = temp
      i = i + 1
      j = j - 1
    }
  }
}