// Interfaces/InterfaceDependency.kt
package game

interface Position

interface Maze {

  fun getAllElements(): Set<GameElement>

  fun getElements(
    position: Position): Set<GameElement>

  fun getPosition(
    element: GameElement): Position

  fun moveElement(
    element: GameElement,
    newPosition: Position)

  fun destroyElement(element: GameElement)
}

interface GameElement {
  fun handleTurn(
    maze: Maze,
    sameCellElements: Set<GameElement>
  )
}
