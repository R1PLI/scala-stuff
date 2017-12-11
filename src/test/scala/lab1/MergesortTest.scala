package lab1

import org.scalatest.FunSuite

class MergesortTest extends FunSuite {
  val array = new ArrayBuilder
  test("Mergesort performance testing") {
    Mergesort.mergeSort(array.getArray(1000, 100000))
  }

}
