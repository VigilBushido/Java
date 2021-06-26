
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;

public class Olympic extends JApplet{
	
	public void paint(Graphics canvas) {
		// canvas.setColor(Color.YELLOW);
		canvas.drawOval(20, 50, 40, 40);
		canvas.setColor(Color.blue);
		canvas.drawOval(50, 50, 40, 40);
		canvas.setColor(Color.yellow);
		canvas.drawOval(80,  50, 40, 40);
		canvas.setColor(Color.orange);
		canvas.drawOval(50, 50, 40, 40);
		

	}

}
