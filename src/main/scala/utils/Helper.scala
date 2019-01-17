package utils

object Helper {
  
  def l2Str[T](a: List[T]) = s"[${a.mkString(",")}]"
  def l2StrSorted[T](a: List[T]): String = a.map(_.toString).sorted.mkString
  def ll2StrSorted[T](a: List[List[T]]): String = a.map(_.map(_.toString).sorted.mkString).sorted.mkString
  
  def lcompare[T](a: List[T], b: List[T]): Boolean = {
    if (a.length != b.length) return false
    for (i <- a.indices) if (!(a(i) equals b(i))) return false
    true
  }
  
  def llcompare[T](a: List[List[T]], b: List[List[T]]): Boolean = {
    if (a.length != b.length) return false
    for (i <- a.indices) if (!lcompare(a(i), b(i))) return false
    true
  }
  
  def llUnsortedCompare[T](a: List[List[T]], b: List[List[T]]): Boolean = {
    if (a.length != b.length) return false
    ll2StrSorted(a) == ll2StrSorted(b)
  }
}
