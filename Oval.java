//Harish Viswa
import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape{
	//local fields
	private int diameter1;
	private int diameter2;
	private int radius1 = diameter1/2;
	private int radius2 = diameter2/2;
	//Oval constructor
	public Oval(int x, int y, int diameter1, int diameter2, Color color) {
		//calling on super constructor
		super(x,y,color);
		this.diameter1 = diameter1;
		this.diameter2 = diameter1*2;		
		radius1 = diameter1/2;
		radius2 = diameter2/2;	
	}
	//Oval constructor
	public Oval(int x, int y, int deltaX, int deltaY, int diameter1, int diameter2, Color color) {
		//calling on super constructor
		super(x,y,deltaX, deltaY, color);
		this.diameter1 = diameter1;
		this.diameter2 = diameter1*2;
		radius1 = diameter1/2;
		radius2 = diameter2/2;
	}
	
	//Getter and Setter methods
	public int getDiameter2() {
		return diameter2;
	}
	public int getDiameter1() {
		return diameter1;
	}
	public int getRadius1() {
		return radius1;
	}
	public int getRadius2() {
		return radius2;
	}
	public void setDiameter1(int diameter1) {
		this.diameter1 = diameter1;
	}
	public void setDiameter2(int diameter2) {	
			this.diameter2 = diameter1*2;	
	}
	public void setRadius1(int radius1) {
		this.radius1 = getDiameter1()/2;
	}
	public void setRadius2(int radius2) {	
			this.radius2 = getDiameter2()/2;
	}
	//draw method
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillOval(getX() - getRadius1(), getY() - getRadius2(), getDiameter1(), getDiameter2());
	}
	//move method
	public void move(int panelWidth, int panelHeight) {
		if(getY() - radius2 <= 0 ) {
			setDeltaY(getDeltaY() * -1);
			setY(radius2);
		}
		if(getY() + radius2 <= panelHeight) {
			setY(getY() + getDeltaY());
		}
		if(getX() + radius1 <= panelWidth) {
			setX(getX() + getDeltaX());
		}
		if(getX() + radius1 >= panelWidth) {
			setDeltaX(getDeltaX() * -1);
			setX(panelWidth - radius1);
		}
		if(getY() + radius2 >= panelHeight) {
			setDeltaY(getDeltaY() * -1);
			setY(panelHeight - radius2);
		}
		if(getX() - radius1 <= 0) {	
			setDeltaX(getDeltaX() * -1);
			setX(radius2);	
		}
	}
}

