package model.persistence;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import model.interfaces.Command;
import model.shapes.Shape;

public class MouseHandler implements MouseListener{
	Command command;
	Graphics2D graphics2d;
	Point point = new Point();
	Point point2 = new Point();
	List<Shape> sList = new ArrayList<Shape>();
	
	

	public MouseHandler(Graphics2D graphics2d) {
		super();
		this.graphics2d = graphics2d;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		point = e.getLocationOnScreen();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		point2 = e.getLocationOnScreen();
		int width = (int) point.distance((int)point.getX(), (int)point.getY(), (int)point2.getX(), (int)point2.getY());
		int height = (int)point.getY() + (int)point2.getY();
		
		//Shape info for debug
		System.out.println("Shape information");
		System.out.println(point.getX());
		System.out.println(point.getY());
		System.out.println(width);
		System.out.println(height);
		
		command = new CreateShapeCommand(graphics2d, (int)point.getX(), (int)point.getY(), width, height, sList);
		command.run();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
