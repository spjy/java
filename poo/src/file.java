import java.awt.Color;

public class mainCow {

	public static void main(String[] args) 
	{
		EZ.initialize(800,500);
		EZ.setBackgroundColor(new Color(157,163,156)); 

		Cowow [] cows = new Cowow[12];
		cows[0] = new Cowow("cow1.png", 100, 400, 1);
		cows[1] = new Cowow("cow1 2.png", 600, 400, 2);
		cows[2] = new Cowow("cow1.png", 340, 400, 3);
		cows[3] = new Cowow("cow1 2.png", 555, 400, 4);
		cows[4] = new Cowow("cow1.png", 270, 400, 2); 
		cows[5] = new Cowow("cow1 2.png", 270, 400, 1); 
		cows[6] = new Cowow("cow1.png", 270, 400, 4); 
		cows[7] = new Cowow("cow1 2.png", 270, 400, 2); 
		cows[8] = new Cowow("cow1.png", 200, 480, 1); 
		cows[9] = new Cowow("cow1 2.png", 270, 480, 3); 
		cows[10] = new Cowow("cow1.png", 100, 480, 2); 
		cows[11] = new Cowow("cow1 2.png", 600, 480, 4);
		
		while(true)
		{
			for(int i =0; i < 12; i++)
			{
				cows[i].controlCow(1+i, cows[i].speed);
			}
			EZ.refreshScreen();
		}
		
	}

}
