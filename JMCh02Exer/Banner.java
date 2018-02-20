// This applet displays a message moving horizontally
// across the screen.


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Banner extends JApplet
  implements ActionListener
{
  private int xPos, yPos;  // hold the coordinates of the banner

  public void init()
  {
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    xPos = c.getWidth() /2;
    yPos = c.getHeight() / 2;
    Timer clock = new Timer(30, this);  // fires every 30 milliseconds 
    repaint();
    clock.start();
  }

  // Called automatically after a repaint request
  public void paint(Graphics g)
  {
    super.paint(g);
    //g.drawString("Hello, World!", xPos, yPos); 
    g.fillRect( xPos, yPos, 60, 10 ); 
  }

  // Called automatically when the timer fires
  public void actionPerformed(ActionEvent e)
  {
    Container c = getContentPane();

    // Adjust the horizontal position of the banner:
    xPos--;
    if (xPos < -100)
    {
      xPos = c.getWidth();
    }

    // Set the vertical position of the banner:
    yPos = c.getHeight() / 2;

    repaint();
  }
}


