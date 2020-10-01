package model.persistence;

import model.interfaces.Command;

public class UndoCommand implements Command{

	@Override
	public void run() {
		CommandHistory.undo();
		
	}

}
