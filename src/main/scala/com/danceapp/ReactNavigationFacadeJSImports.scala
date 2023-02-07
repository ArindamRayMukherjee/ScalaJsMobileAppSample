package com.danceapp

import slinky.core.annotations.react
import slinky.core.{ExternalComponent, ExternalComponentNoProps, ReactComponentClass}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object ReactNavigationFacadeJSImports {
  object NavigationContainer extends ExternalComponentNoProps {
    @js.native
    @JSImport("@react-navigation/native", "NavigationContainer")
    object NavigationContainerImport extends js.Object
    override val component = NavigationContainerImport
  }

  object TabNavigator extends ExternalComponentNoProps {
    @js.native
    @JSImport("../../../js/react-navigation/Navigator", "TabNavigator")
    object TabNavigatorImport extends js.Object
    override val component = TabNavigatorImport
  }

  @react object TabScreen extends ExternalComponent {
    case class Props(name: String, component: ReactComponentClass[_])
    @js.native
    @JSImport("../../../js/react-navigation/Navigator", "TabScreen")
    object TabScreenImport extends js.Object

    override val component = TabScreenImport
  }

}

