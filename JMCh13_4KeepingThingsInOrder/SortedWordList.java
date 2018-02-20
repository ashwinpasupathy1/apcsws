/**
 * Implements a sorted list of words
 * 
 * @author Ashwin Pasupathy
 * @version 11/13/17
 * 
 * @author Period - 1
 * @author Assignment - Java Methods 13.4 Lab: Keeping Things in Order
 * 
 * @author Sources - none
 */
public class SortedWordList extends java.util.ArrayList<String>
{
    /**
     * Creates sorted word
     * 
     * @param size
     *            size of words
     */
    public SortedWordList( int size )
    {
        super( size );
    }


    /**
     * Default constructor
     */
    public SortedWordList()
    {
        super();
    }


    /**
     * Finds location of string DONE.
     * 
     * @param s
     *            string to find
     * @return index of string
     */
    public int indexOf( String s )
    {
        int low = 0;
        int high = this.size() - 1;

        while ( low <= high )
        {
            int mid = ( low + high ) / 2;
            if ( s.compareToIgnoreCase( this.get( mid ) ) == 0 )
            {

                return mid;
            }
            else if ( s.compareToIgnoreCase( this.get( mid ) ) < 0 )
            {
                high = mid - 1;

            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }


    /**
     * whether or not it contains the given string. DONE
     * 
     * @param s
     *            string to check
     * @return condition
     */
    public boolean contains( String s )
    {
        return indexOf( s ) >= 0;
    }


    /**
     * adds word
     * 
     * @param word
     *            java.util.ArrayList#add(java.lang.Object)
     * @return whether the word could be added
     */
    public boolean add( String word )
    {
        int low = 0;
        int high = this.size() - 1;
        int mid = 0;
        int position = this.size();
        while ( low <= high )
        {
            mid = ( low + high ) / 2;
            if ( word.compareTo( this.get( mid ) ) == 0 )
            {
                return false;
            }
            if ( word.compareTo( this.get( mid ) ) < 0 )
            {

                high = mid - 1;
            }
            else if ( word.compareTo( this.get( mid ) ) > 0 )
            {

                low = mid + 1;
                position = low;
            }

        }

        super.add( position, word );
        return true;
    }


    /**
     * (non-Javadoc)
     * 
     * @see java.util.ArrayList#add(int, java.lang.Object)
     */
    public void add( int index, String word )
    {
        if ( index == 0 )
        {
            if ( word.compareTo( this.get( index ) ) < 0 )
            {
                super.add( index, word );
                return;
            }
        }
        else if ( index == this.size() )
        {
            if ( word.compareTo( this.get( index - 1 ) ) > 0 )
            {
                super.add( index, word );
                return;
            }
        }
        else if ( index < this.size() && word.compareTo( this.get( index ) ) < 0
            && word.compareTo( this.get( index - 1 ) ) > 0 )
        {
            super.add( index, word );
        }
        else
        {
            throw new IllegalArgumentException( "word =" + word + " i =" + index );
        }
    }


    /**
     * Merges and sorts two array lists.
     * 
     * @param names2
     */
    public void merge( SortedWordList names2 )
    {
        if ( names2.size() == 0 )
        {
            return;
        }
        int N = names2.size();
        int thisSize = this.size();
        for ( int i = 0; i < N; i++ )
        {
            super.add( "" );

        }
        int j = thisSize - 1;
        int k = N - 1;
        for ( int i = this.size() - 1; i >= 0; i-- )
        {
            if ( j == -1 )
            {
                super.set( i, names2.get( k ) );
                k--;
                continue;
            }
            else if ( k == -1 )
            {
                super.set( i, this.get( j ) );
                j--;
                continue;
            }
            String thisString = this.get( j );
            String other = names2.get( k );
            if ( thisString.compareTo( other ) > 0 )
            {
                super.set( i, thisString );
                j--;

            }
            else if ( thisString.compareTo( other ) < 0 )
            {
                super.set( i, other );
                k--;
            }
            else
            {
                super.set( i, other );
                j--;
            }

        }
        String prev = this.get( 0 );
        for ( int i = 1; i < this.size(); i++ )
        {
            if ( prev.equals( this.get( i ) ) )
            {
                super.remove( i );
                i--;
            }
            prev = this.get( i );
        }
    }


    /**
     * (non-Javadoc)
     * 
     * @param i
     *            java.util.ArrayList#set(int, java.lang.Object)
     * @param s
     *            string to set
     * @return string of previous
     */
    public String set( int i, String s )
    {
        if ( i == 0 )
        {

            if ( s.compareTo( this.get( i + 1 ) ) < 0 )
            {

                String temp = this.get( i );
                super.set( i, s );
                return temp;
            }
            else
            {
                throw new IllegalArgumentException( "word =" + s + " i =" + i );
            }
        }
        if ( i == this.size() - 1 )
        {
            if ( s.compareTo( this.get( i - 1 ) ) > 0 )
            {
                String temp = this.get( i );
                super.set( i, s );
                return temp;
            }
            else
            {
                throw new IllegalArgumentException( "word =" + s + " i =" + i );
            }
        }
        if ( s.compareTo( this.get( i - 1 ) ) > 0 && s.compareTo( this.get( i + 1 ) ) < 0 )
        {
            String temp = this.get( i );
            super.set( i, s );
            return temp;
        }
        else
        {
            throw new IllegalArgumentException( "word =" + s + " i =" + i );
        }
    }

}
