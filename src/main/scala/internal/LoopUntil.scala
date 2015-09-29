package internal
import scala.language.implicitConversions


/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */
object LoopUntil extends App {
  
  implicit class loop_until(condition: =>Boolean) {
    
    def apply(body: =>Any):Unit = {
      while (!condition) {
        body
      }      
    }    
  }

  // define the new control-flow structure here

  var i = 0
  
  loop_until (i > 9) {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  }

}
