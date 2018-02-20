/**  
 *  @author  TODO: Ashwin Pasupathy
 *  @version TODO: 8/21/17
 *  @author  Period: TODO 1
 *  @author  Assignment: JMCh02Exer - BannerAlt.java
 *
 *  @author  Sources: TODO none
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.Timer;

public class BannerAlt extends JApplet implements ActionListener
{
    
    
      private int xPos, yPos; // hold the coordinates of the banner 
      private int msgID = 1;  //  initializes msgID

      public void init() {
        Container c = getContentPane();
        c.setBackground(Color.WHITE);
        xPos = c.getWidth()/2 - 30;
        
        yPos = c.getHeight()/2;
        Timer clock = new Timer(2000, this);  // fires every 2 seconds 
        clock.start();
      }

      // Called automatically after a repaint request
      public void paint(Graphics g) {
        super.paint(g);
        g.setColor( Color.BLACK);
        if(msgID == 1) { 
            g.drawString("East or West", xPos, yPos); // draws string East or West if msgID = 1
        }
        else  g.drawString("Java is Best", xPos, yPos); // if msgID = -1
         
      }

      // Called automatically when the timer fires
      public void actionPerformed(ActionEvent e)
      {
        Container c = getContentPane();
        xPos--; //changes xPosition
        if (xPos < -100)
        {
          xPos = c.getWidth(); //if X goes off the screen change x back to original position
        }

        // Set the vertical position of the banner:
        yPos = c.getHeight() / 2;


        msgID = -msgID; //changes msgID to make message switch
        
        repaint();
      }
}
