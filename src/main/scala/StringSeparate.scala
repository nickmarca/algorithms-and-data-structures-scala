object StringSeparate extends App {

  def isEven (i: Int ) = i % 2 == 0

  def separate(l: List[Char], even: List[Char] = List(), odd: List[Char] = List(), index: Int = 0): (String, String) = {
    l match {
      case Nil => (even.reverse.mkString, odd.reverse.mkString)
      case i :: rest if isEven(index) => separate(rest, i :: even, odd, index + 1)
      case i :: rest => separate(rest, even, i :: odd, index + 1)
    }
  }

  val r  = separate(List('a','b', 'c', 'g', 'd'))
}

