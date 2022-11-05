package lectures.part1basics

object CBNvsCBV_5 extends App {

  def callByValue(x: Long): Unit = {
    println("by Value: "+ x)      // pre calculated time
    println("by Value: "+ x)      // pre calculated time
  }

  def callByName(x: => Long): Unit = {
    println("by Name: "+ x)       // calculated time here
    println("by Name: "+ x)       // calculated time here
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())


  def printSomething(): Int = {
    println("print something function")
    1
  }

  def printByVal(x: Int, y: Int) =
    println(x)

  def printByName(x: Int, y: => Int) =
    println(x)

  printByVal(10, printSomething())
  printByName(10, printSomething())                   // Call by name delays the execution till its used, hence printSomething will not be called as it is not used
}
