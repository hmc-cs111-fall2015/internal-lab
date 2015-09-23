package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

object RepeatUntil extends App {
  
  class Repeater(body: =>Unit) {
    def until(pred: =>Boolean): Unit = {
      do { body } while (!pred)
    }
  }
  
  def repeat(body: =>Unit): Repeater = new Repeater(body)
  
  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)        
}

