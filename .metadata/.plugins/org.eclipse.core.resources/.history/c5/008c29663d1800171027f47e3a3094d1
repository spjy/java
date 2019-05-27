import acm.graphics.*;
import acm.program.*;

public class BouncingBall extends GraphicsProgram {
     private static final double BALL_RADIUS = 10.0;
     private static final int PAUSE_TIME = 20;

     private GBall ball;
     private GBall ball2;
     
     private double dx;
     private double dy;
     
     private double dx2;
     private double dy2;

     public void init() {
          ball = new GBall(BALL_RADIUS);
          ball2 = new GBall(BALL_RADIUS);
          
          add(ball, getWidth() / 2, getHeight() / 2);
          add(ball2, getWidth() / 3, getHeight() / 2);
          
          dx = 2.0;
          dy = 1.0;
          
          dx2 = 10.0;
          dy2 = 9.0;
     }

     public void run() {
          waitForClick();

          while (true) {
        	   advanceOneTimeStep();
               pause(PAUSE_TIME);
          }
     }

     public void advanceOneTimeStep() {
          double bx = ball.getX();
          double by = ball.getY();
          
          double bx2 = ball2.getX();
          double by2 = ball2.getY();

          if (bx < BALL_RADIUS || bx > getWidth() - BALL_RADIUS) {
               dx = - dx;
          }

          if (by < BALL_RADIUS || by > getHeight() - BALL_RADIUS) {
               dy = - dy;
          }
          
          ball.move(dx, dy);
          
          if (bx2 < BALL_RADIUS || bx2 > getWidth() - BALL_RADIUS) {
              dx2 = - dx2;
         }

         if (by2 < BALL_RADIUS || by2 > getHeight() - BALL_RADIUS) {
              dy2 = - dy2;
         }
          
          ball2.move(dx2, dy2);

     }

     public static void main(String[] args) {
          new BouncingBall().start();
     }
}
