package lectures.week1basics

object Functions extends App {

  def aPerson (name : String, surname : String) : String = {
    s"$name $surname"
  }

  println(aPerson("Denis", "Tak"))

  def aFunctionWithDefaultParameter(x: Int, y: String = "Default Parameter"): String = {
    s"x = $x and y = $y"
  }

  println(aFunctionWithDefaultParameter(1)) // выводит x = 1 and y = Default Parameter
  println(aFunctionWithDefaultParameter(1, "Hello"))

  //Вызов по значению - параметр вычисляется перед выполнением функции один раз
  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }

  //Вызов по имени - параметр вычисляется непосредственно перед использованием каждый раз
  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
