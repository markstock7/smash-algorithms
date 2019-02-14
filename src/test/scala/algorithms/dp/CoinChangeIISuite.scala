package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CoinChangeIISuite extends FunSuite {
  import CoinChangeII._
  
  test("Coin Change II") {
    assert(solution(11, Array(1, 2, 5)) == 11)
    assert(solution(5, Array(1, 2, 5)) == 4)
    assert(solution(12, Array(1, 7, 3, 4, 5)) == 21)
    assert(solution(12, Array(5)) == 0)
    assert(solutionII(11, Array(1, 2, 5)) == 11)
    assert(solutionII(5, Array(1, 2, 5)) == 4)
    assert(solutionII(12, Array(1, 7, 3, 4, 5)) == 21)
    assert(solutionII(12, Array(5)) == 0)
  }
}
