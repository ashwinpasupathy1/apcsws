import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.AudioClip;


/**
 * Tells fortune .
 * 
 * @author Ashwin Pasupathy
 * @version 10/22/17
 * 
 * @author Period - 1
 * @author Assignment - Lab 12.3: Fortune Teller
 * 
 * @author Sources - none
 */
public class FortuneTeller extends JApplet implements ActionListener
{
    // Declare an array of "fortunes" (strings):
    // ___________________________________________
    // ...

    String[] fortunes;

    private JTextField display;

    private AudioClip ding;


    /**
     * Runs applet
     */
    public void init()
    {
        fortunes = new String[] { "you will not have a good day",
            "you will live",
            "you will not have an A", "you will have a great day", 
            "You will have an A" };

        ding = getAudioClip( getDocumentBase(), "ding.wav" );

        display = new JTextField(
            "  Press \"Next\" to see your fortune...", 30 );
        display.setBackground( Color.WHITE );
        display.setEditable( false );

        JButton go = new JButton( "Next" );
        go.addActionListener( this );

        Container c = getContentPane();
        c.setLayout( new FlowLayout() );
        c.add( display );
        c.add( go );
    }


    /**
     * Sets new text
     * 
     * @param e
     *            action event
     */
    public void actionPerformed( ActionEvent e )
    {
        ding.play();

        // Pick a random fortune:
        String text = fortunes[(int)( 
                        Math.random() * fortunes.length )];

        display.setText( text );
    }
}
