package HW3;


import java.awt.FlowLayout;

import javax.swing.*;

public class FrameZoom {
	private static int width;

	public static void main (String[] args) {
		int size =100;
		CarIcon car=new CarIcon(size);
		JFrame frame=new JFrame();
		JButton zoomin=new JButton("Zoom in");
		JButton zoomout=new JButton("Zoom out");
		JLabel label=new JLabel(car);
		
		zoomin.addActionListener(event -> {car.resize(width+=30);label.repaint();});
		zoomout.addActionListener(event -> {car.resize(width-=30);label.repaint();}); 
		
		frame.setLayout(new FlowLayout());
		frame.add(zoomin);
		frame.add(zoomout);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
