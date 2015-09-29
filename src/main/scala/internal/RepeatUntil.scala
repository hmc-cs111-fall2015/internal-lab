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
  
  class Repeat(body: () => Unit) {
    def until(cond: =>Boolean): Unit = {
      var first = true
      while (first || !cond) {
        first = false
        body()
      }
    }
  }

  def repeat(body: =>Unit): Repeat = {
    new Repeat( () => body )
  }

//  def repeat(body: =>Unit)(cond: () => Boolean) = {
//    var first = true
//    while (first || cond()) {
//      first = false
//      body
//    }
//  }

//  def until(cond: =>Boolean) = () => cond


  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)
}

