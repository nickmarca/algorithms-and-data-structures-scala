object BinaryConsecutiveOne extends App {

  def from(i: Int): Int = {
    val b = BinaryConverter.binaryConverter(i)

    helper(b)
  }

  def helper(l: List[Char], s: Int = 0, m: Int = 0): Int = {
    l match {
      case Nil => s
      case '1' :: rest => helper(rest, if (s < (m + 1)) m + 1 else s, m + 1)
      case '0' :: rest => helper(rest, s, 0)
    }
  }
}
