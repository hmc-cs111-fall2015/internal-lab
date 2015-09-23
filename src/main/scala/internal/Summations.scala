package internal

/**
 * @author Rhubarb
 */
object Summations extends App {
  def ∑(vals: Seq[Int]) = vals.sum
  println(∑(for {i <- 1 to 10} yield {println(i); i}))
}