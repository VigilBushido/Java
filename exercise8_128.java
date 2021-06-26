import java.util.Scanner;

public class exercise8_128 {

	public static void main(String[] args) {
		String s1, s2, s3, s4;
		int n1, n2, n3;
		
		// find the second word in a string
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in a string of words");
		
		s1 = input.nextLine();
		n1 = s1.indexOf(" ");
	
		s2 = s1.substring(0, n1);
		n2 = s1.length();
		s3 = s1.substring(n1+1, n2);
		n3 = s3.indexOf(" ");
		s4 = s3.substring(0, n3);
		
		System.out.println("The second word is: "+ s4);
	}

}
