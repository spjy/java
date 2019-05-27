import java.awt.*;
import acm.graphics.*;

public class GBall extends GCompound {
	public GBall(double r) {
		GOval ball = new GOval(2 * r, 2 * r);
		ball.setFilled(true);
		add(ball, -r, -r);
		markAsComplete();
	}
}
