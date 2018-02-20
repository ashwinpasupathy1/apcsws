/**
 * Implements the game of Craps logic.
 *
 * @author Ashwin Pasupathy
 * @version 9/7/17
 * @author Period: 1
 * @author Assignment: JMCh07_RollingDice
 *
 * @author Sources: none
 */
public class CrapsGame
{
    private int point = 0;


    /**
     * Calculates the result of the next dice
     *  roll in the Craps game. The
     * parameter total is the sum of dots on 
     * two dice. point is set to the saved
     * total, if the game continues, or 0, 
     * if the game has ended. Returns 1 if
     * layer won, -1 if player lost, 0 if 
     * player continues rolling.
     * @param total is the total sum of the dice
     * @return result of game
     */
    public int processRoll( int total )
    {
        int result = 0;

        if ( total == point )
        {

            point = 0;
            return 1;

        }
        else if ( point == 0 )
        {
            if ( total == 2 || total == 3 || total == 12 )
            {
                return -1;

            }
            else if ( total == 7 || total == 11 )
            {
                return 1;
            }
            else
            {
                point = total;
                return 0;
            }
        }
        else if ( total == 7 )
        {

            point = 0;
            return -1;

        }

        return result;
    }


    /**
     * Returns the saved point
     * @return what the saved point is
     */
    public int getPoint()
    {
        return point;
    }
}