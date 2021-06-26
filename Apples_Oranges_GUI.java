import javax.swing.JOptionPane;
//import java.util.Scanner;

public class Apples_Oranges_GUI {

	public static void main(String[] args) {
		
		String appS = JOptionPane.showInputDialog("Enter the number of apples:");
		int appC = Integer.parseInt(appS);
		
		String orgS = JOptionPane.showInputDialog("Enter the number of oranges");
		int orgC = Integer.parseInt(orgS);

		int total = appC + orgC;
		
		JOptionPane.showMessageDialog(null, "The total number of fruits = " + total);
		
	}

}
