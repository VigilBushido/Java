import java.util.Scanner;

public class ReplaceEasy {

	public static void main(String[] args){
		String userString;
		
		System.out.println("Enter in a string with Hard");
		Scanner input = new Scanner(System.in);
		userString = input.nextLine();
		
		int index = userString.indexOf("Hard");
		String userString2 = userString.substring(index + 4, userString.length());
		userString = userString.substring(0, index);
		
		userString = userString.toUpperCase();
		userString2 = userString2.toUpperCase();
		System.out.println(userString + "Easy" + userString2);
		input.close();

	}

}
