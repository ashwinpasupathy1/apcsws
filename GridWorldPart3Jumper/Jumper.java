import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;


/**
 * A <code>Jumper</code> is an actor that will
 *  jump over Rocks and Flowers and
 * turn. A jumper can remove another j
 * umper by jumping on them.
 * 
 * @author Ashwin Pasupathy Jason Gu Gautam Kapoor
 * @version 10/12
 * @author Period: 1
 * @author Assignment: GridWorld_Part3_Jumper
 * 
 * @author Sources: Ashwin Pasupathy Jason Gu Gautam Kapoor
 */
public class Jumper extends Bug implements Edible
{
    /**
     * Creates jumper object
     */
    public Jumper()
    {
        setColor( Color.yellow );
    }



    //public Jumper( Color color )
    //{
    //    setColor( color );
    //}


    /** 
     * 
     * Moves jumper
     */
    public void move()
    {

        Location loc = getLocation();
        Location firstNext = 
                        loc.getAdjacentLocation( getDirection() );
        Location next = 
                        firstNext.getAdjacentLocation( getDirection() );

        moveTo( next );

    }


    /** 
     * 
     * Sees if can move
     * @return whether object can move
     */
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if ( gr == null ) 
        {
            return false;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation( getDirection() );
        Location after = next.getAdjacentLocation( getDirection() );
        if ( !gr.isValid( after ) )
        {    
            return false;
        }
        
        Actor neighbor = gr.get( after );
        if ( neighbor instanceof Edible )
        {
            return true;
        }
        else
        {
            return neighbor == null;
        }
    }
}