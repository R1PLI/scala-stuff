package lab1

import scala.collection.immutable.Stream.continually
import util.Random.nextInt

class ArrayBuilder {
  def getArray(size: Int, maxNumber: Int) = (continually {
    nextInt(maxNumber)
  } take size).toList
}
