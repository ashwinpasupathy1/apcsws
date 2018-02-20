import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import java.awt.Color;


/**
 * This class creates a GridWorld with two CircleBugs within it
 * 
 * 
 * @author Ashwin Pasupathy
 * @version 8/24/17
 * 
 * @author Period - 1
 * @author Assignment - GridWorld Part 2, Random Bugs - CircleBugRunner
 * 
 * @author Sources - none
 */
public class CircleBugRunner
{
    /**
     * This method creates an ActorWorld and 2 CircleBugs and shows them
     * @param args is not used
     */
    public static void main( String[] args )
    {
        ActorWorld world = new ActorWorld();
        CircleBug alice = new CircleBug( 2 );
        alice.setColor( Color.ORANGE );
        CircleBug bob = new CircleBug( 3 );
        world.add( new Location( 7, 8 ), alice );
        world.add( new Location( 5, 5 ), bob );
        world.show();
    }
}
