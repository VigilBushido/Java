import java.util.Scanner;

public class Babies {

	public static void main(String[] args) {
		// 4 & 5 in 1 case and default is unbelieveable
		System.out.println("How many babies? ");
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		
		switch(amount) {
		case 1 : 
			System.out.println("Congratulations");
			break;
		case 2:
			System.out.println("Congratulations on twins");
			break;
		case 3:
			System.out.println("Congratulations on triplets");
			break;
		case 4: 
			
		case 5:
			System.out.println("Unbelieveable");
			break;
		default:
			System.out.println("Nothing...");
			break;
		}
		input.close();
	}

}
