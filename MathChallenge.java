import java.util.*;
import java.io.*;
import java.lang.*;

public class MathChallenge {

	
	public static int MC(int num) {
		
		String s = Integer.toString(num);
		int largestPairDigits = 0, oneInScope = 0;
		
		for (int i = 0; i < s.length() - 1; i++) {
			String pair = "";
			pair += (s.charAt(i));
			pair += (s.charAt(i+1));
			
			oneInScope = Integer.parseInt(pair);
			if (oneInScope > largestPairDigits) {
				largestPairDigits = oneInScope;
				num = largestPairDigits;
			}
			
		}
		
		
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MC(453857));

	}

}
