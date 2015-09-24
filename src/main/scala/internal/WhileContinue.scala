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

  class WhileContinueException extends Throwable {}

  def continue = {throw new WhileContinueException()}

  def while_c(cond: =>Boolean)(body: =>Unit) = {
    while (cond) {
      try {
        body
      } catch {
        case continue_plz: WhileContinueException => {}
        case e: Throwable => {throw e}
      }
    }
  }

  var i = -1

  while_c (i < 9) {
      i += 1
      if ( (i % 2) != 0 )
          continue
      println(i)
  }

}
