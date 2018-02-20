import java.awt.*;
import javax.swing.*;


/**
 * Draws an illusion of parallel lines
 * 
 * @author Ashwin Pasupathy
 * @version 9/16/17
 * 
 * Period - 1 
 * Assignment - A12.6 - ParallelLines
 * 
 * Sources - none
 */
public class ParallelLines extends JPanel
{
    /**
     * Paints component
     * 
     * @param g
     *            graphics content
     * 
     */
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
                                   // to paint the background

        int width = getWidth();
        int height = getHeight();

        drawIllusion( g, width, height );
    }


    /**
     * Draws illusion
     * 
     * @param g
     *            graphics content
     * @param width
     *            width of squares
     * @param height
     *            height of squares
     * 
     */
    public void drawIllusion( Graphics g, int width, int height )
    {
        width = 30;
        height = 30;
        int xOffset = 50;
        int yOffset = 50;
        int factor = -1;
        for ( int row = 0; row < 8; row++ )
        {
            // calculate the start of the row of squares
            yOffset += height;
            // calculate and add a horizontal offset
            xOffset = ( ( row + 1 ) % 2 ) * factor * 10;
            if ( row % 2 == 0 )
            {
                factor = -factor;
            }
            xOffset += 100;
            for ( int col = 0; col < 7; col++ )
            {
                g.fillRect( xOffset + width * col * 2, yOffset, width, height );
            }
            g.drawLine( 90, yOffset + height, 640 - width * 3,
                                                yOffset + height );

        }
        
        
        
        
    }


    /**
     * Creates parallel lines on JFrame
     * 
     * @param args
     *            is not used
     */
    public static void main( String[] args )
    {
        JFrame w = new JFrame( "ParallelLines" );
        w.setBounds( 100, 100, 640, 480 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ParallelLines panel = new ParallelLines();
        panel.setBackground( Color.WHITE );
        Container c = w.getContentPane();
        c.add( panel );
        w.setResizable( true );
        w.setVisible( true );

    }
}


