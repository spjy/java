import javax.swing.JOptionPane;

public class YoungProgram03 {
	public static void main (String[] args) {
		String inputString1, inputString2, inputString3, inputString4, inputString5;
		inputString1 = JOptionPane.showInputDialog("How are you today?");
		if (inputString1.endsWith("!")) {
			JOptionPane.showMessageDialog(null, "Stop yelling at me!");
		} else {
			JOptionPane.showMessageDialog(null, "Ok.");
		}
		inputString2 = JOptionPane.showInputDialog("How are you today?");
		if (inputString2.startsWith("I")) {
			JOptionPane.showMessageDialog(null, "Wow you're egotistical. Saying I.");
		} else {
			JOptionPane.showMessageDialog(null, "Cool cool.");
		}
		inputString3 = JOptionPane.showInputDialog("What is your favorite class?");
		if (inputString3.contains("Calculus")) {
			JOptionPane.showMessageDialog(null, "Calculus is cool!");
		} else {
			JOptionPane.showMessageDialog(null, "I like that class too.");
		}
		inputString4 = JOptionPane.showInputDialog("What is your favorite thing to do?");
		if (inputString4.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Are you trying to ignore me?!");
		} else {
			JOptionPane.showMessageDialog(null, "I like " + inputString4 + " too!");
		}
		inputString5 = JOptionPane.showInputDialog("Can you write 5 letters?");
		if (inputString5.length() == 5) {
			JOptionPane.showMessageDialog(null, "Good job :D");
		} else {
			JOptionPane.showMessageDialog(null, "Work on it!");
		}
	}
}
