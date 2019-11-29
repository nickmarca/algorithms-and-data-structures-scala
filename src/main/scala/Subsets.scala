object Subsets extends App {
  def go[A](givenArray: Array[A], subset: Array[Option[A]], i: Int): List[List[Option[A]]] = {
    if(i == givenArray.length) {
      List(subset.toList)
    } else {
      subset(i) = None
      val l1 = go(givenArray, subset, i + 1)
      subset(i) = Some(givenArray(i))
      val l2 = go(givenArray, subset, i + 1)
      l1 ++ l2
    }
  }

  def allSubsets[A](givenArray: Array[A]) = {
    val subset = new Array[Option[A]](givenArray.length)

    go[A](givenArray, subset,  0)
  }
}
