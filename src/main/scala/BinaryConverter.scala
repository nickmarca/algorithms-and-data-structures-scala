object BinaryConverter extends App {
  def binaryConverter(n: Int) = {
    helper(n)
  }

  def isEven(i: Int) = i % 2 == 0

  def helper(i: Int, a: List[Char] = List() ): List[Char] = {
    i match {
      case n if n < 1 => a
      case n if isEven(n) => helper(math.floor(n / 2).toInt, '0' :: a)
      case n => helper(math.floor(n / 2).toInt, '1' :: a)
    }
  }
}
