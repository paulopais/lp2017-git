package cafe;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.Icon;



	public class ChavenaIcon implements Icon {

		public ChavenaIcon(int aWidth) {
			width = aWidth;
		}

		public int getIconWidth() {
			return width;
		}

		public int getIconHeight() {
			return width / 2;
		}

		public void paintIcon(Component c, Graphics g, int x, int y) {
			Graphics2D g2 = (Graphics2D) g;
			
			Ellipse2D.Double canecatopo = new Ellipse2D.Double(50,50, 50, 20);
			Ellipse2D.Double canecabase = new Ellipse2D.Double(50,150, 50, 20);
			g2.draw(new Line2D.Double(50, 160, 0 + width, 0 + 60));
			g2.draw(new Line2D.Double(100, 160, 0 + width+50, 0 + 60));
			Arc2D.Double asa = new Arc2D.Double(75, 60, 50, 70, 90, -180, Arc2D.OPEN);
			g2.fill(new RoundRectangle2D.Double(50, 70,50,90,10, 10));

			
			g2.draw(canecatopo);
			
			g2.draw(asa);
		
			g2.fill(canecabase);
			g2.draw(canecabase);
			g2.setColor(Color.orange);
			
			g2.setColor(Color.orange);
			g2.fill(new RoundRectangle2D.Double(50, 70,50,90,10, 10));
			g2.fill(canecabase);
			
			
			
			
		
		
		}

		private int width;
	}


