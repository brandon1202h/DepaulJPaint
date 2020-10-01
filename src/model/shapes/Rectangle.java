package model.shapes;



public class Rectangle extends Shape{
	private String name;
	
	
	public Rectangle(int pointX, int pointY, int width, int height) {
		super(pointX, pointY, width, height);
		name = "Rectangle";
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Rectangle [name=" + name + ", pointX()=" + getPointX() + ", pointY()=" + getPointY()
				+ ", width()=" + getWidth() + ", height()=" + getHeight() + "]";
	}

	

	
	

}
