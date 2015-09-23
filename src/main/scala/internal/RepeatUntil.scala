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

object RepeatUntil extends App {
  
  // define the new control-flow structure here
  
  implicit class repeat(body: =>Any) {
    def until(condition: =>Boolean):Unit = {
      while (!condition) {
        body
      }
    }
  }

  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)        
}

