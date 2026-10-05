package info.gianlucacosta.graphsj

import info.gianlucacosta.eighthbridge.graphs.point2point.visual.{VisualGraph, VisualLink, VisualVertex}

/**
  * Factory creating a scenario
  *
  */
trait ScenarioFactory[
V <: VisualVertex,
L <: VisualLink,
G <: VisualGraph[V, L]
] {
  /**
    * The name of the scenario, as shown in the "New problem..." dialog withing GraphsJ
    *
    * @return
    */
  def scenarioName: String

  /**
    * Creates a new instance of the scenario
    *
    * @return The scenario
    */
  def createScenario: Option[Scenario[V, L, G]]


  override def toString: String =
    scenarioName
}
