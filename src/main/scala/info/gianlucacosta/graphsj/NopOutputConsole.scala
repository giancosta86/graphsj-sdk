package info.gianlucacosta.graphsj

/**
  * OutputConsole implementation doing just nothing
  */
object NopOutputConsole extends OutputConsole {
  override def write(value: Any): Unit = {}

  override def writeln(value: Any): Unit = {}

  override def writeln(): Unit = {}

  override def writeHeader(header: String): Unit = {}
}
