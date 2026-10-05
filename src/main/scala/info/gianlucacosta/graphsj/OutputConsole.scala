package info.gianlucacosta.graphsj

/**
  * Text output console
  */
trait OutputConsole {
  /**
    * Prints the string representation of a value
    *
    * @param value
    */
  def write(value: Any)

  /**
    * Prints the string representation of a value, followed by a newline character
    *
    * @param value
    */
  def writeln(value: Any)

  /**
    * Prints a newline character
    */
  def writeln()

  /**
   * Prints out "<description> = <value>"
   */
  def writeln(description: String, value: Any): Unit = {
    writeln(s"${description} = ${value}")
  }

  /**
    * Prints a header
    *
    * @param header The header text
    */
  def writeHeader(header: String): Unit = {
    val headerLine =
      "-" * header.length

    writeln(headerLine)
    writeln(header)
    writeln(headerLine)
  }
}
