

public class compare {
	// April 3, 2018
	static double array1[] = {5,7,8,9};
	static double array2[] = {5,7,8,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean match = true;

		do {
			int length1 = array1.length;
			int length2 = array2.length;
			if (length1 == length2)
				for (int i = 0; i < length1; i++) {
					double index1 = array1[i];
					double index2 = array2[i];
					if (index1 == index2)
						match= true;
						System.out.println("This index :" + i + "is the same");
					if (index1 != index2)
						match= false;
						System.out.println("THis index :" + i + "is not the same");
				}
		}
		while (match);
		System.exit(0);
	}
}
