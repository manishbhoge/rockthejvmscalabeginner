package lecture.part1basics

object ValueVariableType extends App {
  val x : Int = 42
  println(x)

  // Values are immutable
 // Compiler can infer types

  val aString: String = "Manish"
  val aBoolean: Boolean = true
  val aInt: Int = x
  val aShort: Short = 234
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14
  val aChar: Char = 'A'

  // Variable
  // Difference between Variable and Types are: they can be reassigned

  var aVariable = 5 //side effects

  // side effect in functional programming, program without side effect is easy to understand
  // Functional programming is deal less with Variables

}
