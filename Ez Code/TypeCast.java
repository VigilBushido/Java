import java.util.Scanner;


public class TypeCast {

	public static void main(String[] args) {
		
		System.out.println("Enter a floating point value.");
		Scanner input = new Scanner(System.in);
		float value = input.nextFloat();
	
		int x = (int)value;
		System.out.println("The floating value 3.5 type casts to integer value " + x);
		input.close();


	}

}
