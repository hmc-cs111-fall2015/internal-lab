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
  
  def repeat(body: =>Unit)(cond: =>Boolean): Unit = {
    body
    if (!cond) {
      repeat(body)(cond)
    }
  }
  
  def until(cond: =>Boolean) = cond

  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)        
}

