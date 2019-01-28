package algorithms.string


import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ReverseStringSuite extends FunSuite {
  import ReverseString._
  
  test("reverse string") {
    val array = Array('h','e','l','l','o')
    solution(array)
    assert(array.mkString == "olleh")
  }
}