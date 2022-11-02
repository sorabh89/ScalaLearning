package lectures.part2oop

object OOBasics1 extends App {
  val person = new Person
  println(person)

  val person1 = new Person1("John", 21)
  //println(person1.age) //error as class parameters are NOT FIELDS

  val person2 = new Person2("John", 21)
  println(person2.age)
}

class Person

//class parameters are NOT FIELDS
class Person1(name: String, age: Int) //constructor

//To convert class parameters to class fields, add val/var to the parameters
class Person2(val name: String, val age: Int) //constructor
