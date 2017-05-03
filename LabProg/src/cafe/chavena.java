package cafe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import aula2.CarShape;
import aula2.ShapeIcon;

public class chavena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame frame = new JFrame();
		ChavenaIcon chavena = new ChavenaIcon(50);
		//CarShape car = new CarShape(10,10,100);
		//ShapeIcon carshape = new ShapeIcon(car, 10,10);
		JLabel label = new JLabel(chavena);
		
		frame.add(label);
		frame.setSize(500,500);
		frame.setVisible(true);

	}

}
