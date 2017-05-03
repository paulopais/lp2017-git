package JanelaCor;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class mudacor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	JFrame frame = new JFrame();
	JButton Red = new JButton("Red");
	JButton Blue = new JButton("Blue");
	JButton Green = new JButton("Green");
	final int FIELD_WIDTH = 20;
	JTextField textField = new
	JTextField(FIELD_WIDTH);
	textField.setText("Click a button!");
	frame.setLayout(new FlowLayout());
	frame.add(Red);
	frame.add(Blue);
	frame.add(Green);
	frame.add(textField);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	
	frame.setVisible(true);
	
	
	
	
	Red.addActionListener(new ActionListener()
	
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			textField.setText("RED");
		}
	}
	);

	
	Blue.addActionListener(new ActionListener()
	
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			textField.setText("Blue");
		}
	}
	);
	
	Green.addActionListener(new ActionListener()
	
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			textField.setText("Green");
		}
	}
	);
	}
	
	
}

