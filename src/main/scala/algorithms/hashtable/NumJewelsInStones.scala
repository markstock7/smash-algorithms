package algorithms.hashtable

object NumJewelsInStones {
  /**
    * https://leetcode.com/problems/jewels-and-stones/
    * @param J
    * @param S
    * @return
    */
  def solution(J: String, S: String): Int = {
    if (J == null || S == null || (J.length == 0) || (S.length == 0)) return 0
    val d = new Array[Boolean](256)
    var cnt = 0
    var i = 0
    for (i <- 0 until J.length) d(J.charAt(i)) = true
    for (i <- 0 until S.length if d(S.charAt(i))) cnt += 1
    cnt
  }
}