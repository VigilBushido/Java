import javax.swing.JOptionPane;
//import java.util.Scanner;

public class AreaApp {
	public static final double PI = 3.14159;
	public static void main(String[] args) {	

			String radiusS = JOptionPane.showInputDialog("Enter the radius of circle:");
			Float radiusF = Float.parseFloat(radiusS);

			double area = radiusF * radiusF * PI;
				
			JOptionPane.showMessageDialog(null, "Area is = " + area);
			
	System.exit(0);
	}

}
