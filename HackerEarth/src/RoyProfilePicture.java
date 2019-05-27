import java.util.Scanner;

public class RoyProfilePicture {
    public static void main(String args[] ) throws Exception {

	    Scanner scnr = new Scanner(System.in);
	    System.out.print("Enter number of elements: ");
	    int numVals = scnr.nextInt();
	    int[] values = new int[numVals];
	    System.out.print("Enter each value separated by a space: ");
	
	    for (int i = 0; i < numVals; i++) {
	         values[i] = scnr.nextInt();
	    }
	    
    }
}
