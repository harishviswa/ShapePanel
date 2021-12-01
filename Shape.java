//Harish Viswa
import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	//local fields
	private int x;
	private int y;
	private Color color;
	private int deltaX;
	private int deltaY;
	
	//primary Shape constructor
	public Shape(int x, int y, Color color) {	
		this.x = x;
		this.y = y;
		this.color = color;
	}
	//constructor to specific deltaX and Y
	public Shape(int x, int y, int dx, int dy, Color color) {		
		this(x,y,color);
		this.deltaX = dx;
		this.deltaY = dy;	
	}

	//Getter and Setter methods
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Color getColor() {
		return color;
	}
	public int getDeltaX() {
		return deltaX;
	}
	public int getDeltaY() {
		return deltaY;
	}
	public void setX(int x) {	
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setDeltaX(int deltaX) {
		this.deltaX = deltaX;
	}
	public void setDeltaY(int deltaY) {
		this.deltaY = deltaY;
	}
	//abstract draw method
	public abstract void draw(Graphics g);
	// abstract move method
	public abstract void move(int panelWidth, int panelHeight);


}
