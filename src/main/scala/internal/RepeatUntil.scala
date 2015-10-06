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

  class Loopable[T] (f: => T) {
      var current = f

      def until (cond: => Boolean): T = {
          if (!cond) {
            this.current = f
            until(cond)
	  } else this.current
      }
  }

  def repeat[T] (body: => T) = new Loopable(body)
  
  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)        
}

