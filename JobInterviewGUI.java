import javax.swing.JOptionPane;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Welcome to your job interview");
		String degree = JOptionPane.showInputDialog("Do you have a college degree? (y/n)");
		if(degree.equals("n"))
			JOptionPane.showMessageDialog(null, "Sorry we cannot extend a job at this time");
			
		String java = JOptionPane.showInputDialog("Do you know Java? (y/n)");
		if(java.equals("n"))
			JOptionPane.showMessageDialog(null, "We would like to hire you at an entry level position");
		else
			JOptionPane.showMessageDialog(null, "We would like to hire you at a senior level position");
		//if no java then offer " entry level position "
		// if both hires " senior level position"
		
	}

}
