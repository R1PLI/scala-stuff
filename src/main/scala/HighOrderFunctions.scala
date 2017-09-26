import scala.math.{pow, sqrt}

object HighOrderFunctions {

  //exercise 1
  def exOneMapping(arr1: Array[Int]): Array[AnyVal] = arr1 map (_ * 2)

  def exOneDiff(arr1: Array[Int], arr2: Array[Int]): Array[Int] = arr1 diff arr2

  //exercise 2
  def filterEvenNumbers(arr: Array[Int]): Array[Int] = arr filter (_ % 2 equals 0)

  def filterInRange(arr: Array[Int], low: Int, high: Int): Array[Int] = {
    if (low > high) throw new IllegalArgumentException {
      "arg %d is bigger than %d".format(low, high)
    }
    arr filter (_ >= low) filter (_ <= high)
  }

  def squareItemsThenSumSqrt(arr: Array[Double]): Double = {
    //exercise 3
    sqrt(arr.map(item => pow(item, 2)).sum)

    //exercise 5
    val vpow = pow(_: Double, 2)
    val vsqrt = sqrt(_: Double)
    vsqrt apply (arr map (vpow apply) sum)
  }

  //exercise 4
  def sortByDescending(list: List[String]): List[Any] = list sortBy(- _.length)
}


