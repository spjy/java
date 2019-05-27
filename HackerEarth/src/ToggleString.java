import java.util.Scanner;

public class ToggleString {
	public static void main(String[] args) {

	    Scanner scnr = new Scanner(System.in);
	    String S = scnr.next();
	    
	    if (S.length() >= 1 || S.length() <= 100) {
		    char[] StringInput = new char[S.length()];
		    
		    for (int i = 0; i < S.length(); i++) {
		    	StringInput[i] = S.charAt(i);
		    }
		    
	    	for (int i = 0; i < S.length(); i++) {
	    		if (Character.isUpperCase(StringInput[i])) {
	    			StringInput[i] = Character.toLowerCase(StringInput[i]);
	    		} else if (Character.isLowerCase(StringInput[i])) {
	    			StringInput[i] = Character.toUpperCase(StringInput[i]);
	    		}
	    	}
	    	
		    for (int i = 0; i < S.length(); i++) {
		    	System.out.print(StringInput[i]);
		    }
	    	
	    }
	    
	}
    
}
