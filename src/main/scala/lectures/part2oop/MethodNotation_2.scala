package lectures.part2oop

//import scala.language.postfixOps

object MethodNotation_2 extends App {
  class Person(val name: String, favouriteMovie: String) {
    def likes(movie: String): Boolean = movie == favouriteMovie

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    //same as above function but defined as an operator
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck?"   // IMP - give space between ! and : otherwise : will be considered as part of unary

    def isAlive: Boolean = true


    def apply(): String = s"$name's favourite movie is $favouriteMovie"       //apply needs brackets
    def apply(count: Int): String = s"$name watched $favouriteMovie $count times"

  }

  val mary = new Person("mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")           //equivalent to the above line  //operator notation // only works with methods with single parameter
  //Infix notation = operator notation  (syntactic sugar)

  //"operators" in scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)

  println(mary + tom)
  println(mary.+(tom))

  // So the takeaway is that all operators in scala are functions

  println(1 + 2) //can be written as
  println(1.+(2))


  //prefix notation
  val x = -1    //equivalent to
  val y = 1.unary_-

  //unary_ operator works only with - + ~ !
  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
//  println(mary isAlive)   //Imp postfix notations are disabled by default. To enable it use import clause 'import scala.language.postfixOps'


  //special method apply()
  println(mary.apply())
  println(mary())   //This is equivalent to calling apply method. Apply is a special method and works like this.
                    // Remember if the implementation of apply is not provided then this line will throw error

  println(mary(10))
}
