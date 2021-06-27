package question1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0; int g = 1;
		
		for (int i = 1; i <=5; i++) {
			System.out.println(f + ",");
			f = f + g;
			
			g = f - g;
		}
		System.out.println(f + ".");

	}
	
}
