import HighOrderFunctions._
import org.scalatest.{FunSpec, Matchers}

class ExampleSpec extends FunSpec with Matchers {
    describe("Result array") {
    describe("when perform diff operation with another array") {
      it("should contain diff values") {
        val expectedResult = Array(1, 3)
        val actualResult = exOneDiff(Array(1, 4, 3), Array(4, 5, 6))
        assert(expectedResult sameElements actualResult)
      }
    }
    describe("when all elements doubled") {
      it("should contain doubled values") {
        val result = exOneMapping(Array(1, 2, 3))
        assert(result sameElements Array(2, 4, 6))
      }
    }
    describe("when filtered") {
      describe("by evenness") {
        it("should have values") {
          val result = filterEvenNumbers(Array(1, 2, 3, 4, 5, 6, 7, 8))
          assert(result sameElements Array(2, 4, 6, 8))
        }
      }
      describe("by values in range") {
        it("should have values") {
          val result = filterInRange(Array(9, 11, 101), 10, 100)
          assert(result sameElements Array(11))
        }
        it("should not contain any elements") {
          val result = filterInRange(Array(9, 11, 101), 12, 100)
          assert(result.isEmpty)
        }
        it("should throw IllegalArgumentException") {
          assertThrows[IllegalArgumentException] {
            val result = filterInRange(Array(9, 101, 10), 100, 10)
            assert(result.isEmpty)
          }
        }
      }
    }
  }
  describe("Math thing") {
    it("Method should return sqrt value of summing squared values in array") {
      val result = squareItemsThenSumSqrt(Array(1, 2, 3))
      assert(result == 3.7416573867739413)
    }
  }

  describe("Method should sort list") {
      it("in DESC order") {
        val result = sortByDescending(List("hi","hello","greetings"))
        assert(result == List("greetings", "hello", "hi"))
      }
  }
}