package lecture.part1basics

object Expressions extends App {

  val x = 2 + 1 //expression
  println(x)

  println(2+3*4)

  println(1==x)
  println(!(2==x))

  // instruction (Do) v/s expression (Value)

  val aCondition=true

  val aConditionVal = if(aCondition) 5 else 10

  println(aConditionVal)

  // Everything in Scala is an expression
  var aVariable=0
  val aWeirdVal = (aVariable==3)
  println(aWeirdVal)

  val aWhile = while(aVariable<=9){
    // println(aVariable)
    aVariable+=1
  }

  println(aWhile)

  val someValue = {
  2<3
}
  println(someValue)


}
