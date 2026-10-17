package info.gianlucacosta.graphsj.sdk

/**
 * OutputConsole implementation writing to the standard output
 */
object SystemOutConsole extends OutputConsole {
  override def write(value: Any): Unit =
    print(value)


  override def writeln(value: Any): Unit =
    println(value)


  override def writeln(): Unit =
    println()
}
