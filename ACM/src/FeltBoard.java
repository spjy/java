import acm.program.*;
import acm.graphics.*;
import java.awt.*;
/**
 * 
 * Picture of a camera using the ACM library.
 * 
 * @author Spencer
 *
 */
public class FeltBoard extends GraphicsProgram {
	public static final double PHI = 1.618;
	
	public void run() {
		GRect cameraBody = new GRect(100, 50, 200, 200 / PHI);
		add(cameraBody);
		
		GOval lens = new GOval(200, 90, 50, 50);
		lens.setFilled(true);
		lens.setFillColor(Color.GREEN);
		add(lens);
		
		GRect flash = new GRect(215, 30, 25, 10);
		add(flash);
		
		GPolygon flashOutline = new GPolygon(180, 40);
		flashOutline.addVertex(20, 10);
		flashOutline.addVertex(30, -20);
		flashOutline.addVertex(69, -20);
		flashOutline.addVertex(75, 10);
		add(flashOutline);
		
		GPolygon cameraAccentOne = new GPolygon(20, 90);
		cameraAccentOne.addVertex(80, 10);
		cameraAccentOne.addVertex(184, 10);
		add(cameraAccentOne);
		
		GPolygon cameraAccentTwo = new GPolygon(20, 90);
		cameraAccentTwo.addVertex(225, 10);
		cameraAccentTwo.addVertex(280, 10);
		add(cameraAccentTwo);
		
		GPolygon cameraAccentThree = new GPolygon(20, 90);
		cameraAccentThree.addVertex(117, -40);
		cameraAccentThree.addVertex(117, 85);
		add(cameraAccentThree);
		
		GRect apertureDial = new GRect(125, 40, 25, 10);
		add(apertureDial);

	}
	
	public static void main(String[] args) {
		new FeltBoard().start();
	}
}
