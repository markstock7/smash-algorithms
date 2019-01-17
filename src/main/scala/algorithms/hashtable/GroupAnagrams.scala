package algorithms.hashtable

import scala.collection.mutable

/**
  * https://leetcode.com/problems/group-anagrams
  */
object GroupAnagrams {
  
  // O(NlogN)
  private def strKey(str: String): String = str.sorted
  
  private def strKey2(str: String): String = {
    var c: Array[Int] = Array.ofDim(26)
    str.foreach { char =>
      c(char - 'a') += 1
    }
    c.mkString
  }
  
  def solution(strs: Array[String]): List[List[String]] = {
    if (strs.isEmpty) return List.empty
    
    val map: mutable.Map[String, List[String]] = mutable.Map.empty
    
    strs.foreach { str =>
      val key = strKey2(str)
      map(key) = map.getOrElse(key, List.empty) :+ str
    }
    
    map.values.toList
  }
}