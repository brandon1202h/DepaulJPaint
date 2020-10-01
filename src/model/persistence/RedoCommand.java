package model.persistence;

import model.interfaces.Command;

public class RedoCommand implements Command {

	@Override
	public void run() {
		CommandHistory.redo();
		
	}

}
