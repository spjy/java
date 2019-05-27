import java.util.Scanner;

public class YoungProgram08 {
     /**
     *
     * @author Spencer Young
     *
     */


	public static void sortArrayAscending(int[] list) {
	     int n = list.length;
	     int temp = 0;
	     for (int i = n - 2; i >= 0; i--) {
	          for (int j = 0; j <= i; j++) {
	               if (list[j] > list[j + 1]) {
	                    temp = list[j + 1];
	                    list[j + 1] = list[j];
	                    list[j] = temp;
	               }
	          }
	     }
	     return;
	}
	
	public static void sortArrayDescending(int[] list) {
	     int n = list.length;
	     int temp = 0;
	     for (int i = n - 2; i >= 0; i--) {
	          for (int j = 0; j <= i; j++) {
	               if (list[j] < list[j + 1]) {
	                    temp = list[j + 1];
	                    list[j + 1] = list[j];
	                    list[j] = temp;
	               }
	          }
	     }
	     return;
	}
	
 	public static double median (int[] list) {
 		
		int n = list.length;
		int checkEvenness;
		double med = 0.0;
		double temp; // value for the half list
		
		
		sortArrayAscending(list);
		
		checkEvenness = n % 2;
		temp = n / 2;
		
		if (checkEvenness == 0) {

			med = (double) (list[(int) ((temp) - 1)] + list[(int) temp]) / 2; 
			
		} else if (checkEvenness == 1) {
			med = list[(int) temp];
		}
		
		return med;
		
	}
	
	public static void main(String[] args) {
	     Scanner scnr = new Scanner(System.in);
	     System.out.print("Enter number of elements: ");
	     int numVals = scnr.nextInt();
	     int[] values = new int[numVals];
	     System.out.print("Enter each value separated by a space: ");
	
	     for (int i = 0; i < numVals; i++) {
	          values[i] = scnr.nextInt();
	     }
	     System.out.print("Original: ");
	     for (int i = 0; i < numVals; i++) {
	          System.out.print(values[i] + " ");
	     }
	
	     System.out.println("");
	
	     sortArrayAscending(values);
	
	     System.out.print("Sort (ascending): ");
	
	     for (int i = 0; i < numVals; i++) {
	          System.out.print(values[i] + " ");
	     }     
	     
	     System.out.println("");

	     sortArrayDescending(values);
	     
	     System.out.print("Sort (descending): ");
	
	     for (int i = 0; i < numVals; i++) {
	          System.out.print(values[i] + " ");
	     }
	     
	     System.out.println("");

	     System.out.print("Median: " + median(values));
	}
}
