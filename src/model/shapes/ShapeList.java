package model.shapes;


import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import model.persistence.ShapeDrawer;


public class ShapeList{
	
	private Graphics2D graphics2d;
	private List<Shape> sList = new ArrayList<Shape>();
	private ShapeDrawer shapeDrawer = new ShapeDrawer();
	
	public ShapeList(Graphics2D graphics2d,  List<Shape> newShapes) {
		super();
		this.graphics2d = graphics2d;
		this.sList = newShapes;
	}
	
	public void add(Shape shape) {
		sList.add(shape);
		shapeDrawer.clearCanvais(graphics2d);
		shapeDrawer.drawAllShapes(graphics2d, sList);
	}
	
	public void remove() {
		sList.remove(sList.size()-1);
		shapeDrawer.clearCanvais(graphics2d);
		shapeDrawer.drawAllShapes(graphics2d, sList);
	}
	
	public void printList() {
		System.out.println(sList.toString());
	}
	
}
