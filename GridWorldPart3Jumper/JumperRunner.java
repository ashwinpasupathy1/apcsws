import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Flower;

/**
 *  Creates jumper runner object and tests it.
 *
 *  @author  Ashwin Pasupathy
 *  @version 10/12/17
 *  @author  Period: 1
 *  @author  Assignment: GridWorld_Part3_Jumper
 *
 *  @author  Sources: Jason Gu, Gautam Kapoor
 */
public class JumperRunner
{
    /**
     * Tests jumper.
     * @param args is not used
     */
    public static void main( String[] args )
    {
        
        ActorWorld world = new ActorWorld();
        world.add( new Rock() );

        world.add( new Jumper() );
        Location loc = new Location( 3, 3 );
        world.add( loc, new Jumper() );
        world.show();
    }
}