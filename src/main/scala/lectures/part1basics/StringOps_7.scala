package lectures.part1basics

object StringOps_7 extends App {

  val str: String = "Hello! I'm learning Scala"
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)


  //scala specific string opertions

  val aNum: String = "4"
  val num: Int = aNum.toInt

  println(num)
  println('a' +: aNum :+ 'z')

  var lst = List(1,2,3)
  println(lst)
  println('a' +: lst :+ 'z')

  println(str.reverse)
  println(str.take(2))


  //scala specific string interpolators

  //S-interpolators
  val name ="David"
  val age = 12
  val greeting = s"Hello, my name is $name and I'm $age years old"
  val anotherGreeting = s"Hello, my name is $name and I'll be turning ${age+1} years old"

  println(greeting)
  println(anotherGreeting)


  //F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"      //%2.2f formatter means atleast 2 characters total minimum and 2 decimal precision

  println(myth)

  //raw-interpolators
  println(raw"This is \n line")

  val escaped = "This is \n line"
  println(raw"$escaped")

}
