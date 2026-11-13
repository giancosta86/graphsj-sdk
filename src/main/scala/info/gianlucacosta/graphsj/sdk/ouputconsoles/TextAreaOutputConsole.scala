package info.gianlucacosta.graphsj.sdk.ouputconsoles

import info.gianlucacosta.graphsj.sdk.OutputConsole
import scalafx.scene.control.TextArea

class TextAreaOutputConsole(textArea: TextArea)
  extends OutputConsole {
  override def write(value: Any): Unit = {
    textArea.appendText(value.toString)
  }

  override def writeln(value: Any): Unit = {
    textArea.appendText(value.toString)
    textArea.appendText("\n")
  }

  override def writeln(): Unit = {
    textArea.appendText("\n")
  }
}
