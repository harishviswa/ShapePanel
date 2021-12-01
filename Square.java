//Harish Viswa
import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {
	//local fields
	 private int x;  
	 private int y;  
	 private int width;
	 private Color color;
	 //Square constructor
	public Square(int x, int y, int width, Color color) {	
			//calling on the super constructor
			super(x,y,color);			
			this.width = width;	
		}
	//Square constructor
	public Square(int x, int y, int deltaX, int deltaY, int width, Color color) {
			//calling on the super constructor
			super(x,y,deltaX, deltaY, color);
			this.width= width;
		}
	
	//Getter and Setter methods
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {	
		this.width = width;	
	}
	 
	//draw method
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillRect(getX() - getWidth()/2, getY() - getWidth()/2, getWidth(), getWidth());
	}
	//move method
	public void move(int panelWidth, int panelHeight) {
		if(getY() + getWidth()/2 >= panelHeight) {
			setDeltaY(getDeltaY() * -1);
			setY(panelHeight - getWidth()/2);
		}
		if(getY() + getWidth()/2 <= panelHeight) {
			setY(getY() + getDeltaY());
		}
		if(getX() + getWidth()/2 <= panelWidth) {		
			setX(getX() + getDeltaX());	
		}
		if(getY() - getWidth()/2 <= 0 ) {
			setDeltaY(getDeltaY() * -1);
			setY(getWidth()/2);
		}
		if(getX() + getWidth()/2 >= panelWidth) {
			setDeltaX(getDeltaX() * -1);
			setX(panelWidth - getWidth()/2);
		}
		if(getX() - getWidth()/2 <= 0) {
			setDeltaX(getDeltaX() * -1);
			setX(getWidth()/2);
		}
	}
}
	



