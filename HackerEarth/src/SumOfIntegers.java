import java.util.Scanner;

public class SumOfIntegers
{
    public static void main(String[] args)
    {
        int limit = 0;
        int sum   = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Limit: ");
        limit = scan.nextInt();
        
        System.out.println();
        System.out.println("The sum of the even numbers between 2 and " + limit + " (inclusive) are:");
        if (limit < 2) {
            System.out.println("The input value cannot be less than 2 ");
        } else {
        	
	        for (int count = 1; count <= limit; count++) {
	            // Only add if even
	            
	            if ((count & 1)!= 1) {
	                sum += count;
	                System.out.println(count);
	            }
	        }
	                  
        }
        System.out.println("The sum is " + sum);
        
    }
}