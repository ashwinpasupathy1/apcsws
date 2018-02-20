/**
 * Finds if black won game
 * 
 * @author Ashwin Pasupathy
 * @version 1/11/18
 * 
 * @author Period - 1
 * @author Assignment - JM Ch22.6 - Hex
 * 
 * @author Sources -
 */
public class HexBoard extends CharMatrix
{
    
    private boolean won = false;
    
    public HexBoard( int rows, int cols )
    {
        super( rows, cols );
    }


    public boolean isBlack( int r, int c )
    {

        return this.charAt( r, c ) == 'b' && isInBounds( r, c ); // fix
                                                                         // this
    }


    public boolean isWhite( int r, int c )
    {
        return this.charAt( r, c ) == 'w'  && isInBounds( r, c );
    }


    public boolean isGray( int r, int c )
    {
        return this.charAt( r, c ) == 'x' && isInBounds( r, c );
    }


    public void setBlack( int r, int c )
    {
        setCharAt( r, c, 'b' );
    }


    public void setWhite( int r, int c )
    {
        setCharAt( r, c, 'w' );
    }


    public void setGray( int r, int c )
    {
        setCharAt( r, c, 'x' );
    }


    /**
     * Returns true if there is a contiguous chain of black stones that starts
     * in col 0 and ends in the last column of the board; otherwise returns
     * false.
     */
    public boolean blackHasWon()
    {
        for ( int i = 0; i < this.numRows(); i++ )
        {
            {
                areaFill( i, 0 );
            }
        }
        int count = 0;
        for ( int i = 0; i < this.numRows(); i++ )
        {
            if( isGray( i, numCols() - 1))
            {
                count++;
            }
        }
        for ( int i = 0; i < this.numRows(); i++ )
        {
            for ( int j = 0; j < this.numCols(); j++ )
            {
                if ( isGray( i, j ) )
                {
                    setBlack( i, j );
                    
                }
            }
        }
        boolean temp = won;
        won = false;
        return count > 0;
        //return won; // fix this
    }


    /**
     * Fills the contiguous area that contains r,c with gray color. Does nothing
     * if r, c is out of bounds or is not black.
     */
    public void areaFill( int r, int c )
    {
        if ( !isInBounds( r, c ) || !isBlack( r, c ))
        {
            return;
        }
        if( c == numCols() - 1 && isInBounds( r, c ) && isBlack(r , c)) 
        {
            this.setGray( r, c );
            won = true;
            return;
        }
        
        this.setGray( r, c );
        //if( !won ) 
        {       
            areaFill( r - 1, c - 1);
        }
        //if( !won ) 
        {
            areaFill( r - 1, c );
        }
        //if( !won ) 
        {
            areaFill( r , c - 1 );
        }
        //if( !won ) 
        {
            areaFill( r, c + 1 );
        }
        //if( !won ) 
        {
            areaFill( r + 1, c );
        }
        //if( !won ) 
        {
            areaFill( r + 1, c + 1);
        }

    }


    public String toString()
    {
        String s = "";

        for ( int r = 0; r < numRows(); r++ )
        {
            for ( int c = 0; c < numCols(); c++ )
            {
                if ( isBlack( r, c ) )
                    s += 'B';
                else if ( isWhite( r, c ) )
                    s += 'W';
                else if ( isGray( r, c ) )
                    s += 'X';
                else
                    s += '.';
            }
            s += '\n';
        }
        return s;
    }


    // ****************************************************************

    private boolean isInBounds( int row, int col )
    {
        return row >= 0 && row < this.numRows() && col >= 0 && col < this.numCols(); // fix
                                                                                     // this
    }
}
