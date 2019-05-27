import java.util.Scanner;

/**
 * 
 * @author Spencer
 *
 */

public class YoungProgram06 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("How many names? ");
		int numNames = scnr.nextInt();
		
		String[] names = new String[numNames];
		int[] scores = new int[numNames];
		double avgScoresAdded = 0;
		double avgScore;
		
		for (int i = 0; i < numNames; i++) {
			System.out.print("Name and score separated by a space: ");
			names[i] = scnr.next();
			scores[i] = scnr.nextInt();
		}
		
		for (int i = 0; i < numNames; i++) {
			avgScoresAdded = avgScoresAdded + scores[i];
		}
		
		avgScore = avgScoresAdded / numNames;
		
		System.out.println("Score      Name");
		System.out.println("================");
		
		for (int i = numNames - 1; i >= 0; i--) {
			System.out.println(scores[i] + "         " + names[i]);
		}
		
		System.out.println("Average Score: " + avgScore);

	}
}
