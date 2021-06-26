/**import javax.swing.JOptionPane;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// Program that compares the Lexicographic Order of two strings that the user enters.
		String firstString = JOptionPane.showInputDialog("Enter the first string: ");
		String secondString = JOptionPane.showInputDialog("Enter the second string: ");
		
		int compare = firstString.compareTo(secondString);
		
		if (compare != 0)
			JOptionPane.showMessageDialog(null, "First string is lexicographicaly first");
		else
			JOptionPane.showMessageDialog(null, "Second string is lexicographicaly second");
				
	}

}
**/
import java.util.Scanner;

public class Question4 {
	
		public static void main(String[] args) {
			System.out.println("Enter in first string");
			Scanner input = new Scanner(System.in);
			String first  = input.nextLine();
			System.out.println("Enter in second string");
			String second = input.nextLine();
			
			int compare = first.compareTo(second);
			
			if (compare < 0)
				System.out.println("userInput1" + first + "precedes" + second);
			else if (compare == 0)
				System.out.println("userInput1 " + first + " is equal" + second);
			else
				System.out.println("userInput1 " + first + "procedes " + second);
			
			input.close();
		}
}