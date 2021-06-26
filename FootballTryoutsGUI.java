import javax.swing.JOptionPane;

public class Question2 {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Football Tryouts!");
		String s1 = JOptionPane.showInputDialog("Are you Fast? (y/n)");
		String s2 = JOptionPane.showInputDialog("Are you Big? (y/n)");

		if (s1.equals("y") && s2.equals("y")) // == compares the memory location
			JOptionPane.showMessageDialog(null, "Your on the team!!");
		else 
			JOptionPane.showMessageDialog(null, "Your cut from the team :(");
			//ConfirmDialog shows a yes / no / cancel
	}
}