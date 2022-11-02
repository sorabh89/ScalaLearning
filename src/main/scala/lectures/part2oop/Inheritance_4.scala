package lectures.part2oop

object Inheritance_4 extends App {

  class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")     //default is equal to public public
    protected def yawn = println("yaaeu")
    private def drink = println("chapchap")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      yawn      //protected can be used in subclasses
//      drink   //can't access as private
    }
  }

  val catObj = new Cat
  catObj.crunch
  catObj.eat
//  catObj.yawn     //can't access as it is protected
//  catObj.drink    //can't access as private


  //Constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)      //another constructor
  }

  class Adult(name: String, age: Int, id: String) extends Person(name)  // or extends Person(name, age)

  //Overriding

  class Dog(override val creatureType: String) extends Animal {
    //override modifier is required to override anything
//    override val creatureType: String = "override type"     //overridding in constructor
    override def eat = println("override eat")
  }

  val dog = new Dog("Lab")
  println(dog.creatureType)
  dog.eat

  //type substitution (polymorphism)
  val unknownAnimal: Animal = new Dog("K9")     //object of Dog in Animal variable
  unknownAnimal.eat

  //super like in java

  //preventing overrides
  //1- final for a member
  //2- final for the class
  //3- sealed - This will allow extension of a class in the same file but not in another file

  sealed class Animal2 {
    val creatureType = "wild"
  }

}
