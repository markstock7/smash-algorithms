package algorithms.backtracking


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import utils.Helper

@RunWith(classOf[JUnitRunner])
class WordSearchSuite extends FunSuite {
  
  import WordSearch._
  
  test("exist") {
    assert(exist(Array(Array('A','B','C','E'),Array('S','F','C','S'),Array('A','D','E','E')), "ABCCED"))
  }
}