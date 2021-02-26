package playground

import scala.annotation.tailrec

object ScalaPlayground extends App {

  def sumDigitsNTimes(x:Int, y:Int, n:Int) : Int = {
    @tailrec
    def loop(x:Int, y:Int, n:Int, accumulator:Int = x): Int = {
      if (n <= 0) accumulator
      else loop(x, y, n - 1, accumulator + y)
    }
    loop(x, y, n)
  }

  def countDigitsInNumber(number:Int):Int = {
    @tailrec
    def loop(number:Int, accumulator:Int = 1):Int = {
      if (number / 10 == 0) accumulator
      else loop(number / 10, accumulator + 1)
    }
    loop(number)
  }

  def printNumberDigitsTimes(number: => Int) : String = {
    @tailrec
    def loop(number:Int, n:Int, accumulator:String="") : String = {
      if (n <= 0) s"$accumulator is the result"
      else loop(number, n - 1, s"$number $accumulator")
    }

    loop(number, countDigitsInNumber(number))
  }

  print(printNumberDigitsTimes(sumDigitsNTimes(10, 1, 5)))

}
