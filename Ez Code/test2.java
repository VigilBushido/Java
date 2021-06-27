package question2;

public class test2 {

	
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5,6};
/*		int lengthofArray = a.length;
		System.out.println("length: "+ lengthofArray);*/
		
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a [ a.length - i - 1];
			a [a.length - i - 1] = temp;
			
			i++;
		}
		
			
		for (int i = 0; i < a.length; i ++) {
			System.out.println("element at index: " + i + ": " + a[i]);
		}
	}

}
