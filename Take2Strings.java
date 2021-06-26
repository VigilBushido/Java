import java.util.Scanner;

public class Take2Strings {

	
	public static void main(String[] args) {
		//Take two strings as input . print which string is longer
		System.out.println("Enter in a string");
		Scanner input = new Scanner(System.in);
		String userString = input.next();
		
		int length1 = userString.length();
		
		System.out.println("Enter in a string");
		String userString2 = input.next();// or nextLine()
		
		int length2 = userString2.length();
		
		if (length1 > length2) {
			System.out.println("The first string entered is longer :" + userString);
		}
		else {
			System.out.println("The Second string entered is longer :" + userString2);
		}
		
		input.close();
		
	}

}
