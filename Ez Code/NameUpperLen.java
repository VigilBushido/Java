import java.util.Scanner;

public class NameUpperLen {

	public static void main(String[] args) {
		String name;
		System.out.println("What is your name?");
		
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		int length = name.length();
		String uppername = name.toUpperCase();
		
		System.out.println("Name Length " + length);
		System.out.println("Name Capitalized = " + uppername);
		input.close();
	}

}
