// This applet shows a string of text inside a box.
 /**  
 *  @author  TODO: Ashwin Pasupathy
 *  @version TODO: 8/21/17
 *  @author  Period: TODO 1
 *  @author  Assignment: JMCh02Exer - HelloApplet.java
 *
 *  @author  Sources: TODO none
 */

import java.awt.*;
import javax.swing.*;

public class HelloApplet extends JApplet
{
  public void init()
  {
    Container c = getContentPane();
    c.setBackground(Color.blue); //changes background color to blue
  }

  public void paint(Graphics g)
  {
    super.paint(g);    // call JApplet's paint method
                       //  to paint the background
    g.setColor(Color.RED);
    //g.drawRect(25, 40, 150, 45);  // draw a rectangle 150 by 45
    g.setColor(Color.WHITE); //changed color of text to white
    g.drawString("Hello, Applet!", 60, 65);
  }
}
