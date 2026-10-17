package info.gianlucacosta.graphsj

import info.gianlucacosta.eighthbridge.fx.graph.{AnyVisualGraph, VisualArc, VisualVertex}

package object sdk {
  type AnyScenario =
    Scenario[VisualVertex, VisualArc, AnyVisualGraph]
}
