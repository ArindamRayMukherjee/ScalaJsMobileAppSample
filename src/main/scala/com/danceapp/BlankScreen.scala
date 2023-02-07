package com.danceapp

import slinky.core.FunctionalComponent
import slinky.core.annotations.react
import slinky.native._

import scala.scalajs.js.Dynamic.literal

@react object BlankScreen {
  case class Props(text: String)
  val component = FunctionalComponent[Props] { props =>
      View(style = literal(flex = 1, justifyContent = "center", alignItems = "center"))(
        Text(style = literal(
          fontWeight = "bold",
          fontSize = 25,
          color = "grey"
        ))(props.text),
      )
  }
}
