package info.gianlucacosta.graphsj

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
