package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */
object LoopUntil extends App {

  def loop_until(cond: =>Boolean)(code: =>Unit) = {
    while (!cond) {
      code
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
