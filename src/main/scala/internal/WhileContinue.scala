package internal
														
// I found this while looking for the scala exception syntax, which made it
// really obvious I was on the right track
import scala.util.control.ControlThrowable

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

object WhileContinue extends App {
  case object ContinueExn extends Exception("Loop continue")
      with ControlThrowable
  def continue = {throw ContinueExn}
  
  def while_c (cond: => Boolean) (body: => Unit): Unit = {
      if (cond) {
         try body
         catch {case ContinueExn => {}}
         while_c (cond) (body)
      } else ()
  }
  
  var i = -1

  while_c (i < 9) {
      i += 1
      if ( (i % 2) != 0 )
          continue
      println(i)
  }        

}
