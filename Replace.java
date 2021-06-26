import java.util.Scanner;


public class Replace {

	public static void main(String[] args) {
		// a program takes a string
		System.out.println("Enter a string:");
		Scanner input = new Scanner(System.in);
		String userString = input.next();
		String changedString = userString.replace('*',' ');
		System.out.println("The New String: " + changedString);
		input.close();
	}
	
}
