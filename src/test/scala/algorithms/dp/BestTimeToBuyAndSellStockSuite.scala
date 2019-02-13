package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BestTimeToBuyAndSellStockSuite extends FunSuite {
  import BestTimeToBuyAndSellStock._
  
  test("solution") {
    assert(maxProfit(Array(7,1,5,3,6,4)) == 5)
    assert(maxProfit(Array(7,6,4,3,1)) == 0)
    assert(maxProfit(Array(1)) == 0)
    assert(maxProfit(Array()) == 0)
    assert(maxProfit(Array(1,2,1)) == 1)
    assert(maxProfit(Array(1,2,3)) == 2)
    assert(maxProfit(Array(1,1)) == 0)
  }
}
