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
  
  case class ContinueException() extends Exception {}
  
  implicit class while_c(condition: =>Boolean) {
    
    def apply(body: =>Any):Unit = {
      while (condition) {
        try {
          body
        } catch {
          case x: ContinueException => Nil
          case x: Exception => throw x
        }
      }
    }
  }
  
  implicit def continue:Unit = {
    throw new ContinueException()
  }

  var i = -1

  while_c (i < 9) {
      i += 1
      if ( (i % 2) != 0 )
          continue
      println(i)
  }        

}
