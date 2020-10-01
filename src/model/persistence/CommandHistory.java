package model.persistence;

import java.util.Stack;

import model.interfaces.IUndo;

class CommandHistory {
	private static final Stack<IUndo> undoStack = new Stack<IUndo>();
	private static final Stack<IUndo> redoStack = new Stack<IUndo>();

	public static void add(IUndo cmd) {
		undoStack.push(cmd);
		redoStack.clear();
	}
	
	public static boolean undo() {
		boolean result = !undoStack.empty();
		System.out.println("We are in undo");
		if (result) {
			IUndo c = undoStack.pop();
			redoStack.push(c);
			c.undo();
		}
		return result;
	}

	public static boolean redo() {
		boolean result = !redoStack.empty();
		System.out.println("we are in redo");
		if (result) {
			IUndo c = redoStack.pop();
			undoStack.push(c);
			c.redo();
		}
		return result;
	}
}
