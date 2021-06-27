
public class Person {
	public static String Name;
	public static double kilograms;
	public static double heightMeters;
	public static double BMI;
	public static double BMI_rounded;
	
	
	public static void Greeting() {
		System.out.println("Hello my name is " + Name); 
	}
	
	public static void calculateBMI() {
		// BMI = kg / (m * m)
		BMI = kilograms / (heightMeters * heightMeters);
		BMI_rounded = Math.round(BMI * 100.0)/100.0;  // scaled up number , then scaled down 
		
		if (BMI < 18.5)
		{
			System.out.println("Your BMI: "+ BMI_rounded);
			System.out.println("Underweight");}
		else if(BMI >= 18.5 && BMI < 25) {
			System.out.println("Your BMI: "+ BMI_rounded);
			System.out.println("Normal Weight");
		}
		else if (BMI >= 25 && BMI < 30)
		{
			System.out.println("Your BMI: "+ BMI_rounded);
			System.out.println("Overweight");
		}
		else if (BMI >= 30) {
			System.out.println("Your BMI: "+ BMI_rounded);
			System.out.println("Obese");
		}
		
	}

}
