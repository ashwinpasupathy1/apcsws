/**
 * Tests the die class
 *
 * @author Ashwin Pasupathy
 * @version Sep 7, 2017
 * @author Period: 1
 * @author Assignment: JMCh07_RollingDice
 *
 * @author Sources: none
 */
public class DieTest
{
    /**
     * This creates a die class and tests it by rolling
     * it
     * 
     * @param args
     *            is not used
     */
    public static void main( String[] args )
    {
        Die die1 = new Die();
        die1.roll();
        System.out.println( die1.getNumDots() );

        die1.roll();
        System.out.println( die1.getNumDots() );

        die1.roll();
        System.out.println( die1.getNumDots() );

    }
}
