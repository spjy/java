import java.awt.*;
import acm.graphics.*;

public class GBall extends GCompound {
	public GBall (double r) {
		GOval ball = new GOval(2 * r, 2 * r);
		ball.setFilled(true);
		add(ball, -r, -r);
		markAsComplete();
	}
	
	public void GBall (double r) {
		GOval ball2 = new GOval(2 * r, 2 * r);
		ball2.setFilled(true);
		add(ball2, -r, -r);
		markAsComplete();
	}
}