//Harish Viswa
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape	{
//local fields
	private int height; 
	private int width;
//Rectangle constructor
	public Rectangle(int x, int y, int height, int width, Color color) {
		//calling on super constructor	
		super(x,y, color);
		this.height = height;
		this.width = width;	
	}
//Rectangle constructor
	public Rectangle(int x, int y, int deltaX, int deltaY, int height, int width, Color color) {
		//calling on super constructor
		super(x,y,deltaX, deltaY, color);
		this.height = height;
		this.width = width;
	}
	//Getter and Setter methods 
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	//draw method
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillRect(getX() - getWidth()/2, getY() - getHeight()/2, getWidth(), getHeight());
	}
	//move method
	public void move(int panelWidth, int panelHeight) {
		if(getY() + getHeight()/2 >= panelHeight) {
			setDeltaY(getDeltaY() * -1);
			setY(panelHeight - getHeight()/2);
		}
		if(getY() + getHeight()/2 <= panelHeight) {
			setY(getY() + getDeltaY());	
		}
		if(getX() + getWidth()/2 <= panelWidth) {
			setX(getX() + getDeltaX());
		}
		if(getX() - getWidth()/2 <= 0) {
			setDeltaX(getDeltaX() * -1);
			setX(getWidth()/2);
		}
		if(getY() - getHeight()/2 <= 0 ) {
			setDeltaY(getDeltaY() * -1);
			setY(getHeight()/2);
		}
		if(getX() + getWidth()/2 >= panelWidth) {	
			setDeltaX(getDeltaX() * -1);
			setX(panelWidth - getWidth()/2);
		}
	}
}