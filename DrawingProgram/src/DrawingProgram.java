import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
import javax.swing.*;

/**
 * 
 * Drawing Program
 * 
 * @author Spencer
 *
 */

public class DrawingProgram extends GraphicsProgram {
	private GObject selectedObj;
	private GPoint lastPoint;
	private GLine line;
	private GRect rectDraw;
	private GOval ovalDraw;
	private GRoundRect roundRectDraw;
	private boolean drawLine = false;
	private boolean drawRect = false;
	private boolean drawOval = false;
	private boolean drawRoundRect = false;
	private boolean fillObj = false;
	private boolean colorObj = false;
	private boolean delObj = false;
	private boolean moveMode = true;
	private int initialX;
	private int initialY;
	
	public void init() {
		GRect rect = new GRect(100, 100, 150, 100);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
		
		GOval oval = new GOval(300, 115, 100, 70);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add(oval);
		
		add(new JButton("Draw Line"), NORTH);
		add(new JButton("Draw Rectangle"), NORTH);
		add(new JButton("Draw Oval"), NORTH);
		add(new JButton("Draw Rounded Rectangle"), NORTH);
		add(new JButton("Move"), SOUTH);
		add(new JButton("Fill Object"), SOUTH);
		add(new JButton("Color Object (Red)"), SOUTH);
		add(new JButton("Delete Object"), SOUTH);
		
		addMouseListeners();
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		drawLine = false;
		drawRect = false;
		drawOval = false;
		drawRoundRect = false;
		fillObj = false;
		colorObj = false;
		delObj = false;
		moveMode = false;
		String command = e.getActionCommand();
		if (command.equals("Draw Line")) {
			drawLine = true;
		} else if (command.equals("Draw Rectangle")) {
			drawRect = true;
		} else if (command.equals("Draw Oval")) {
			drawOval = true;
		} else if (command.equals("Draw Rounded Rectangle")) {
			drawRoundRect = true;
		} else if (command.equals("Fill Object")) {
			fillObj = true;
		} else if (command.equals("Color Object (Red)")) {
			colorObj = true;
		} else if (command.equals("Delete Object")) {
			delObj = true;
		} else if (command.equals("Move")) {
			moveMode = true;
		}
		
	}
		
	public void mousePressed(MouseEvent e) {		
		if (drawLine) {
			line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
			add(line);
		} else if (drawRect) {
			initialX = e.getX();
			initialY = e.getY();
			
			rectDraw = new GRect(initialX, initialY, 0, 0);
			add(rectDraw);	
		} else if (drawOval) {
			initialX = e.getX();
			initialY = e.getY();
			
			ovalDraw = new GOval(initialX, initialY, 0, 0);
			add(ovalDraw);
		} else if (drawRoundRect) {
			initialX = e.getX();
			initialY = e.getY();
			
			roundRectDraw = new GRoundRect(initialX, initialY, 0, 0, 0, 0);
			add(roundRectDraw);
		} else if (fillObj && selectedObj != null) {
			((GFillable) selectedObj).setFilled(true);
		} else if (colorObj && selectedObj != null) {
			selectedObj.setColor(Color.RED);
		} else if (delObj && selectedObj != null) {
			remove(selectedObj);
		} else if (moveMode) {
			lastPoint = new GPoint(e.getPoint());
			selectedObj = getElementAt(lastPoint);
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if (selectedObj != null && moveMode) {
			selectedObj.move(e.getX() - lastPoint.getX(), e.getY() - lastPoint.getY());
			
			lastPoint = new GPoint(e.getPoint());
		} else if (drawLine) {
			line.setEndPoint(e.getX(), e.getY());
		} else if (drawRect) {
			rectDraw.setSize(e.getX() - initialX, e.getY() - initialY);
		} else if (drawOval) {
			ovalDraw.setSize(e.getX() - initialX, e.getY() - initialY);
		} else if (drawRoundRect) {
			roundRectDraw.setSize(e.getX() - initialX, e.getY() - initialY);
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if (selectedObj != null && moveMode) {
			selectedObj.sendToFront();
		}
	}
	
	public static void main(String[] args) {
		new DrawingProgram().start();
	}
}