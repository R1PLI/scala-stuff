package lab2

import lab2.HighOrderFunctions._
import org.scalatest.{FunSuite, Matchers}

class ExampleSpecFunSuite extends FunSuite with Matchers {
  test("Result array should contain diff values after performing diff operation with another array") {
    val expectedResult = Array(1, 3)
    val actualResult = exOneDiff(Array(1, 4, 3), Array(4, 5, 6))
    assert(expectedResult sameElements actualResult)
  }

  test("Result array should contain doubled values when all elements doubled") {
    val result = exOneMapping(Array(1, 2, 3))
    assert(result sameElements Array(2, 4, 6))
  }

  test("Result array should only contain even numbers after filter") {
    val result = filterEvenNumbers(Array(1, 2, 3, 4, 5, 6, 7, 8))
    assert(result sameElements Array(2, 4, 6, 8))
  }

  test("Result array should only contain numbers in given range after filter") {
    val result = filterInRange(Array(9, 11, 101), 10, 100)
    assert(result sameElements Array(11))
  }

  test("Result array should not contain any values after filter") {
    val result = filterInRange(Array(9, 11, 101), 12, 100)
    assert(result.isEmpty)
  }

  test("Should throw IllegalArgumentException") {
    assertThrows[IllegalArgumentException] {
      val result = filterInRange(Array(9, 101, 10), 100, 10)
      assert(result.isEmpty)
    }
  }

  test("Method should return sqrt value of summing squared values in array") {
    val result = squareItemsThenSumSqrt(Array(1, 2, 3))
    assert(result == 3.7416573867739413)
  }

  test("Method should sort list in DESC order") {
    val result = sortByDescending(List("hi", "hello", "greetings"))
    assert(result == List("greetings", "hello", "hi"))
  }

  test("Method should return even number from list") {
    val list = List(1, 2, 3, 4, 5, 6)

    def isEven(x: Int): Boolean = x % 2 == 0

    val result = findNumericSublistByPredicate(list, isEven)
    assert(result == List(2, 4, 6))
  }

  test("Method should return odd values from list") {
    val list = List(1, 2, 3, 4, 5, 6)

    def isOdd(x: Int): Boolean = x % 2 != 0

    val result = findNumericSublistByPredicate(list, isOdd)
    assert(result == List(1,3,5))
  }
}
