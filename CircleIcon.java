package Lab2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.Icon;

public class CircleIcon implements Icon {
	public CircleIcon(int aSize) {
		size=aSize;
		color=Color.red;
	}
	public int getIconWidth() {
		return size;
	}
	public int getIconHeight() {
		return size;
	}
	public void recolor(Color aColor) {
		color=aColor;
	}
	public void paintIcon(Component c,Graphics g, int x, int y) {
		g2=(Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x,y,size,size);
		g2.setColor(color);
		g2.fill(circle);
	}
	private Color color;
	private int size;
	private Graphics2D g2;
}
