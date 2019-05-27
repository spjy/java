import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Cashier Application
 * 
 * @author Spencer P. Young
 */
public class YoungProgram05 {

	public static void main (String[] args) {
		
		// Creates scanner
		Scanner scnr = new Scanner(System.in);
		
		// Define input values and calculation variables
		float moneyNeeded;
		float moneyReceived;
		float moneyDifference;
		int moneyDifferenceCents;
		
		int dollarChange;
		int quarterChange;
		int dimeChange;
		int nickelChange;
		int pennyChange;	

		// Try and catch to see if number input is a float
		try {
			// Get value inputs from scanner; if input is a float, continue with program
			System.out.print("Enter the amount needed from the customer: ");
			moneyNeeded = scnr.nextFloat();

			System.out.print("Enter the amount recieved from the customer: ");
			moneyReceived = scnr.nextFloat();
			
			// Check if money received is less than money needed
			if (moneyReceived < moneyNeeded) {
				// If less than, throw error
				System.out.println("------------");
				System.out.println("The customer is trying to cheat you of money! Call 911, he's a robber!");
			} else if (moneyReceived >= moneyNeeded) {
				// If greater than, calculate correct dollar and coin change needed
				moneyDifference = moneyReceived - moneyNeeded;
				moneyDifferenceCents = Math.round(moneyDifference * 100);
						
				dollarChange = (moneyDifferenceCents / 100);
				moneyDifferenceCents = moneyDifferenceCents - (dollarChange * 100);
				
				quarterChange = (moneyDifferenceCents / 25);
				moneyDifferenceCents = moneyDifferenceCents - (quarterChange * 25);
				
				dimeChange = (moneyDifferenceCents / 10);
				moneyDifferenceCents = moneyDifferenceCents - (dimeChange * 10);
				
				nickelChange = (moneyDifferenceCents / 5);
				moneyDifferenceCents = moneyDifferenceCents - (nickelChange * 5);
				
				pennyChange = (moneyDifferenceCents);
				moneyDifferenceCents = moneyDifferenceCents - (pennyChange);
				
				// Define pluralized and non-pluralized currency name arrays
				String[] pluralizedCurrency = { "dollars", "quarters", "dimes", "nickels", "pennies" };
				String[] notPluralizedCurrency = { "dollar", "quarter", "dime", "nickel", "penny "};	
				
				// Convert change integers into an array
				int[] changeValues = { dollarChange, quarterChange, dimeChange, nickelChange, pennyChange };
				
				System.out.println("------------");
				System.out.println("The customer should receive:");
				
				// Check if the value is 1
				for (int i = 0; i <= 4; i++) {
					if (changeValues[i] == 1) {
						// If it is equal to 1, don't pluralize
						System.out.println(changeValues[i] + " " + notPluralizedCurrency[i]);
					} else if (changeValues[i] > 1 || changeValues[i] == 0) {
						// If it equal to 0 or greater than 1, pluralize
						System.out.println(changeValues[i] + " " + pluralizedCurrency[i]);
					}
				}	
			}
		} catch (InputMismatchException e) {
			// If value entered is not a float, throw error
			System.out.println("Enter a valid float.");
		}		
	}
}