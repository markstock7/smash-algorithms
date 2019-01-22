package algorithms.sorting

object Sort {
  
  private def swap(arr: Array[Int], i1: Int, i2: Int): Unit = {
    val temp = arr(i1)
    arr(i1) = arr(i2)
    arr(i2) = temp
  }
  def bubbleSort(arr: Array[Int]): Array[Int] = {
    for (i <- arr.indices)
      for (j <- i until arr.length)
        if (arr(i) > arr(j)) swap(arr, i, j)
    arr
  }
  
  def countingSort(arr: Array[Int]): Array[Int] = arr
  def heapSort(arr: Array[Int]): Array[Int] = arr
  def insertionSort(arr: Array[Int]): Array[Int] = arr
  def quickSort(arr: Array[Int]): Array[Int] = arr
  def radixSort(arr: Array[Int]): Array[Int] = arr
  def selectionSort(arr: Array[Int]): Array[Int] = arr
  def shellSort(arr: Array[Int]): Array[Int] = arr
}