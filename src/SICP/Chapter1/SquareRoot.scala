package SICP.Chapter1

/**
 * Created by Jonathan Taylor on 29/03/2014.
 */
object SquareRoot {

  def squareRoot(x: Double) = {
    def goodEnough(guess: Double) = Math.abs(guess * guess - x) < 0.001
    def average(x: Double, y: Double) = (x + y) / 2
    def improve(guess: Double) = average(guess, x / guess)
    def loop(guess: Double): Double = if (goodEnough(guess)) guess else loop(improve(guess))
    loop(1.0)
  }

  private def showResult(x: Double) = {
    println("sqrt(%f): %f".format(x, squareRoot(x)))
  }

  def main(args: Array[String]) = {
    showResult(4)
    showResult(16)
    showResult(25)
    showResult(2.0)
  }
}
