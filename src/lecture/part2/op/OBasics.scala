package lecture.part2.op

object OBasics extends App {
val person = new Person("John", age = 26)
  println(person.age)
}

class Person(Name: String, val age: Int) // Constructor

// Class parameter are not field or member
// Class parameter and class field are two different things in Scala

