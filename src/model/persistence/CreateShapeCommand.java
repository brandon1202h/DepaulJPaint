package model.persistence;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import model.interfaces.Command;
import model.interfaces.IUndo;
import model.shapes.Rectangle;
import model.shapes.Shape;
import model.shapes.ShapeList;

public class CreateShapeCommand implements Command, IUndo{
	
	private Graphics2D graphics2d;
	private int x;
	private int y;
	private int width; 
	private int height;
	private List<Shape> sList = new ArrayList<Shape>();
	private Shape shape;
	private ShapeList shapeList;
	
	
	public CreateShapeCommand(Graphics2D graphics2d, int x, int y, int width, int height, List<Shape> sList) {
		super();
		this.graphics2d = graphics2d;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sList = sList;
	}

	@Override
	public void run() {
		shapeList= new ShapeList(graphics2d, sList);
		System.out.println("Creating shape");
		shape = new Rectangle(x, y, width, height);
		shapeList.add(shape);
		CommandHistory.add(this);
	}

	@Override
	public void undo() {
		shapeList.remove();
		
	}

	@Override
	public void redo() {
		shapeList.add(shape);
	}





	

}
