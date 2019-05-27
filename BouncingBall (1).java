import acm.graphics.*;
import acm.program.*;
public class BouncingBall extends GraphicsProgram {
	private static final double BALL_RADIUS = 10.0;
	private static final int PAUSE_TIME = 20;
	private static final double BALL_RADIUS1 = 30.0;
	
	private GBall ball;
	private GBall ball1;
	private double dx1;
	private double dy1;
	private double dx;
	private double dy;
	public void init() {
	ball = new GBall(BALL_RADIUS);
	add(ball, getWidth() / 2, getHeight() / 2);
	ball1 = new GBall(BALL_RADIUS1);
	add(ball1, getWidth() / 2, getHeight() / 2);
	dx = 2.0;
	dy = 1.0;
	dx1 = 5.0;
	dy1 = 5.0;
	}
	
	public void run() {
		waitForClick();
		while (true) {
			advanceOneTimeStep();
			pause(PAUSE_TIME);
		}
	}
	
	private void advanceOneTimeStep() {
		double bx = ball.getX();
		double by = ball.getY();
		if (bx < BALL_RADIUS || bx > getWidth() - BALL_RADIUS) {
			dx = - dx; 
		}
		if (by < BALL_RADIUS || by > getHeight() - BALL_RADIUS) {
			dy = - dy;
		}
		ball.move(dx, dy);
		double bx1 = ball1.getX();
		double by1 = ball1.getY();
		if (bx1 < BALL_RADIUS || bx1 > getWidth() - BALL_RADIUS) {
			dx1 = - dx1; 
		}
		if (by1 < BALL_RADIUS || by1 > getHeight() - BALL_RADIUS) {
			dy1 = - dy1;
		}
		ball1.move(dx1, dy1);
	}
	public static void main (String[] args) {
		new BouncingBall().start();
	}
}
