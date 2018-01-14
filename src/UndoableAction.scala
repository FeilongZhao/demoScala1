abstract class UndoableAction(var decription :String){

  def undo(): Unit
  def redo(): Unit
}
