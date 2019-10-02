package Lab2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Exam.CircleFrame;

public class Frame
{
	public static void main(String[] args) {

		CircleIcon circle=new CircleIcon(100);
		JFrame frame = new JFrame();
		

		JButton redButton = new JButton("Repainted red");
		JButton blueButton = new JButton("Repainted Blue");
		JButton greenButton=new JButton("Repainted green");
		JLabel label=new JLabel(circle);
		redButton.addActionListener(event -> {circle.recolor(Color.RED);label.repaint();});
		blueButton.addActionListener(event ->{circle.recolor(Color.BLUE);label.repaint();});
		greenButton.addActionListener(event ->{circle.recolor(Color.GREEN);label.repaint();});

		frame.setLayout(new FlowLayout());

		frame.add(redButton);
		frame.add(blueButton);
		frame.add(greenButton);
		frame.add(label);



		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
