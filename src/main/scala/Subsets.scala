object Subsets extends App {
  def go_(a: Array[Int], i: Int, out: List[Option[Int]]): List[List[Option[Int]]] = {
    if (i == a.length) {
      List(out, List())
    } else {
      go_(a, i + 1, None :: out) ++ go_(a, i + 1, Some(a(i)) :: out)
    }
  }


  def go(a: Array[Int]) = {
    val size = math.pow(2, a.length).toInt

    val out = (1 to size).map(_ => new Array[Option[Int]](a.length))

    for (i <- 0 to (size - 1)) {
      val b = if (i.toBinaryString.length == a.length) {
        i.toBinaryString
      }
      else {
        val diff = a.length - i.toBinaryString.length
        (1 to diff).map(_ => '0').mkString ++ i.toBinaryString
      }

      for (j <- 0 to (a.length - 1)) {
        if (b(j) == '1') {
          out(i)(j) = Some(a(j))
        } else {
          out(i)(j) = None
        }
      }
    }

    out
  }

  def allSubsets(givenArray: Array[Int]) = {
    go(givenArray).map(_.toList).toList
  }
}
