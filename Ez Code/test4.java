package question4;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[]{ -1,0,1,2,3 };
		int value = -1;
		
		int index = -1;
		
		for (int i=0; i <array.length; i++) {
			if(array[i] == value)
				index = i;
		}
		System.out.println("index: " + index);
	}

}
