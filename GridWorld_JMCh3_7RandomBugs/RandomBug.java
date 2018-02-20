import java.awt.Color;

import info.gridworld.actor.Bug;


/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 *
 * @author Ashwin Pasupathy
 * @version Aug 24, 2017
 * @author Period: 1
 * @author Assignment: GridWorld_JMCh3_7RandomBugs
 *
 * @author Sources: none
 */
public class RandomBug extends Bug
{
    /**
     *creates RandomBug 
     */
    public RandomBug()
    {
        setColor( Color.YELLOW );
    }


    /**
     * @param bugColor sets color of Bug
     */
    public RandomBug( Color bugColor )
    {
        setColor( bugColor );
    }


    /**
     * turns bug a given angle
     * @param angle how much the bug turns
     */
    public void turn( int angle )
    {
       setDirection(getDirection() + angle);
    }


    //Overrides Bug's act method
    public void act()
    {
        int angle = 45 * (int)( Math.random() * 8 );
        if ( canMove() )
        {
            move();
            turn( angle );
        }
        else
        {
            turn( angle );
        }

    }

}