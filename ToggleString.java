package hackerEarth;
import java.util.Scanner;

public class ToggleString {
	public static void main(String[] args) {

	    Scanner scnr = new Scanner(System.in);
		System.out.print("String: ");
	    String S = scnr.next();
	    
	    String[] StringInput = new String[S.length()];
	    
    	System.out.print(String.valueOf(S.charAt(0)).toUpperCase());

	    
	    if (S.length() <= 1 || S.length() >= 100) {
	    	for (int i = 0; i < S.length(); i++) {
	    		if (Character.isUpperCase(S.charAt(i))) {
	    			StringInput[i] = String.valueOf(S.charAt(i)).toLowerCase();
	    		} else if (Character.isLowerCase(S.charAt(i))) {
	    			StringInput[i] = String.valueOf(S.charAt(i)).toUpperCase();
	    		}
	    	}
	    }
	    
	    for (int i = 0; i < S.length(); i++) {
	    	System.out.print(StringInput[i]);
	    }
	    
	}
    
}
