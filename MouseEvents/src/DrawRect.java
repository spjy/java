import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

public class DrawRect extends GraphicsProgram {
	private GRect rect;
	private int initialX;
	private int initialY;
	
	
	public void init() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		initialX = e.getX();
		initialY = e.getY();
		
		rect = new GRect(initialX, initialY, 0, 0);
		add(rect);
	}
	
	public void mouseDragged(MouseEvent e) {
		rect.setSize(e.getX() - initialX, e.getY() - initialY);
	}
	
	public static void main(String[] args) {
		new DrawRect().start();
	}
}
