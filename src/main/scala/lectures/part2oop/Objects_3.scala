package lectures.part2oop

object Objects_3 extends App {

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("STATIC")

  object Person {
    //Scala does not support parameters for objects like for class
    val N_EYES = 2
    def canFly: Boolean = false

    def apply() : Person = new Person
  }

  println(Person.N_EYES)
  println(Person.canFly)

  //Singleton

  val mary = Person   //referring object
  val john = Person   //referring object
  println(mary == john)   //true

  class Person {    //WE CAN HAVE OBJECT AND CLASS OF SAME NAME AND THIS DESIGN PATTERN IS CALLED AS COMPANIONS
    //instance level functionality
  }

  val maryC = new Person   //referring class
  val johnC = new Person   //referring class
  println(maryC == johnC)   //false

  val bob = Person()

  //Scala applications = Scala object with
  //def main(args: Array[String]): Unit

}
