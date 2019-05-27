import java.util.Scanner;

/**
 * 
 * @author Spencer
 *
 */

public class YoungProgram09 {
	
	public static void sortArrayAscending(int[] list) {
	     int n = list.length;
	     int temp = 0;
	     for (int i = n - 2; i >= 0; i--) {

	     }
	     return;
	}
	
	public static void sortNamesAscending(String[] names) {
		int n = names.length;
		int alphaComparison;
		String temp;
		

		for (int i = n - 2; i >= 0; i--) {
	          for (int j = 0; j <= i; j++) {
	               if (names[n].compareTo(names[n+1]) > 1) {
	                    temp = names[j + 1];
	                    names[j + 1] = names[j];
	                    names[j] = temp;
	               }
	          }		
		}	
		return;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("How many names? ");
		int numNames = scnr.nextInt();
		
		scnr.nextLine();
		String[] names = new String[numNames];
		System.out.println("Enter each name on a separate line.");
		System.out.println("Last name, First Name");
		
		for (int i = 0; i < numNames; i++) {
			names[i] = scnr.nextLine();
		}
		
		System.out.println("");
		System.out.println("Original list:");
		
		for (int i = 0; i < numNames; i++) {
			System.out.println(names[i]);
		}
		
		sortNamesAscending(names);
		
		System.out.println("");
		System.out.println("Alphabetized list:");
		
		for (int i = 0; i < numNames; i++) {
			System.out.println(names[i]);
		}
		
	}
}
