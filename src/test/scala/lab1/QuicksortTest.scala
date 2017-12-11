package lab1

import org.scalatest.FunSuite

class QuicksortTest extends FunSuite {
  val array = new ArrayBuilder
  test("Quicksort performance testing") {
    Quicksort.sort(array.getArray(10000, 100000))
  }

}
