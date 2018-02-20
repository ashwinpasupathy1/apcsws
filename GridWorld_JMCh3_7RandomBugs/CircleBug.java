import info.gridworld.actor.Bug;

/**
   This class traces out an circle with a given side length.
   It is an extension of BoxBug but it makes a circle instead of a square.

   @author  Ashwin Pasupathy
   @version 8/24/17

   @author  Period - 1
   @author  Assignment - GridWorld Part 2, Random bugs - CircleBug

   @author  Sources - none
 */
public class CircleBug extends Bug
{
    
    /**
     * @param steps steps is the amount of steps until it turns
     * @param sideLength is the side length of the circle
     */
    private int steps;
    private int sideLength;

    /**
     * @param length length is the side length
     * constructs a circle bug with a given length
     */
    public CircleBug( int length )
    {
        steps=0;
        sideLength = length;
    }

    
    /* (non-Javadoc)
     * @see BoxBug#act()
     * moves one less time than BoxBug's act method
     */
    public void act()
    {
        if ( steps < sideLength && canMove() )
        {
            move();
            steps++;
        }
        else
        {
            turn();
            steps = 0;
        }
    }
}