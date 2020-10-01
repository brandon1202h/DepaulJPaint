package model.interfaces;

import java.awt.Graphics2D;
import java.util.List;

import model.shapes.Shape;

public interface IShapeDraw {
	
	void drawAllShapes(Graphics2D g2d,List<Shape>shapeList);
	
	void clearCanvais(Graphics2D g2d);

}
