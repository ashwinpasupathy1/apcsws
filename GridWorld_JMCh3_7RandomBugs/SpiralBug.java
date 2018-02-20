import info.gridworld.actor.Bug;


/**
 * SpiralBug is essentially the same as BoxBug except it creates a spiral instead of a box. It adds 
 * one to the side length each time
 * 
 * @author Ashwin Pasupathy
 * @version 8/25/17
 * 
 * @author Period - 1
 * @author Assignment - GridWorld Part 2, Exercise 2 - SpiralBug
 * 
 * @author Sources - none
 */
public class SpiralBug extends Bug
{
    

    /**
     * 
     */
    private int steps;
    private int sideLength;


    /**
     * Constructs a SpiralBug
     * 
     * @param length
     *            the initial side length
     */
    public SpiralBug( int length )
    {
        steps = 0;
        sideLength = length;
    }


    /**
     * Moves to the next location of the square.
     * Increases side length of square if steps is less than sideLength
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
            turn();
            steps = 0;
            sideLength++;
        }
    }
}