package lectures.part1basics

object Expressions_2 extends App {
  val x = 1 + 2
  println(x)

  val aCondition = true
  //Instructions (Do) vs Expressions (Value)

  //If Expression and not an If condition
  val aCondVal = if(aCondition) 5 else 3
  println(aCondVal)
  println(if(aCondition) 5 else 3)

  //---------

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }


  //Never write like this in Scala

  //Everything in scala is an Expression!

  var aVariable = 3

  val aWeirdValue = (aVariable = 3)  // Unit type in scala is void
  print(aWeirdValue)

  //side effects : println(), whiles, reassigning
  // everything in scala is an expression so everything returns a value (Unit is used as a void return type)

  //-------

  //Code Blocks

  val aCodeBlock = {                          //Type of aCodeBlock is String as the last expression
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else 0
  }


  //Expressions vs Instructions
  //--instructions are executed(think Java), expressions are evaluated(think Scala)
  //--in Scala we'll think in terms of expressions


  /*
  Questions:

  1. Difference between "Hello World" and println("Hello World")?
  Ans. String vs Unit(due to SIDE EFFECT of printing)

  2. Below code :
   */

  val someValue = { //Boolean
    2 < 3
  }

  val someOtherValue = {  //42
    if(someValue) 239 else 986
    42
  }

  println(someOtherValue)

}
