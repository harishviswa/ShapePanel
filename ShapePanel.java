//Harish Viswa
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class ShapePanel extends JPanel {
	private static final Color BACKGROUND = new Color(120, 120, 120);

	// TODO: Create two fields
	// One for the Shapes Array (just declared, not initialized)
	// One integer for the size of the array (10 is a good default)
	private Shape[] shapes;
	private int numShapes = 10;
	private Color myColor;
	private Timer t;
	private Shape circle;

	public ShapePanel() {
		myColor = BACKGROUND;
		initShapes();
		t = new Timer(20, new Listener());
		t.start();
	}

	// TODO: Complete the method
	public void initShapes() {
		shapes = new Shape[numShapes];
		int type;
		Color[] colors = {Color.red, Color.blue, Color.yellow, Color.green, Color.orange, Color.black, Color.cyan};
		for(int i = 0; i < 10; i++) {
			type = (int)(Math.random() * 5);
			int X = (int)(Math.random() * 700);
			int Y = (int)(Math.random() * 400);
			int Width = (int)(Math.random() * 51 + 50);
			int Height = (int)(Math.random() * 51 + 50);
			int Radius = (int)(Math.random() * 51 + 50);
			int Color = (int)(Math.random() * 6);
			if(type == 0) {
				shapes[i] = new Circle(X,Y,2,1,Radius,colors[Color]);
			}
			else if(type == 1) {
				shapes[i] = new Rectangle(X,Y,1,2,Height,Width,colors[Color]);
			}else if(type == 2) {
				shapes[i] = new Square(X,Y,1,2,Width,colors[Color]);
			}else if(type == 3) {
				shapes[i] = new Triangle(X,Y,Radius,1,2,colors[Color]);
			}else if(type == 4) {
				shapes[i] = new Oval(X,Y,2,1,Radius,Radius,colors[Color]);
			}
			
	}
	}

	public void paintComponent(Graphics g) {
		// clear background
		g.setColor(myColor);
		g.fillRect(0, 0, getWidth(), getHeight());
		//move
		for(int i = 0; i < numShapes; i++) {
			shapes[i].move(getWidth(), getHeight());
		}
		//draw
		for(int i = 0; i < numShapes; i++) {
			shapes[i].draw(g);
	}
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Shapes");
		frame.setSize(1000, 700);
		frame.setLocation(300, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new ShapePanel());
		frame.setVisible(true);
	}
}