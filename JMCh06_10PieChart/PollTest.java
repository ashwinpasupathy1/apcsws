/**
 * Tests the counting of the PollDisplayPanel.
 * 
 * @author Ashwin Pasupathy
 * @version 9/1/17
 * @author Period: 1
 * @author Assignment: JMCh06_10PieChart
 *
 * @author Sources: none
 */
public class PollTest
{
    /**
     * Tests PollDisplayPanel class.
     * 
     * @param args
     *            is not used
     */
    public static void main( String[] args )
    {
        PollDisplayPanel votingMachine = new PollDisplayPanel
                                    ( "Tami", "Brian", "Liz" );
        votingMachine.vote1();
        votingMachine.vote2();
        votingMachine.vote2();
        System.out.println( votingMachine );

    }
}
