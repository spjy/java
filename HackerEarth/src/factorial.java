import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
        int factorial = 1;
        
        Scanner scnr = new Scanner(System.in);
        int N = scnr.nextInt();
        
        if (N > 1 && N <= 10) {
            for (int i = 1; i <= N; i++) {
                factorial = factorial * (i);
            }
        }
        
        System.out.println(factorial);
	}
}