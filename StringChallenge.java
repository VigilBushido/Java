import java.util.*;
import java.io.*;

public class StringChallenge{

public static String SC(String str) {
		// code goes here
	if (str.length() < 11) {
		str = "false";
		return str;
	}
	
	for (int i = 0; i < str.length(); i ++) {
		char a = str.charAt(i);
		if (a == '0') {
			str = "false";
			return str;
		}
	}
	
	int a = str.charAt(0); 
	int b = str.charAt(1);
	int c = str.charAt(2);

	int d = str.charAt(4);
	int e = str.charAt(5);
	int f = str.charAt(6);
	
	int firstSum = a + b + c;
	int secondSum = d + e + f;
	
	if (firstSum % 2 != 0 || secondSum % 2 == 0)
	{
		str = "false";
		return str;
	}
	
	int g = str.charAt(8);
	int h = str.charAt(9);
	int m = str.charAt(10);
	
	if (c < b || c < a || f < e || f < d || m < h || m < g) {
		str = "false";
		return str;
	}
	else {
		str = "true";
	}
	
	return str;
}

public static void main(String[] args) {
	// keep this function call here
	System.out.print(SC("114.568.112"));
}

}
	

