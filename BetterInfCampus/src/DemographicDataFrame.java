import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemographicDataFrame extends JFrame {
	
	String[] stateAbbreviationsList = {"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA",
			"KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC",
			"ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
	
	String[] monthList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
	
	String[] dateList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", 
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

	String[] gendersList = {"Male", "Female", "Other"};
	
	String[] residingList = {"Both", "Father", "Mother"};
	
	JButton submitButton = new JButton();
	JTextField studentLast = new JTextField();
	JTextField studentFirst = new JTextField();
	JTextField studentMiddle = new JTextField();
	JTextField studentSt = new JTextField();
	JTextField studentCity = new JTextField();
	JComboBox studentState = new JComboBox(stateAbbreviationsList);
	JTextField studentZip = new JTextField();
	JTextField studentPhoneArea = new JTextField();
	JTextField studentPhoneThree = new JTextField();
	JTextField studentPhoneFour = new JTextField();
	JTextField studentEmail = new JTextField();
	JComboBox studentGender = new JComboBox(gendersList);
	JComboBox studentBdayM = new JComboBox(monthList);
	JComboBox studentBdayD = new JComboBox(dateList);
	JTextField studentBdayY = new JTextField();
	JComboBox studentResides = new JComboBox(residingList);
	
	JLabel studentInfo = new JLabel();
	JLabel studentLastLabel = new JLabel();
	JLabel studentFirstLabel = new JLabel();
	JLabel studentMiddleLabel = new JLabel();
	JLabel studentAddressLabel = new JLabel();
	JLabel studentStLabel = new JLabel();
	JLabel studentCityLabel = new JLabel();
	JLabel studentStateLabel = new JLabel();
	JLabel studentZipLabel = new JLabel();
	JLabel studentPhoneLabel = new JLabel();
	JLabel studentPhoneAreaLabel = new JLabel();
	JLabel studentPhoneThreeLabel = new JLabel();
	JLabel studentPhoneFourLabel = new JLabel();
	JLabel studentContactLabel = new JLabel();
	JLabel studentEmailLabel = new JLabel();
	JLabel studentGenderLabel = new JLabel();
	JLabel studentBdayLabel = new JLabel();
	JLabel studentBdayMLabel = new JLabel();
	JLabel studentBdayDLabel = new JLabel();
	JLabel studentBdayYLabel = new JLabel();	
	JLabel studentResidesLabel = new JLabel();	
	
	JTextField fatherLast = new JTextField();
	JTextField fatherFirst = new JTextField();
	JTextField fatherMiddle = new JTextField();
	JTextField fatherSt = new JTextField();
	JTextField fatherCity = new JTextField();
	JComboBox fatherState = new JComboBox(stateAbbreviationsList);
	JTextField fatherZip = new JTextField();
	JTextField fatherPhoneArea = new JTextField();
	JTextField fatherPhoneThree = new JTextField();
	JTextField fatherPhoneFour = new JTextField();
	JTextField fatherEmail = new JTextField();

	JLabel fatherInfo = new JLabel();
	JLabel fatherLastLabel = new JLabel();
	JLabel fatherFirstLabel = new JLabel();
	JLabel fatherMiddleLabel = new JLabel();
	JLabel fatherAddressLabel = new JLabel();
	JLabel fatherStLabel = new JLabel();
	JLabel fatherCityLabel = new JLabel();
	JLabel fatherStateLabel = new JLabel();
	JLabel fatherZipLabel = new JLabel();
	JLabel fatherContactLabel = new JLabel();
	JLabel fatherPhoneLabel = new JLabel();
	JLabel fatherPhoneAreaLabel = new JLabel();
	JLabel fatherPhoneThreeLabel = new JLabel();
	JLabel fatherPhoneFourLabel = new JLabel();
	JLabel fatherEmailLabel = new JLabel();
	
	JTextField motherLast = new JTextField();
	JTextField motherFirst = new JTextField();
	JTextField motherMiddle = new JTextField();
	JTextField motherSt = new JTextField();
	JTextField motherCity = new JTextField();
	JComboBox motherState = new JComboBox(stateAbbreviationsList);
	JTextField motherZip = new JTextField();
	JTextField motherPhoneArea = new JTextField();
	JTextField motherPhoneThree = new JTextField();
	JTextField motherPhoneFour = new JTextField();
	JTextField motherEmail = new JTextField();

	JLabel motherInfo = new JLabel();
	JLabel motherLastLabel = new JLabel();
	JLabel motherFirstLabel = new JLabel();
	JLabel motherMiddleLabel = new JLabel();
	JLabel motherAddressLabel = new JLabel();
	JLabel motherStLabel = new JLabel();
	JLabel motherCityLabel = new JLabel();
	JLabel motherStateLabel = new JLabel();
	JLabel motherZipLabel = new JLabel();
	JLabel motherContactLabel = new JLabel();
	JLabel motherPhoneLabel = new JLabel();
	JLabel motherPhoneAreaLabel = new JLabel();
	JLabel motherPhoneThreeLabel = new JLabel();
	JLabel motherPhoneFourLabel = new JLabel();
	JLabel motherEmailLabel = new JLabel();
	
	JTextField emergencyLast = new JTextField();
	JTextField emergencyFirst = new JTextField();
	JTextField emergencyMiddle = new JTextField();
	JTextField emergencyPhoneArea = new JTextField();
	JTextField emergencyPhoneThree = new JTextField();
	JTextField emergencyPhoneFour = new JTextField();
	JTextField emergencyRelationship = new JTextField();

	JLabel emergencyInfo = new JLabel();
	JLabel emergencyLastLabel = new JLabel();
	JLabel emergencyFirstLabel = new JLabel();
	JLabel emergencyMiddleLabel = new JLabel();
	JLabel emergencyPhoneLabel = new JLabel();
	JLabel emergencyPhoneAreaLabel = new JLabel();
	JLabel emergencyPhoneThreeLabel = new JLabel();
	JLabel emergencyPhoneFourLabel = new JLabel();
	JLabel emergencyRelationshipLabel = new JLabel();	

	
	public DemographicDataFrame() {
			
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints grid = new GridBagConstraints();
		
		grid.ipadx = 4;
		grid.ipady = 4;
		
		grid.insets = new Insets(10, 10, 10, 10);
		
		// Student section
		
		JPanel studentInformation = new JPanel(new BorderLayout());
		
		studentInformation.setLayout(new GridBagLayout());
		
		grid.ipadx = 4;
		grid.ipady = 4;
				
		add(studentInformation, grid);
		
		grid.gridx = 0;
		grid.gridy = 1;
		
		studentInfo.setText("Student Information:");
		studentInformation.add(studentInfo);
		
		// Student name
		
		JPanel studentName = new JPanel(new BorderLayout());
		studentName.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;
		add(studentName, grid);
		
		grid.gridx = 0;
		grid.gridy = 2;
		
		studentLastLabel.setText("Last Name: ");
		studentName.add(studentLastLabel);
		
		studentLast.setText("");
		studentLast.setColumns(10);
		studentName.add(studentLast);
		
		studentFirstLabel.setText("First Name: ");
		studentName.add(studentFirstLabel);

		studentFirst.setText("");
		studentFirst.setColumns(10);
		studentName.add(studentFirst);
		
		studentMiddleLabel.setText("Middle Name: ");
		studentName.add(studentMiddleLabel);
		
		studentMiddle.setText("");
		studentMiddle.setColumns(10);
		studentName.add(studentMiddle);
		
		// Student address
		
		JPanel studentAddress = new JPanel(new BorderLayout());
		studentAddress.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;
		add(studentAddress, grid);
		
		grid.gridx = 0;
		grid.gridy = 3;
		
		studentAddressLabel.setText("Address:   ");
		studentAddress.add(studentAddressLabel);
		
		studentStLabel.setText("Street: ");
		studentAddress.add(studentStLabel);
		
		studentSt.setText("");
		studentSt.setColumns(20);
		studentAddress.add(studentSt);
		
		studentCityLabel.setText("City: ");
		studentAddress.add(studentCityLabel);
		
		studentCity.setText("");
		studentCity.setColumns(12);
		studentAddress.add(studentCity);
		
		studentStateLabel.setText("State: ");
		studentAddress.add(studentStateLabel);
		
		studentState.setSelectedIndex(10);
		studentAddress.add(studentState);
		
		studentZipLabel.setText("Zip Code: ");
		studentAddress.add(studentZipLabel);
		
		studentZip.setText("");
		studentZip.setColumns(4);
		studentAddress.add(studentZip);
		
		// Student email
		
		JPanel studentContact = new JPanel(new BorderLayout());
		studentContact.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;	
		add(studentContact, grid);
		
		grid.gridx = 0;
		grid.gridy = 4;
		
		studentEmailLabel.setText("Email: ");
		studentContact.add(studentEmailLabel);
		
		studentEmail.setText("");
		studentEmail.setColumns(20);
		studentContact.add(studentEmail);
		
		// Student phone
		
		studentPhoneLabel.setText("Phone Number (###-###-####): ");
		studentContact.add(studentPhoneLabel);
		
		studentPhoneArea.setText("");
		studentPhoneArea.setColumns(2);
		studentContact.add(studentPhoneArea);
		
		studentPhoneAreaLabel.setText("-");
		studentContact.add(studentPhoneAreaLabel);
		
		studentPhoneThree.setText("");
		studentPhoneThree.setColumns(2);
		studentContact.add(studentPhoneThree);
		
		studentPhoneThreeLabel.setText("-");
		studentContact.add(studentPhoneThreeLabel);
		
		studentPhoneFour.setText("");
		studentPhoneFour.setColumns(3);
		studentContact.add(studentPhoneFour);
		
		// Student gender
		
		JPanel studentDemographics = new JPanel(new BorderLayout());
		studentDemographics.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;
		add(studentDemographics, grid);
		
		grid.gridx = 0;
		grid.gridy = 5;
		
		studentGenderLabel.setText("Gender: ");
		studentDemographics.add(studentGenderLabel);

		studentGender.setSelectedIndex(0);
		studentDemographics.add(studentGender);

		// Student birthday

		studentBdayLabel.setText("Birthdate (Month, Day, Year):");
		studentDemographics.add(studentBdayLabel);

		studentBdayM.setSelectedIndex(0);
		studentDemographics.add(studentBdayM);

		studentBdayD.setSelectedIndex(0);
		studentDemographics.add(studentBdayD);

		studentBdayY.setText("");
		studentBdayY.setColumns(4);
		studentDemographics.add(studentBdayY);
		
		// Student resides
		
		JPanel studentLives = new JPanel(new BorderLayout());
		studentLives.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;		
		add(studentLives, grid);
		
		grid.gridx = 0;
		grid.gridy = 6;
		
		studentResidesLabel.setText("Student lives with: ");
		studentLives.add(studentResidesLabel);
		
		studentResides.setSelectedIndex(0);
		studentLives.add(studentResides);
		
		// Father information
		
		JPanel fatherInformation = new JPanel(new BorderLayout());
		fatherInformation.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;
		
		add(fatherInformation, grid);
		
		grid.gridx = 0;
		grid.gridy = 7;
		
		fatherInfo.setText("Father Information:");
		fatherInformation.add(fatherInfo);
		
		JPanel fatherName = new JPanel(new BorderLayout());
		fatherName.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;
		add(fatherName, grid);
		
		grid.gridx = 0;
		grid.gridy = 8;
		
		fatherLastLabel.setText("Last Name: ");
		fatherName.add(fatherLastLabel);

		fatherLast.setText("");
		fatherLast.setColumns(10);
		fatherName.add(fatherLast);

		fatherFirstLabel.setText("First Name: ");
		fatherName.add(fatherFirstLabel);

		fatherFirst.setText("");
		fatherFirst.setColumns(10);
		fatherName.add(fatherFirst);

		fatherMiddleLabel.setText("Middle Name: ");
		fatherName.add(fatherMiddleLabel);

		fatherMiddle.setText("");
		fatherMiddle.setColumns(10);
		fatherName.add(fatherMiddle);

		// Father address
		
		JPanel fatherAddress = new JPanel(new BorderLayout());
		fatherAddress.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;
		add(fatherAddress, grid);
		
		grid.gridx = 0;
		grid.gridy = 9;
		
		fatherAddressLabel.setText("Address:     ");
		fatherAddress.add(fatherAddressLabel);

		fatherStLabel.setText("Street: ");
		fatherAddress.add(fatherStLabel);

		fatherSt.setText("");
		fatherSt.setColumns(20);
		fatherAddress.add(fatherSt);

		fatherCityLabel.setText("City: ");
		fatherAddress.add(fatherCityLabel);

		fatherCity.setText("");
		fatherCity.setColumns(12);
		fatherAddress.add(fatherCity);

		fatherStateLabel.setText("State: ");
		fatherAddress.add(fatherStateLabel);

		fatherState.setSelectedIndex(10);
		fatherAddress.add(fatherState);

		fatherZipLabel.setText("Zip Code: ");
		fatherAddress.add(fatherZipLabel);

		fatherZip.setText("");
		fatherZip.setColumns(4);
		fatherAddress.add(fatherZip);

		// Father email
		
		JPanel fatherContact = new JPanel(new BorderLayout());
		fatherContact.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;	
		add(fatherContact, grid);
		
		grid.gridx = 0;
		grid.gridy = 10;
		
		fatherEmailLabel.setText("Email: ");
		fatherContact.add(fatherEmailLabel);

		fatherEmail.setText("");
		fatherEmail.setColumns(20);
		fatherContact.add(fatherEmail);

		// Father phone

		fatherPhoneLabel.setText("Phone Number (###-###-####): ");
		fatherContact.add(fatherPhoneLabel);

		fatherPhoneArea.setText("");
		fatherPhoneArea.setColumns(2);
		fatherContact.add(fatherPhoneArea);

		fatherPhoneAreaLabel.setText("-");
		fatherContact.add(fatherPhoneAreaLabel);

		fatherPhoneThree.setText("");
		fatherPhoneThree.setColumns(2);
		fatherContact.add(fatherPhoneThree);

		fatherPhoneThreeLabel.setText("-");
		fatherContact.add(fatherPhoneThreeLabel);

		fatherPhoneFour.setText("");
		fatherPhoneFour.setColumns(3);
		fatherContact.add(fatherPhoneFour);
		
		// Mother information
		
		JPanel motherInformation = new JPanel(new BorderLayout());
		motherInformation.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;	
		add(motherInformation, grid);
		
		grid.gridx = 0;
		grid.gridy = 11;
		
		motherInfo.setText("Mother Information:");
		motherInformation.add(motherInfo);
		
		JPanel motherName = new JPanel(new BorderLayout());
		motherName.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;	
		add(motherName, grid);
		
		grid.gridx = 0;
		grid.gridy = 12;

		motherLastLabel.setText("Last Name: ");
		motherName.add(motherLastLabel);

		motherLast.setText("");
		motherLast.setColumns(10);
		motherName.add(motherLast);

		motherFirstLabel.setText("First Name: ");
		motherName.add(motherFirstLabel);

		motherFirst.setText("");
		motherFirst.setColumns(10);
		motherName.add(motherFirst);

		motherMiddleLabel.setText("Middle Name: ");
		motherName.add(motherMiddleLabel);

		motherMiddle.setText("");
		motherMiddle.setColumns(10);
		motherName.add(motherMiddle);

		// Mother address
		
		JPanel motherAddress = new JPanel(new BorderLayout());
		motherAddress.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;	
		add(motherAddress, grid);
		
		grid.gridx = 0;
		grid.gridy = 13;

		motherAddressLabel.setText("Address:     ");
		motherAddress.add(motherAddressLabel);
		
		motherStLabel.setText("Street: ");
		motherAddress.add(motherStLabel);

		motherSt.setText("");
		motherSt.setColumns(20);
		motherAddress.add(motherSt);

		motherCityLabel.setText("City: ");
		motherAddress.add(motherCityLabel);

		motherCity.setText("");
		motherCity.setColumns(12);
		motherAddress.add(motherCity);

		motherStateLabel.setText("State: ");
		motherAddress.add(motherStateLabel);

		motherState.setSelectedIndex(10);
		motherAddress.add(motherState);

		motherZipLabel.setText("Zip Code: ");
		motherAddress.add(motherZipLabel);

		motherZip.setText("");
		motherZip.setColumns(4);
		motherAddress.add(motherZip);

		// Mother email
		
		JPanel motherContact = new JPanel(new BorderLayout());
		motherContact.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;	
		add(motherContact, grid);
		
		grid.gridx = 0;
		grid.gridy = 14;
		
		motherEmailLabel.setText("Email: ");
		motherContact.add(motherEmailLabel);

		motherEmail.setText("");
		motherEmail.setColumns(20);
		motherContact.add(motherEmail);
		
		// Mother phone

		motherPhoneLabel.setText("Phone Number (###-###-####): ");
		motherContact.add(motherPhoneLabel);

		motherPhoneArea.setText("");
		motherPhoneArea.setColumns(2);
		motherContact.add(motherPhoneArea);

		motherPhoneAreaLabel.setText("-");
		motherContact.add(motherPhoneAreaLabel);

		motherPhoneThree.setText("");
		motherPhoneThree.setColumns(2);
		motherContact.add(motherPhoneThree);

		motherPhoneThreeLabel.setText("-");
		motherContact.add(motherPhoneThreeLabel);

		motherPhoneFour.setText("");
		motherPhoneFour.setColumns(3);
		motherContact.add(motherPhoneFour);
		
		// Emergency Information
		
		JPanel emergencyInformation = new JPanel(new BorderLayout());
		emergencyInformation.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;	
		add(emergencyInformation, grid);
		
		grid.gridx = 0;
		grid.gridy = 15;
		
		emergencyInfo.setText("Emergency Information:");
		emergencyInformation.add(emergencyInfo, grid);

		JPanel emergencyName = new JPanel(new BorderLayout());
		emergencyName.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;	
		add(emergencyName, grid);
		
		grid.gridx = 0;
		grid.gridy = 16;
		
		emergencyLastLabel.setText("Last Name: ");
		emergencyName.add(emergencyLastLabel);

		emergencyLast.setText("");
		emergencyLast.setColumns(10);
		emergencyName.add(emergencyLast);

		emergencyFirstLabel.setText("First Name: ");
		emergencyName.add(emergencyFirstLabel);

		emergencyFirst.setText("");
		emergencyFirst.setColumns(10);
		emergencyName.add(emergencyFirst);

		emergencyMiddleLabel.setText("Middle Name: ");
		emergencyName.add(emergencyMiddleLabel);

		emergencyMiddle.setText("");
		emergencyMiddle.setColumns(10);
		emergencyName.add(emergencyMiddle);
		
		// Emergency phone
		
		JPanel emergencyPhone = new JPanel(new BorderLayout());
		emergencyPhone.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;	
		add(emergencyPhone, grid);
		
		grid.gridx = 0;
		grid.gridy = 17;

		emergencyPhoneLabel.setText("Phone Number (###-###-####): ");
		emergencyPhone.add(emergencyPhoneLabel);

		emergencyPhoneArea.setText("");
		emergencyPhoneArea.setColumns(2);
		emergencyPhone.add(emergencyPhoneArea);

		emergencyPhoneAreaLabel.setText("-");
		emergencyPhone.add(emergencyPhoneAreaLabel);

		emergencyPhoneThree.setText("");
		emergencyPhoneThree.setColumns(2);
		emergencyPhone.add(emergencyPhoneThree);

		emergencyPhoneThreeLabel.setText("-");
		emergencyPhone.add(emergencyPhoneThreeLabel);

		emergencyPhoneFour.setText("");
		emergencyPhoneFour.setColumns(3);
		emergencyPhone.add(emergencyPhoneFour);
		
		JPanel emergencyRelationshipInfo = new JPanel(new BorderLayout());
		emergencyRelationshipInfo.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;	
		add(emergencyRelationshipInfo, grid);
		
		grid.gridx = 0;
		grid.gridy = 18;
		
		emergencyRelationshipLabel.setText("Relationship to student: ");
		emergencyRelationshipInfo.add(emergencyRelationshipLabel);
		
		emergencyRelationship.setText("");
		emergencyRelationship.setColumns(10);
		emergencyRelationshipInfo.add(emergencyRelationship);
		
		JPanel submit = new JPanel(new BorderLayout());
		submit.setLayout(new GridBagLayout());
		grid.ipadx = 4;
		grid.ipady = 4;	
		add(submit, grid);
		
		grid.gridx = 0;
		grid.gridy = 19;
		
		submitButton.setText("Submit");
		submit.add(submitButton, grid);
		
		pack();
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new DemographicDataFrame();
	}
}
