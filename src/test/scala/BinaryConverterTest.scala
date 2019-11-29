import org.scalatest.FunSuite

class BinaryConverterTest extends FunSuite {
  test("Binary Convertor") {
    assert(BinaryConverter.binaryConverter(244).===("11110100".toList))
  }
}
