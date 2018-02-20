import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

/**
 * This creates an unbounded grid with one spiral bug.

   @author  Ashwin Pasupathy
   @version 8/25/17

   @author  Period - 1
   @author  Assignment - GridWorld Part 2, Exercise 2 - SpiralBugRunner

   @author  Sources - none
 */
public class SpiralBugRunner
{
    /**
     * This method creates a spiral bug and unbounded grid.
     * @param args
     */
    public static void main( String[] args )
    {
        UnboundedGrid grid = new UnboundedGrid<Actor>();
        ActorWorld world = new ActorWorld( grid );
        
        SpiralBug alice = new SpiralBug( 2 );
        alice.setColor( Color.ORANGE );
        //CircleBug bob = new CircleBug( 3 );
        world.add( new Location( 10, 20 ), alice );
        //world.add( new Location( 5, 5 ), bob );
        world.show();

    }
}