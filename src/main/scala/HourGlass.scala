object HourGlass {

  def sum(h: Array[Array[Int]]): Int  = {
    h(0).sum + h(1)(1) + h(2).sum
  }

  def cropFrom(a: Array[Int], start: Int): Array[Int] = {
    val r = Array.ofDim[Int](3)
    r(0) = a(0 + start)
    r(1) = a(1 + start)
    r(2) = a(2 + start)
    r
  }

  def max(xs: List[Int]): Int = xs match {
    case List(x: Int) => x
    case x :: y :: rest => max((if (x > y) x else y)::  rest)
  }

  def main(args: Array[String]) {
    val arr = Array.ofDim[Int](6, 6)

    arr(0) = Array(99, 12, 9,  54, 9,  40)
    arr(1) = Array(1,  52, 71, 9,  10, 48)
    arr(2) = Array(81, 85, 98, 86, 38, 34)
    arr(3) = Array(86, 78, 32, 58, 61, 14)
    arr(4) = Array(99, 65, 12, 53, 38, 74)
    arr(5) = Array(86, 48, 90, 2,  96, 25)


    var e = 0;
    var i = 0;
    var j = 0;

    val h = Array.ofDim[Int](3, 3)
    var s: List[Int] = List()

    for(e <- 0 to 3) {
      for (i <- 0 to 3) {
        for (j <- 0 to 2) {
          h(j) = cropFrom(arr(j + e), i)
        }
        s = sum(h) :: s
      }
    }

    println(max(s))
  }
}
