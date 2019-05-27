import java.util.Scanner;
/**
 * 
 * @author Spencer
 *
 */
public class YoungProgram07 {
	
	public static int maxVal(int[] list) {
		int max;
		max = list[0];
			for (int j = 1; j < list.length; j++) {
				if (list[j] > max) {
					max = list[j];
				}
			}
		return max;
	}	
	
	public static int minVal(int[] list) {
		int min;
		min = list[0];
			for (int j = 1; j < list.length; j++) {
				if (list[j] < min) {
					min = list[j];
				}
			}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Number of entries: ");
		int n;
		n = scnr.nextInt();
		
		int[] numbers = new int[n];
		System.out.print("Enter the values separated by spaces: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = scnr.nextInt();
		}
		
		System.out.print("\n");

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == minVal(numbers)) {
				System.out.println(numbers[i] + " <== minimum");
			} else if (numbers[i] == maxVal(numbers)) {
				System.out.println(numbers[i] + " <== MAXIMUM");
			} else {
				System.out.println(numbers[i] + "");
			}
		}
	}
}
