package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

object WhileContinue extends App {

  // define the new control-flow structures here
  
  class ContinueException extends Exception;
  
  def while_c(pred: =>Boolean)(body: =>Unit) {
    while(pred) {
      try {
        body
      } catch {
        case e: ContinueException => ;
      }
    }
  }
  
  def continue = throw new ContinueException()
  
  var i = -1

  while_c (i < 9) {
      i += 1
      if ( (i % 2) != 0 )
          continue
      println(i)
  }        

}
