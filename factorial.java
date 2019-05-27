package hackerEarth;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
        int factorial = 0;
        
        Scanner scnr = new Scanner(System.in);
		System.out.print("Factorial: ");
        int N = scnr.nextInt();
        
        if (N > 1) {
            for (int i = 1; i <= N; i += 2) {
                factorial = factorial + (i * (i+1));
            }
        }
        
        System.out.println(factorial);
	}
}
