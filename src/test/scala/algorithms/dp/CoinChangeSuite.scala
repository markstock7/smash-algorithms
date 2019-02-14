package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CoinChangeSuite extends FunSuite {
  import CoinChange._
  
  test("Coin Change") {
    assert(solution(Array(1, 2, 5), 11) == 3)
    assert(solution(Array(1, 2, 5), 5) == 1)
    assert(solution(Array(1, 7, 3, 4, 5), 12) == 2)
    assert(solutionII(Array(1, 2, 5), 11) == 3)
    assert(solutionII(Array(1, 2, 5), 5) == 1)
    assert(solutionII(Array(1, 7, 3, 4, 5), 12) == 2)
  }
}
