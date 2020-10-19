package hello

import org.scalajs.dom
import dom.document

object Hello1 {

  def main(args: Array[String]): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode("Hello, world")

    println("foo")
    System.err.println("bar")

    parNode.appendChild(textNode)
    document.body.appendChild(parNode)
  }

}