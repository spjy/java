import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

public class DragObjects extends GraphicsProgram {
	private GObject selectedObj;
	private GPoint lastPoint;
	private GLine line;
	
	public void init() {
		GRect rect = new GRect(100, 100, 150, 100);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
		
		GOval oval = new GOval(300, 115, 100, 70);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add(oval);
		
		addMouseListeners();
	}
		
	public void mousePressed(MouseEvent e) {
		lastPoint = new GPoint(e.getPoint());
		selectedObj = getElementAt(lastPoint);
		
		if (selectedObj == null) {
			line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
			add(line);
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if (selectedObj != null) {
			selectedObj.move(e.getX() - lastPoint.getX(), e.getY() - lastPoint.getY());
			
			lastPoint = new GPoint(e.getPoint());
		} else {
			line.setEndPoint(e.getX(), e.getY());
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if (selectedObj != null) {
			selectedObj.sendToFront();
		}
	}
	
	public static void main(String[] args) {
		new DragObjects().start();
	}
}
