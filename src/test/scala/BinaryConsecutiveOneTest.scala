import org.scalatest.FunSuite

class BinaryConsecutiveOneTest extends FunSuite {
  test("from 13") {
    assert(BinaryConsecutiveOne.from(13) === 2)
  }

  test("from 391") {
    assert(BinaryConsecutiveOne.from(391) === 3)
  }

  test("from 7") {
    assert(BinaryConsecutiveOne.from(7) === 3)
  }
}
