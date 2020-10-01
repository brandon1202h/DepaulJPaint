package model.shapes;

public abstract class Shape {
	
	private int pointX;
	private int pointY;
	private int width;
	private int height;
	private String name;
	
	public Shape(int pointX, int pointY, int width, int height) {
		super();
		this.pointX = pointX;
		this.pointY = pointY;
		this.width = width;
		this.height = height;
	}

	public int getPointX() {
		return pointX;
	}

	public void setPointX(int pointX) {
		this.pointX = pointX;
	}

	public int getPointY() {
		return pointY;
	}

	public void setPointY(int pointY) {
		this.pointY = pointY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shape [pointX=" + pointX + ", pointY=" + pointY + ", width=" + width + ", height=" + height + ", name="
				+ name + "]";
	}
	

	
	

}
