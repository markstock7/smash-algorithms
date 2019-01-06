package algorithms.array


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RotateArraySuite extends FunSuite {
  import RotateArray._
  
  test("rotateArray") {
    val metrics = Array(Array(1,2,3), Array(4, 5, 6), Array(7,8,9))
    rotate(metrics)
    assert(metrics.map(_.mkString(",")).mkString(",") == "7,4,1,8,5,2,9,6,3", "")
  }
  
}