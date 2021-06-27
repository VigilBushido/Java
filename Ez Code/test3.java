package question3;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{ 7,2,2,5,5,8,9 };
		
		int c_1 = 0, c_2=7;
		
		for (int i = 0; i < a.length; i ++) {
			if (a[i] % 2 == 0)
				c_1++;
			else 
				c_2--;
		}
		System.out.println("c_1: "+ c_1);
		System.out.println("c_2: "+ c_2);
	}

}
