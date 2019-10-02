package Lab2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Exam.CircleFrame;

public class Frame
{
	public static void main(String[] args)
	   {
	
		
	      JFrame frame = new JFrame();
	      frame.setSize(200,250);

	      JButton redButton = new JButton("Repainted red");
	      JButton blueButton = new JButton("Repainted Blue");
	      JButton greenButton=new JButton("Repainted green");
	      ActionListener actionListener = new ActionListener() {
	    		CircleFrame paintGUI;
	            public void actionPerformed(ActionEvent e) {
	                    if (e.getSource() == greenButton) {
	                            paintGUI.green();
	                    } else if (e.getSource() == redButton) {
	                            paintGUI.red();
	                    } else if (e.getSource() == blueButton) {
	                            paintGUI.blue();
	                    }
	            }
	    };
	    
	      
	      
	      frame.setLayout(new FlowLayout());
	   
	      frame.add(redButton);
	      frame.add(blueButton);
	      frame.add(greenButton);
	     
	      

	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.pack();
	      frame.setVisible(true);
	   }
}
