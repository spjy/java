import java.util.Scanner;

/**
 * 
 * Cashier Applicationn
 * 
 * @author Spencer P. Young
 *
 */
public class YoungProgram05 {

	public static void main (String[] arg) {
		
		Scanner scnr = new Scanner(System.in);
		
		float moneyNeeded;
		float moneyGiven;
		float moneyDifference;
		
		int dollarChange;
		int quarterChange;
		int dimeChange;
		int nickelChange;
		int pennyChange;

		System.out.print("Enter the amount needed from the customer: ");
		
		moneyNeeded = scnr.nextFloat();
		
		System.out.print("Enter the amount recieved from the customer: ");
		
		moneyGiven = scnr.nextFloat();
		
		moneyDifference = moneyGiven - moneyNeeded;

		System.out.println(moneyDifference);
		
		// get length of it, subtract total - 3
		// divide by the coin amount, get the integer, multiply by the coin value, subtract that from original, continue!
		
		System.out.println("The customer should receive:");
//		System.out.println(dollarChange + " dollars");
//		System.out.println(quarterChange + " quarters");
//		System.out.println(dimeChange + " dimes");
//		System.out.println(nickelChange + " nickels");
//		System.out.println(pennyChange + " pennies");
		
		dollarChange = (float) f1;

	}
	
}
