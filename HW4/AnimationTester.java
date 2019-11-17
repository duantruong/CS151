import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 This program implements an animation that moves
 a car shape.
 */
class car extends Thread{
    public void run(JLabel x,int y){
        try{
            x.repaint();
            Thread.sleep(y);
        } catch (InterruptedException e){};
    }
}
public class AnimationTester
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

       MoveableShape shape
                = new CarShape(0, 0, CAR_WIDTH);

        ShapeIcon icon = new ShapeIcon(shape,
                ICON_WIDTH, ICON_HEIGHT);

        JLabel label = new JLabel(icon);
        JLabel label1 = new JLabel(icon);
        JLabel label2 = new JLabel(icon);
        JLabel label3 = new JLabel(icon);




        frame.setLayout(new FlowLayout());
        frame.add(label,BorderLayout.NORTH);
        frame.add(label1,BorderLayout.SOUTH);
        frame.add(label2,BorderLayout.NORTH);
        frame.add(label3,BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,700);
        car car1=new car();
        car car2=new car();
        car car3=new car();
        car car4=new car();


        final int DELAY = 10;
        // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, event ->
        {
            shape.move();
            car1.run(label,10);

        });
        t.start();
        Timer t1 = new Timer(DELAY, event ->
        {
            shape.move();
            car2.run(label1,20);

        });
        t1.start();
        Timer t2 = new Timer(DELAY, event ->
        {
            shape.move();
            car3.run(label2,30);

        });
        t2.start();
        Timer t3 = new Timer(DELAY, event ->
        {
            shape.move();
            car4.run(label3,100);

        });
        t3.start();
    }

    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 100;
    private static final int CAR_WIDTH = 100;
}
