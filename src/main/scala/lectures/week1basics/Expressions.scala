package lectures.week1basics

object Expressions extends App {

  val aCondition = true

  val ifExpressionValue = if (aCondition) "True Condition" else "False Condition"
  println(ifExpressionValue)

  val someVal = println("I just want to print")
  println(someVal.getClass)

}
