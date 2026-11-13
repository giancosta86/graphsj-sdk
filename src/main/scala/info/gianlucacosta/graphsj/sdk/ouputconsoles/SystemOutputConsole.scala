package info.gianlucacosta.graphsj.sdk.ouputconsoles

import info.gianlucacosta.graphsj.sdk.OutputConsole

/**
 * OutputConsole implementation writing to the standard output
 */
object SystemOutputConsole extends OutputConsole {
  override def write(value: Any): Unit =
    print(value)


  override def writeln(value: Any): Unit =
    println(value)


  override def writeln(): Unit =
    println()
}
