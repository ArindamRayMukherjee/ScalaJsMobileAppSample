package com.danceapp

import com.danceapp.ReactNavigationFacadeJSImports.{NavigationContainer, TabNavigator, TabScreen}
import slinky.core._
import slinky.core.annotations.react
import slinky.native._

import scala.scalajs.js.Dynamic.literal
import slinky.core.facade.ReactElement

@react class App extends Component {
  type Props = Unit
  type State = Unit

  def initialState: State = ()

  val baseStyle = literal(
    backgroundColor = "white",
    padding = 50,
    flex = 1,
    flexDirection = "column",
    justifyContent = "center",
    alignItems = "center"
  )

  @react object Wrapper1 {
    val component = FunctionalComponent[Unit] { _ =>
      BlankScreen("AAA")
    }
  }
  @react object Wrapper2 {
    val component = FunctionalComponent[Unit] { _ =>
      BlankScreen("BBB")
    }
  }

  override def render(): ReactElement = {
    NavigationContainer(
      TabNavigator(
        TabScreen(name = "AAA", component = Wrapper1.component),
        TabScreen(name = "BBB", component = Wrapper2.component)
      )
    )
  }

}
