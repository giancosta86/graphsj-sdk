package info.gianlucacosta.graphsj.sdk

/**
 * Factory creating a scenario
 *
 */
trait ScenarioFactory {
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
  def createScenario: Option[AnyScenario]


  override def toString: String =
    scenarioName
}
