package lectures.part1basics

object Functions_3 extends App {

  def aFunction(a: String, b: Int): String =
    a + ' ' + b

  println(aFunction("hello", 3))

  def paramLessFunc(): Int = 4
  println(paramLessFunc())
  println(paramLessFunc)      //No need of () for zero param functions

  //-------------
  // Instead of loops try to use functions:

  def aRepFunc(str: String, n: Int): String = {
    if (n == 1) str
    else str + aRepFunc(str, n-1)
  }

  println(aRepFunc("Hello", 3))

  //When you need Loops, use Recursions.

  //A function can be defined in a code block as well

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b:Int): Int = a + b
    aSmallerFunction(n, n-1)
  }

  println(aBigFunction(5))


  /*
  1. A greetings function(name, age) => "Hi, my name is $name and I'm $age years old."
  2. Factorial function 1 * 2 * 3 * ... * n
  3. Fibonnaci function
  4. Test if a no. is prime
   */

  def greetings(name: String, age: Int): String =
    "Hi, my anme is " + name + " and I'm " + age + " years old."

  println(greetings("sk", 4))

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(5))

  def fibonnaci(n: Int) : Int = {
    if (n <= 2) 1
    else fibonnaci(n-1) + fibonnaci(n-2)
  }

  println(fibonnaci(5))


  def isPrime(n: Int) : Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    isPrimeUntil(n/2)
  }

  println(isPrime(37))
}
