import java.util.Random;

public class Cowow
{
	public EZImage cow;
	double posX, posY;
	public int speed;
	
	Cowow(String fname, int x, int y, int s)
	{
		posX = x;
		posY = y;
		cow = EZ.addImage(fname,  x, y);
		speed = s;
	}
	
	private double getposX()
	{
		return posX;
	}
	
	private double getposY()
	{
		return posY;
	}
	
	public void controlCow(double direction, double speed)
	{

		if(direction %2 == 0)
		{
			if (posX > 0  ) {
				cow.translateTo(posX-speed, posY); // Set the position of the probe.
				posX-=speed;

			}
			else if (posX <= 0 ) {
				cow.translateTo(800, posY); // Set the position of the probe.
				posX = 800;
				

			}
		}
		else
		{

			if (posX <800  ) {
				cow.translateTo(posX+speed, posY); // Set the position of the probe.
				posX+=speed;

			}
			else if (posX >= 800 ) {
				cow.translateTo(0, posY); // Set the position of the probe.
				posX = 0;

			}
		}
	}
}

