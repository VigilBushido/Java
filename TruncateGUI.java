import javax.swing.JOptionPane;

public class TruncateGUI {

	public static void main(String[] args) {
		String stringInput = JOptionPane.showInputDialog("Enter in a string");
		String word = JOptionPane.showInputDialog("Enter in a word in that string");
		
		int index = stringInput.indexOf(word);
		// substring(begins, ends)
		String newString = stringInput.substring(0, index);
		// newTruncatedString
		JOptionPane.showMessageDialog(null, newString);
	}

}

// using equal(); for password access or denied