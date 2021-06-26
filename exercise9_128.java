
public class exercise9_128 {
/* It displays an open quotation mark then a tab, then the word Test followed by 2 backslashes and then a new line
 * with the letters "It'".
 * By replacing the r with an n, there were no apparent changes , the output was exactly the same.
 *
 * \n is a line feed character , character code 10
 * \r is a carriage return , character code 13
 * 
 * On windows lines are terminated using \r followed immediately by \n
 * On unix lines are terminated using \n only.
 * 
 * Because of this confusion some output targets will accept multiple line break sequences, so you can get the same effect
 * from either character
 */
	public static void main(String[] args) {
		System.out.println("\"\tTest\\\\\rIt\'");
		System.out.println("\"\tTest\\\\\nIt\'");
	}

}
