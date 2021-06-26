//import java.util.Scanner;
import javax.swing.JOptionPane;

public class WhichStringLongerGUI {

	public static void main(String[] args) {
		// using a gui , print which is longer
		String s1 = JOptionPane.showInputDialog("Enter in a string");
		int length = s1.length();
		
		String s2 = JOptionPane.showInputDialog("Enter in a string");
		int length2 = s2.length();
		
		if (length > length2) {
		JOptionPane.showMessageDialog(null, "The 1st String is longer = " + s1);
		}
		else if (length == length2) {
			JOptionPane.showMessageDialog(null,  "They are equal ");
		}
		else {
		JOptionPane.showMessageDialog(null, "The 2nd String is longer = " + s2);
		}
	}

}
