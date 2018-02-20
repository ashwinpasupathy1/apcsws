
/**
 * @author Ashwin Pasupathy
 * @version T 8/21/17
 * @author Period: TODO 1
 * @author Assignment: JMCh02Exer - Target.java
 *
 * @author Sources: TODO none
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Target extends JPanel
{

    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
                                   // to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = 30;
        g.setColor( Color.RED );
        g.fillOval( xCenter - radius, yCenter - radius, radius * 2, radius * 2 );// draws
                                                                                 // circle
                                                                                 // with
                                                                                 // radius
                                                                                 // 30
        g.setColor( Color.WHITE );
        radius -= 10; // changes diameter for smaller white oval
        g.fillOval( xCenter - radius, yCenter - radius, 2 * radius, 2 * radius );// draws
                                                                                 // circle
                                                                                 // with
                                                                                 // radius
                                                                                 // 20
        radius -= 10;
        g.setColor( Color.red );
        g.fillOval( xCenter - radius, yCenter - radius, radius * 2, radius * 2 );// draws
                                                                                 // circle
                                                                                 // with
                                                                                 // radius
                                                                                 // 10

    }


    public static void main( String[] args )
    {
        JFrame window = new JFrame( "Target" );
        window.setBounds( 300, 300, 200, 200 );
        window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Target panel = new Target();
        panel.setBackground( Color.WHITE );
        Container c = window.getContentPane();
        c.add( panel );
        window.setVisible( true );
    }
}
