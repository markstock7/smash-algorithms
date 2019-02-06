package algorithms.bit

object SumOfTwoIntegers {
  def getSum(a: Int, b: Int): Int = {
    // b == 0 means there is no carry
    if (b == 0) a else getSum(a ^ b, (a & b) << 1)
  }
}