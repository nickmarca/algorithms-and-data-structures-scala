import org.scalatest.FunSuite

class SubsetsTest extends FunSuite {

  val subsets1 = List[List[Option[Int]]](
    List(None, None),
    List(None, Some(1)),
    List(Some(2), None),
    List(Some(2), Some(1))
  )

  val subsets2 = List[List[Option[Int]]](
    List(None, None, None, None),
    List(None, None, None, Some(1)),
    List(None, None, None, Some(2)),
    List(None, None, None, Some(3)),
    List(None, None, None, Some(4)),
    List(None, None, Some(1), Some(2)),
    List(None, None, Some(1), Some(3)),
    List(None, None, Some(1), Some(4)),
    List(None, None, Some(2), Some(3)),
    List(None, None, Some(2), Some(4)),
    List(None, None, Some(3), Some(4)),
    List(None, Some(1), Some(2), Some(3)),
    List(None, Some(1), Some(2), Some(4)),
    List(None, Some(1), Some(3), Some(4)),
    List(None, Some(2), Some(3), Some(4)),
    List(Some(1), Some(2), Some(3), Some(4))
  )

  test("Subsets for 2") {
    val p = Subsets.allSubsets(Array(1, 2)).map(_.sorted).sortWith((a, b) => a.mkString < b.mkString)
    val q = subsets1.map(_.sorted).sortWith((a, b) => a.mkString < b.mkString)

    assert(p sameElements q)
  }

  test("Subsets for 4") {
    val p = Subsets.allSubsets(Array(1, 2, 3, 4)).map(_.sorted).sortWith((a, b) => a.mkString < b.mkString)
    val q = subsets2.map(_.sorted).sortWith((a, b) => a.mkString < b.mkString)

    println(p)

    assert(p sameElements q)
  }
}
