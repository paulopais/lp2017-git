package aula2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class hellocar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		JFrame frame = new JFrame();
		//CarIcon car = new CarIcon(50);
		CarShape car = new CarShape(10,10,100);
		ShapeIcon carshape = new ShapeIcon(car, 10,10);
		JLabel label = new JLabel(carshape);
		
		frame.add(label);
		frame.setSize(500,100);
		ActionListener carlistener = new ActionListener(){
		public void actionPerformed(ActionEvent event){
			
			car.translate(2,0);
			label.repaint();
	

		}
		};
		
		Timer t = new Timer(50, carlistener);
		t.start();
		
		
		frame.setVisible(true);
		
		
		
	}

}
