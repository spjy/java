
public class Cow 
{

	EZImage cowSheet;
	
	int x = 0;
	int y = 0;
	int cowWidth;
	int cowHeight;
	int direction = 0;
	int walkSequence = 0;
	int cycleSteps;
	int counter = 0;
	
	Cow(String imgFile, int startX, int startY, int width, int height, int steps)
	{
		x = startX;
		y = startY;
		cowWidth = width;
		cowHeight = height;
		cycleSteps = steps;
		cowSheet = EZ.addImage(imgFile, x, y);
		setImagePosition();
	}
	
	private void setImagePosition()
	{
		cowSheet.translateTo(x, y);
		cowSheet.setFocus(walkSequence*cowWidth, direction, walkSequence*cowWidth+cowWidth, direction+cowHeight);
	
		
	}
	public void moveDown(int stepSize) {
		y = y + stepSize;

		direction = 0;

		if ((counter % cycleSteps) == 0) {
			walkSequence++;
			if (walkSequence > 3)
				walkSequence = 0;
		}
		counter++;
		setImagePosition();
	}
	
	public void moveLeft(int stepSize) {
		x = x - stepSize;
		direction = cowHeight;

		if ((counter % cycleSteps) == 0) {
			walkSequence--;
			if (walkSequence < 0)
				walkSequence = 3;
		}
		counter++;
		setImagePosition();
	}

	public void moveRight(int stepSize) {
		x = x + stepSize;
		direction = cowHeight * 2;
		
		if ((counter % cycleSteps) == 0) {
			walkSequence++;
			if (walkSequence > 3)
				walkSequence = 0;
		}
		counter++;

		setImagePosition();
	}

	public void moveUp(int stepSize) {
		y = y - stepSize;
		direction = cowHeight * 3;

		if ((counter % cycleSteps) == 0) {
			walkSequence--;
			if (walkSequence < 0)
				walkSequence = 3;
		}
		setImagePosition();

		counter++;
	}
	
	public void go() {
		 if(EZInteraction.isKeyDown('a')) {
			moveLeft(2);
		 }
		else if(EZInteraction.isKeyDown('d')) {
			moveRight(2);
		}
	}
	
	
}
