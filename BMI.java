import java.util.Scanner;

public class BMI {
	public static final double BMI = 0;
	public static final double Height = 0;
	public static void main(String[] args) {
		//BMI = mass / height^2
		// < 18.5 underweight
		// 18.5 <= BMI < 25 Normal Weight
		// 25 <= BMI < 30 Over Weight
		// 30 <= BMI Obese
		//0.0254 meters per inch. , lbs to kilo / 2.2 
		double bmi, mass, meters;
		
		System.out.println("Enter in your Height (inches)");
		Scanner input = new Scanner(System.in);
		int Height = input.nextInt();
		meters = Height * 0.0254;
		System.out.println("Your Height is " + Height);
		
		System.out.println("Enter in your weight (lbs)");
		int Weight = input.nextInt();
		System.out.println("... calculating your BMI");
		mass = Weight /= 2.2;
		bmi = mass / (meters * meters);
		
		if (bmi < 18.5)
		{
			System.out.println("underweight: ");}
		else if(bmi < 25) {
			System.out.println("Enter height in feet: ");

		}
		else if (bmi < 30)
		{
			System.out.println("overweight: ");

		}
		else {
			System.out.println("Invalid Input");
		}
		//pounds /= 2.2;
	    //inches = 0.0245 * 
		System.out.println("Your BMI is " + bmi);
	}
// SYstem.exit(0)
}
