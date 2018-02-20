import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.ArrayList;

import java.awt.Color;


/**
 * Creates critter that darkens when next to a certain amount an d lightents
 * next to a certain amount *
 * 
 * @author Ashwin Pasupathy
 * @version 11/6/17
 * @author Period: 1
 * @author Assignment: BlusterCritter - GridWorld Part4 Exercise 4
 *
 * @author Sources:
 */
public class BlusterCritter extends Critter
{
    private static final double DARKENING_FACTOR = 0.05;

    private int critters;


    public BlusterCritter( int c )
    {
        critters = c;
        this.setColor( Color.BLUE );
    }


    /**
     * Gets all of the actors that it should have <br />
     * Postcondition: The state of all actors is unchanged.
     * 
     * @return a list of actors that this critter wishes to process.
     */
    public ArrayList<Actor> getActors()
    {
        Grid<Actor> gr = getGrid();
        ArrayList<Actor> actors = new ArrayList<Actor>();
        Location loc = this.getLocation();
        Location l;
        for ( int i = loc.getRow() - 2; i < loc.getRow() + 3; i++ )
        {
            for ( int j = loc.getCol() - 2; j < loc.getCol() + 3; j++ )
            {
                if ( gr.isValid( new Location( i, j ) ) )
                {
                    l = new Location( i, j );

                    if ( gr.get( l ) instanceof Critter && !( 
                                    loc.getCol() == j && loc.getRow() == i ))
                    {
                        
                        actors.add( gr.get( l ) );
                    }

                }

            }
        }

        return actors;
    }


    /**
     * Processes all actors in array <br />
     * Postcondition: (1) The state of all actors in the grid other than this
     * critter and the elements of <code>actors</code> is unch anged. (2) The
     * location of this critter is unchanged.
     * 
     * @param actors
     *            the actors to be processed
     */
    public void processActors( ArrayList<Actor> actors )
    {
        if ( actors.size() > critters )
        {
            darken();
        }
        else if ( actors.size() < critters )
        {
            lighten();
        }
    }


    /**
     * Darkens critter
     */
    private void darken()
    {

        Color c = getColor();
        int red = (int)( c.getRed() * ( 1 - DARKENING_FACTOR ) );
        int green = (int)( c.getGreen() * ( 1 - DARKENING_FACTOR ) );
        int blue = (int)( c.getBlue() * ( 1 - DARKENING_FACTOR ) );

        setColor( new Color( red, green, blue ) );
    }


    /**
     * Lightens critter
     */
    private void lighten()
    {

        Color c = getColor();
        int red = c.getRed();
        int blue = c.getBlue();
        int green = c.getGreen();
        if ( red < 242 )
        {
            red = 1 + (int)( c.getRed() * ( 1 + DARKENING_FACTOR ) );
        }
        else if ( red < 255 )
        {
            red++;
        }
        if ( c.getBlue() < 242 )
        {
            blue = 1 + (int)( c.getBlue() * ( 1 + DARKENING_FACTOR ) );
        }
        else if ( blue < 255 )
        {
            blue++;
        }
        if ( c.getGreen() < 242 )
        {
            green = 1 + (int)( c.getGreen() * ( 1 + DARKENING_FACTOR ) );
        }
        else if ( green < 255 )
        {
            green++;
        }
        setColor( new Color( red, green, blue ) );

    }
}
