package model.persistence;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

import model.interfaces.IShapeDraw;
import model.shapes.Shape;

public class ShapeDrawer implements IShapeDraw{
	

	@Override
	public void drawAllShapes(Graphics2D graphics2d, List<Shape> shapeList) {
		for (Shape shape : shapeList) {
			if(shape.getName().equals("Rectangle")) {
				graphics2d.fillRect(shape.getPointX(), shape.getPointY(), shape.getWidth(), shape.getHeight());
			}else if(shape.getName().equals("Triangle")){
				
			}else {
				
			}
		}
		
	}

	@Override
	public void clearCanvais(Graphics2D graphics2d) {
		graphics2d.setColor(Color.white);
		graphics2d.fillRect(0, 0, 100000, 100000);
		graphics2d.setColor(Color.black);
		
	}

}
