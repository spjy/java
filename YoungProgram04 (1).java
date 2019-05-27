import java.util.Scanner;

public class YoungProgram04 {

	public static void main (String[] arg) {
		
		Scanner scnr = new Scanner(System.in);
		String dateString;
		System.out.print("Enter date in mm/dd/yyyy format: ");
		
		dateString = scnr.nextLine();
		String monthNumberString;
		String date;
		String yearNumberString;
		
		monthNumberString = dateString.substring(0, 2);
		yearNumberString = dateString.substring(6, 10);
		date = dateString.substring(3, 5);
		
		if (date.startsWith("0")) {
			date = dateString.substring(4, 5);
		}
		
		String monthName;
		switch (monthNumberString) {
		case "01":
			monthName = "January";
			break;
		case "02":
			monthName = "February";
			break;
		case "03":
			monthName = "March";
			break;
		case "04":
			monthName = "April";
			break;
		case "05":
			monthName = "May";
			break;
		case "06":
			monthName = "June";
			break;
		case "07":
			monthName = "July";
			break;
		case "08":
			monthName = "August";
			break;
		case "09":
			monthName = "September";
			break;
		case "10":
			monthName = "October";
			break;
		case "11":
			monthName = "November";
			break;
		case "12":
			monthName = "December";
			break;
		default:
			monthName = "Unknown";
			break;
		}
		
		System.out.println("The current date is " + monthName + " " + date + ", " + yearNumberString);
	}
	
}
