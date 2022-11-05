package lectures.part1basics

import scala.annotation.tailrec

object Recursion_4 extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("computed factorial of " + n)
      result
    }
  println(factorial(10))

//  println(factorial(5000))  //most probably StackOverflow exception

  def optimizedFactorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator)                              // Tail Recursion = use recursive call as the last expression

    factHelper(n, 1)
  }

  println(optimizedFactorial(10))
  println(optimizedFactorial(5000))


  // WHEN YOU NEED LOOPS USE TAIL RECURSION

  /*
  1. Concatenate a string n times
  2. isPrime function tail recursive
  3. Fibonacci function tail recursive
   */

  def concatenateStr(str: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatenateStr(str, n-1, accumulator + str)
  }

  println(concatenateStr("Hell", 4, ""))


  def isPrime(n: Int): Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t -1, n % t != 0 && isStillPrime)
    }
    isPrimeTailRec(n/2, true)
  }

  println(isPrime(2003))



  def fibonnaci(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, secondLast: Int): Int =
      if (i >= n) last
      else fiboTailRec(i + 1, last + secondLast, last)

    if(n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibonnaci(8))

}
