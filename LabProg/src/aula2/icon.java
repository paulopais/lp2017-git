package aula2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class icon {

	
	public class MarsIcon implements Icon
	{
	public MarsIcon(int aSize)
	{
	size = aSize;
	}
	public int getIconWidth()
	{
	return size;
	}
	public int getIconHeight()
	{
	return size;
	}
	public void paintIcon(Component c, Graphics g, int x, int y)
		{
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double planet = new
		Ellipse2D.Double(x, y,
		size, size);
		g2.setColor(Color.RED);
		g2.fill(planet);
		}
	private int size;

	
	}
}
