package question5;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		int f = 1;
		for (int i =2; i <=n ; i ++) {
			f = (f * i) + f;
		}
		System.out.println("f : " + f);
	}

}
