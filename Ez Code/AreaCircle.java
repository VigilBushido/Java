import java.util.Scanner;


public class AreaCircle {
	public static final double PI = 3.14159;
	// static variable for the entire program 
	
	public static void main(String[] args) {
		float radius;
		System.out.println("Enter the radius of the cirle in inches:");
		Scanner input = new Scanner(System.in);
		radius = input.nextFloat();
		
		double area = radius * radius * PI;
		System.out.println("The area is " + area);
		input.close();
	}
	
}
