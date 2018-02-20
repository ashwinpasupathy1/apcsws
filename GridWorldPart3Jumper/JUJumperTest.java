import info.gridworld.actor.*;
import info.gridworld.grid.*;

import org.junit.*;
import static org.junit.Assert.*;


/**
 * Jumper tests:. test01 - 
 * jumper next to edge of grid - should turn test02 -
 * jumper 2 from edge of grid 
 * - should turn test03 - jumper 2 from rock or
 * flower - should turn test04
 *  - jumper 1 from block but 2 from empty space -
 * should move test05 - jumper
 *  1 from block but 2 from empty space - should move
 * test06 - jumper 2 from empt
 * y space - should move test07 - jumper 2 from actor
 * - should move and eat actor
 *
 * @author Ashwin Pasupathy Gautam Kapoor Jason Gu
 * @version 10/12/17
 *
 * @author Period: 1
 * @author Assignment - GridWorld Part 3 Jumper
 *
 * @author Sources: Ashwin Pasupathy Gautam Kapoor Jason Gu
 */
public class JUJumperTest
{

    /*
     * Variables used by the test methods.
     */
    private Grid<Actor> grid;

    private ActorWorld world;

    private Jumper jumper1;


    /**
     * Invoked before each test to 
     * instantiate the objects used for every test.
     */
    @Before
    public void initialize()
    {
        grid = new BoundedGrid<Actor>( 8, 8 );
        world = new ActorWorld( grid );
        jumper1 = new Jumper();
    }


    /**
     * test01 - jumper next to edge of grid - should turn
     */
    @Test
    public void 
    jumperNextToEdgeOfGridShouldTurn()
    {
        Location loc = new Location( 0, 3 );
        world.add( loc, jumper1 );
        jumper1.act();

        assertTrue( testOccupied( loc, jumper1, 
            Location.NORTHEAST ) );
    }


    /**
     * test02 - jumper 2 from edge of grid - should turn.
     */
    @Test
    public void 
    jumper2FromEdgeOfGridShouldTurn()
    {
        Location loc = new Location( 1, 3 );
        world.add( loc, jumper1 );
        jumper1.act();

        assertTrue( testOccupied( 
            loc, jumper1, Location.NORTHEAST ) );
    }


    /**
     * test03 - jumper 2 from rock or flower - should turn
     */
    @Test
    public void 
    jumper2FromRockOrFlowerShouldTurn()
    {
        Location loc = new Location( 1, 5 );
        world.add( loc, jumper1 );
        world.add( new Location( 1, 3 ), new Rock() );
        jumper1.act();

        assertTrue( testOccupied( 
            loc, jumper1, Location.NORTHEAST ) );
    }


    /**
     * test04 - jumper 2 from another actor - should turn
     */
    @Test
    public void 
    jumper2FromAnotherActorShouldTurn()
    {
        Location loc = new Location( 3, 3 );
        world.add( loc, jumper1 );
        world.add( new Location( 1, 3 ), new Actor() );
        jumper1.act();

        assertTrue( testOccupied( 
            loc, jumper1, Location.NORTHEAST ) );
    }


    /**
     * test05 - jumper 1 from block but 2 from empty 
     * space - should move
     */
    @Test
    public void 
    jumper1FromBlockBut2FromEmptySpaceShouldTurn()
    {
        Location loc = new Location( 4, 4 );
        Location l = new Location( 3, 4 );
        world.add( loc, jumper1 );
        world.add( l, new Rock() );
        jumper1.act();

        assertTrue( testOccupied( new 
            Location( 2, 4 ), jumper1, Location.NORTH ) );
    }


    /**
     * jumper 2 from empty space - should move
     */
    @Test
    public void jumper2FromEmptySpaceShouldMove()
    {
        Location loc = new Location( 3, 3 );
        world.add( loc, jumper1 );
        jumper1.act();

        assertTrue( testOccupied( new 
            Location( 1, 3 ), jumper1, Location.NORTH ) );
    }


    /**
     * jumper 2 from actor - should move and eat actor
     */
    @Test
    public void jumper2FromActorShouldMove()
    {
        Location loc = new Location( 3, 3 );
        world.add( loc, jumper1 );
        world.add( new Location( 3, 5 ), new Jumper() );
        jumper1.turn();
        jumper1.turn();

        jumper1.act();

        assertTrue( testOccupied( new Location( 3, 5 ), 
            jumper1, Location.EAST ) && testEmpty( new Location(1, 5)) );

    }


    /**
     * Test helper method to test for empty location.
     *
     * @param loc
     *            null location if empty
     * @return true if all assertions pass
     */
    private boolean testEmpty( Location loc )
    {
        Actor empty = grid.get( loc );
        assertNull( "<<<<< " + loc + 
            " should be empty. >>>>>", empty );

        return true;
    }


    /**
     * Test helper method to test that objec
     * t is in a location, and has a
     * consistent loc, and direction dir.
     *
     * @param loc
     *            location that should be occupied
     * @param a
     *            actor that should be in location loc
     * @param dir
     *            direction this actor should be facing
     * @return true if all assertions pass
     */
    private boolean testOccupied( Location loc, Actor a, int dir )
    {
        Actor found = grid.get( loc );
        assertSame( "<<<<< " + loc + 
            " should contain the actor. >>>>>", a, found );
        assertEquals( "<<<<< Loc should be " + loc
            + " >>>>>", loc, found.getLocation() );
        assertEquals( "<<<<< Dir should be " +
            dir + " >>>>>", dir, found.getDirection() );

        return true;
    }
}