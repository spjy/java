import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

public class DrawLine extends GraphicsProgram {
	private GLine line;
	
	public void init() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	}
	
	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
	}
	
	public static void main(String[] args) {
		new DrawLine().start();
	}
}
