package lectures.part2oop

object OOBasics2 extends App {
  val employee = new Employee("John", 19)
  println(employee.x)   //hello is printed first and then the value of x because the body of th class is called first

  employee.greet("Daniel")  //John says Hi, Daniel
}

class Employee(val name: String, val age: Int) {
  val x = 2
  println("hello")

  def greet(name: String): Unit = println(s"${this.name} says Hi, $name")

  //multiple constructor
  def this(name: String) = this(name, 0)    // The limitation here is you can't give a different implementation other than calling another constructor

  def this() = this("Johnny")   //can only call another constructor
  //Better approach of handling this s to use default parameters in the class constructor
  //Eg.  the class can be defined as below
  //class Employee(val name: String = "Johnny", val age: Int = 0) {
}
