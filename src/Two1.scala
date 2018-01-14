import scala.collection.mutable.ArrayBuffer

class Two1 {

  private var age1 = 0
  private[this] var _aa: Int = 0
  val ss = ArrayBuffer[Int]()

  private def aa: Int = _aa

  private def aa_=(value: Int): Unit = {
    _aa = value
  }

  def age = age1 + "a"

  def age_=(newValue : Int): Unit ={
    if (newValue > age1) age1 = newValue
  }

 def aaa = ss += 1


}
