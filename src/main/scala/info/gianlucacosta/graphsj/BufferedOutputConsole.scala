package info.gianlucacosta.graphsj

/**
  * OutputConsole implementation whose text can be inspected.
  *
  * Very useful for testing.
  */
class BufferedOutputConsole extends OutputConsole {
  private val stringBuilder =
    new StringBuilder


  override def write(value: Any): Unit =
    stringBuilder.append(value)


  override def writeln(value: Any): Unit =
    stringBuilder.append(s"${value}\n")


  override def writeln(): Unit =
    stringBuilder.append("\n")


  def text: String =
    stringBuilder.toString()
}
