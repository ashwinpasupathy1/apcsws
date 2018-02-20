import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */

public class RandomBugRunner
{
    /**
     * Creates a rock and multiple random bugs and adds it to the GridWorld
     * @param args is not used
     */
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Bug());
        //world.add(new Rock());
        world.add( new RandomBug(Color.BLACK) );
        world.add( new RandomBug(Color.YELLOW) );
        world.add( new RandomBug(Color.blue) );
        world.show();
    }
}
