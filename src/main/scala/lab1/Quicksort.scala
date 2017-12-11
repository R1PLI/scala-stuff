package lab1

object Quicksort {
  def sort(a: Seq[Int]): Seq[Int] =
    if (a.lengthCompare(2) < 0) a
    else {
      val pivot = a(a.length / 2)
      sort(a filter (pivot >)) ++ (a filter (pivot ==)) ++
        sort(a filter (pivot <))
    }
}
