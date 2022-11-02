package lectures.part1basics

object DefaultArgs_6 extends App {

  def trFact(n: Int, acc: Int = 1): Int =   // default values
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  val fact10 = trFact(10)
  val fact102 = trFact(10, 2)

  def savePicture(format: String = "jpeg", height: Int, width: Int) = println(format)

//  savePicture(10, 10) //error as the first parameter expected is string,

  savePicture(height = 10, width = 10)  // Since the default parameters are not in the end to use default values we need to mention the parameter name
}
