import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

import java.awt.Color;


/**
 * Erases object from GridWorld
 *
 * @author Ashwin Pasupathy
 * @version 11/7/17
 * @author Period: 1
 * @author Assignment: AB24_1EraseObject_GridWorld
 *
 * @author Sources: none
 */
public class EraseObject extends World<Tile>
{
    private static final Color IMGOBJ_COLOR = Color.BLACK;

    private static final Color ERASE_COLOR = Color.WHITE;


    /**
     * Constructs a default 20x20 grid containing black tiles a t 
     * the locations
     * given in the file "digital.txt".
     */
    public EraseObject()
    {
        this( new BoundedGrid<Tile>( 20, 20 ), "digital.txt" );
    }


    /**
     * Constructs an EraseObject World with the provided grid.
     *  Populates the
     * world with black tile objects at the locations given in 
     * the specified
     * file (fName).
     * 
     * @param bg
     *            bounded grid used by this World
     * @param fName
     *            name of file containing location information
     *             for tile
     *            placement in this World
     */
    public EraseObject( BoundedGrid<Tile> bg, String fName )
    {
        setGrid( bg );
        getData( fName );

        setMessage( "Click on the object to be erased" );
    }


    /**
     * Overrides <code>info.gridworld.world.World&lt;Tile&lt;
     * .location
     * Clicked</code> This method is called when the user clicks
     *  on a location
     * in t he WorldFrame. Invokes the recursive erase procedure 
     * on the clicked
     * l ocation.
     * 
     * @param loc
     *            the grid location that the user selected
     * @return true - the world consumes the click
     */
    public boolean locationClicked( Location loc )
    {
        Grid<Tile> gr = getGrid();

        setMessage( "Tile clicked at " + loc );
        erase( gr, loc.getRow(), loc.getCol() );

        return true;
    }


    /**
     * Loads the data from the specified file containing tile 
     * locations into the
     * this grid.
     * 
     * The first entry in the provided text file is the number
     *  of pairs that
     * follow (i.e., 55). Each subsequent line contains a pair
     *  of integers,
     * separated by a blank space. Each pair is a row and colu mn
     * 
     *  coordinate
     * that specifies the location of a black tile in the
     *  starting grid.
     * 
     * @param fName
     *            name of file containing tile locations
     */
    private void getData( String fName )
    {

        try
        {
            Scanner in = new Scanner( new File( fName ) );
            int numberOfTests = in.nextInt();
            while ( in.hasNext() )
            {
                Tile tile = new Tile( IMGOBJ_COLOR );
                Location loc = new Location( in.nextInt(), 
                    in.nextInt() );
                this.getGrid().put( loc, tile );
            }
            in.close();
        }
        catch ( IOException e )
        {
            System.out.println( "Error: " + e.getMessage() );
        }
    }


    /**
     * Recursively changes the color of a series of adjacen
     * t tiles (erases)
     * starting at the given coordinates if this coordinate
     *  is part of the
     * object. The method should erase the entire object
     *  (remove black).
     *
     * @param gr
     *            grid containing sequences of adjacent tiles
     * @param row
     *            row coordinate to begin erasure
     * @param col
     *            column coordinate to begin erasure
     */
    private void erase( Grid<Tile> gr, int row, int col )
    {
        int maxCol = gr.getNumCols();
        int maxRow = gr.getNumRows();
        Location loc = new Location( row, col );
        if ( !gr.isValid( loc ) || gr.get( loc ) == null )
        {
            return;
        }
        Tile tile = gr.get( new Location( row, col ) );

        if ( 1 <= row && row <= maxRow && 1 <= col && col <= maxCol )
        {
            // boundary check, if false, a base case
            if ( IMGOBJ_COLOR.equals( tile.getColor() ) )
            {
                // if false, base case
                tile.setColor( ERASE_COLOR );
                if ( 0 == row || maxRow == row || 0 == col 
                                || maxCol == col )
                {
                    // printMaze(mazeCopy); // base case
                }
                else
                {
                    erase( gr, row - 1, col );
                    erase( gr, row, col + 1 );
                    erase( gr, row + 1, col );
                    erase( gr, row, col - 1 );
                }
            }
        }
    }


    public static void main( String[] args )
    {
        new EraseObject().show();
    }
}
