package lecture.part1basics

object Functions extends App {

  def aFunction(x: String, y: Int): String = {
    x + " " + y
  }

  println(aFunction("Hello", 1))

  def aLoopAlternative(x: String, y: Int): String = {
    if (y == 1) x
    else
      x + aLoopAlternative(x, y-1)
  }
  // Recursive functions to replace Loop
  // Avoid loop and convert into the recursive
  println(aLoopAlternative("Hello \n",4))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  // lecture.part1basics Excercise Greeting Function
  def aGreeting(name: String, n: Int): String = {
    "Hi, My Name is " + name + " and I am " + n + " years old"
  }
 println(aGreeting("Manish", 42))
  // lecture.part1basics Excercise Factorial Function
  def aFactorial(n: Int): Int = {
    if(n<=1) n
    else{
      n * aFactorial(n-1)
    }
  }
  println(aFactorial(5))

  // lecture.part1basics Excercise Fibonacci Function
  def aFibonacci(n: Int): Int = {
  if(n<=2) 1
  else{
    aFibonacci(n-1) + aFibonacci(n-2)
  }
  }
 println(aFibonacci(8))

  // lecture.part1basics Excercise Prime Number Function
  /*def aPrime(n: Int): Boolean = {

  }*/
}
