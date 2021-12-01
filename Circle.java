//Harish Viswa
import java.awt.Color;
import java.awt.Graphics;


public class Circle extends Shape{
	//local fields
	private int diameter;
	private int radius = diameter/2;
	//Circle constructor
	public Circle(int x, int y, int diameter, Color color) {
		//super constructor of shape
		super(x,y,color);
		this.diameter = diameter;
		radius = diameter/2;
	}
	//Circle constructor
	public Circle(int x, int y, int deltaX, int deltaY, int diameter, Color color) {
		super(x,y,deltaX, deltaY, color);
		this.diameter= diameter;
		radius = diameter/2;
	}
	
	//Getter and Setter methods
	public int getDiameter() {
		return diameter;
	}
	public int getRadius() {
		return radius;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public void setRadius(int radius) {
		this.radius = getDiameter()/2;
	}
	//draw method
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillOval(getX() - getRadius(), getY() - getRadius(), getDiameter(), getDiameter());
	}
	//move method
	public void move(int panelWidth, int panelHeight) {
		if(getX() + radius >= panelWidth) {
			setDeltaX(getDeltaX() * -1);
			setX(panelWidth - radius);
		}
		if(getX() + radius <= panelWidth) {
			setX(getX() + getDeltaX());
		}
		if(getY() + radius <= panelHeight) {
			setY(getY() + getDeltaY());
		}
		if(getY() + radius >= panelHeight) {
			setDeltaY(getDeltaY() * -1);
			setY(panelHeight - radius);
		}
		if(getY() - radius <= 0 ) {
			setDeltaY(getDeltaY() * -1);
			setY(radius);
		}
		if(getX() - radius <= 0) {
			setDeltaX(getDeltaX() * -1);
			setX(radius);
		}
	}

}