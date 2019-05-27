import java.awt.Color;
import java.awt.event.KeyEvent;


public class ufo {

	public static void main(String[] args) {

		 // Setup EZ graphics system.
		  EZ.initialize(1024,700);  // Setup ez and make a window of size 1024 by 700
		  
		// Loads the ufo picture and assigns it to the variable ufoPicture and positions it at 512x350
		  EZImage ufoPicture = EZ.addImage("Ufo mini.png", 512,350);
		  
		// LOOP 
		  while(true) {
			  
			  	// If the key I pressed is right arrow
				if (EZInteraction.isKeyDown('d')) {
					// Then make the picture turn right 5 degrees
					ufoPicture.turnRight(5);
				} else if (EZInteraction.isKeyDown('a')) {  // Checks if you pressed is left arrow
					ufoPicture.turnLeft(5);	// Turn left 5 degrees
					
				} else if (EZInteraction.isKeyDown('w')) {	// Checks if you pressed up arrow key
					ufoPicture.moveForward(10);							// Move your character forward 10 pixels
				} else if (EZInteraction.isKeyDown('s')) {
					ufoPicture.moveForward(-10); 
				}
		  }
	}
}