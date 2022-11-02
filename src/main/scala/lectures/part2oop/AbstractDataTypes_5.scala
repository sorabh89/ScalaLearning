package lectures.part2oop

object AbstractDataTypes_5 extends App {

  abstract class Animal() {
    val creatureType : String
    def eat : Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("Abstract implementation")      //override keyword is not required for abstract classes
  }

  //Traits

  trait Carnivore {
    def eat(animal: Animal): Unit
    val prefereredMeal : String = "meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    val creatureType: String = "croc"
    def eat: Unit = println("hungry")
    def eat(animal: Animal): Unit = println(s"Hi, I'm $creatureType and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)


  //TRAITS VS ABSTRACT CLASSES
  //1- traits do not have constructor parameters
  //2- multiple traits can be inherited by the same class
  //3- traits - behaviours, abstract class is a type of thing
}
