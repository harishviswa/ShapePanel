//Harish Viswa
import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape {
	//local field
	private int radius;
	//Triangle Constructor
	public Triangle(int x, int y, int radius, Color color) {
		//calling on the super constructor
		super(x,y,color);
		this.radius = radius;
	}
	//Triangle constructor
	public Triangle(int x, int y, int radius, int deltaX, int deltaY, Color c) {
		//calling on the super constructor
		super(x,y,deltaX, deltaY, c);
		setRadius(radius);
	}
	
	//Getter and Setter methods
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//draw method
	public void draw(Graphics g) {
		g.setColor(getColor());
		double z = (getRadius()* Math.sqrt(3));
		int X[] = {(int) (getX()-z/2),getX(),(int)(getX() + z/2)};
		int Y[] = {(int) (getY()+((Math.sqrt(3)/4)*z)),(int)(getY()-((Math.sqrt(3)/4)*z)),(int)(getY()+((Math.sqrt(3)/4)*z))};	
		g.fillPolygon(X, Y, 3);
	}
	//move method
	public void move(int panelWidth, int panelHeight) {
		if(getY() + getRadius()/2 >= panelHeight) {
			setDeltaY(getDeltaY() * -1);
			setY(panelHeight - getRadius()/2);
		}
		if(getY() + getRadius()/2 <= panelHeight) {
			setY(getY() + getDeltaY());
		}
		if(getX() + getRadius()/2 <= panelWidth) {	
			setX(getX() + getDeltaX());
		}
		if(getX() - getRadius()/2 <= 0) {
			setDeltaX(getDeltaX() * -1);
			setX(getRadius()/2);
		}
		if(getX() + getRadius()/2 >= panelWidth) {
			setDeltaX(getDeltaX() * -1);
			setX(panelWidth - getRadius()/2);
		}
		if(getY() - getRadius()/2 <= 0 ) {
			setDeltaY(getDeltaY() * -1);
			setY(getRadius()/2);
		}
	}
}

	

