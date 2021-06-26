import java.util.Scanner;

public class TruncatesString {

	public static void main(String[] args) {
		// takes in a string as input and then takes a word from that string
		// and truncates the string
		System.out.println("Enter a string:");
		Scanner input = new Scanner(System.in);
		String userString = input.nextLine();
		System.out.println("Enter a word in that string");

		String word = input.nextLine();
		
		int index = userString.indexOf(word);
		// substring(begins, ends)
		String newString = userString.substring(0, index);
		// newTruncatedString
		System.out.println(newString);
		input.close();
		
	}

}
