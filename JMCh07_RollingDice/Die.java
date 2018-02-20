/**
 * Simulates a six-sided die.
 *
 * @author Ashwin Pasupathy
 * @version 9/7/17
 * @author Period: 1
 * @author Assignment: JMCh07_RollingDice
 *
 * @author Sources: none
 */
public class Die
{
    private int numDots;


    /**
     * Sets numDots to a random integer from 1 to 6
     */
    public void roll()
    {
        numDots = 1 + (int) ( Math.random() * 6 );
    }


    /**
     * Returns the value of the most recent roll.
     * 
     * @return numDots is the number of dots
     */
    public int getNumDots()
    {
        return numDots;
    }
}
