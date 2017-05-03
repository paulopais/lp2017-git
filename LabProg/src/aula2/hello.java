package aula2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class hello {

	public static void main(String[] args){
	
	JOptionPane.showMessageDialog(
			null, // parent window
			"Hello World!", // message
			"Message", // window title
			JOptionPane.INFORMATION_MESSAGE, // message type
			new ImageIcon("globe.gif"));
	
	
}
}