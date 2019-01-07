package algorithms.dp

import scala.util.control.Breaks._

object WordBreak {
  
  /**
    * https://leetcode.com/problems/word-break/
    * https://blog.csdn.net/c_flybird/article/details/80703494
    * if f(i) == true then f(i) + word == true
    * @param s
    * @param wordDict
    * @return
    */
  def solution(s: String, wordDict: List[String]): Boolean = {
    val n = s.length
    val d = new Array[Boolean](n + 1)
    d(0) = true
    val set = wordDict.map((_, true)).toMap

    for (i <- 1 to n) {
      breakable {
        for (j <- i - 1 to 0 by -1) {
          if (d(j) && set.contains(s.substring(j, i))) {
            d(i) = true
            break
          }
        }
      }
    }
    d(n)
  }
}