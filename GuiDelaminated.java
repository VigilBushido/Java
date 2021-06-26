import javax.swing.JOptionPane;

public class GuiDelaminated {

	public static void main(String[] args) {
		String stringInput = JOptionPane.showInputDialog("Enter in a string");
		String changedString = stringInput.replace('*',' ');
		JOptionPane.showMessageDialog(null, changedString);
		//position of the dialog box , can be moved around
	}

}
