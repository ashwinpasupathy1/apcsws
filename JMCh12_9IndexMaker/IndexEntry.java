import java.util.ArrayList;


/**
 * Index entry element with word and number
 *
 * @author apasupathy939
 * @version Oct 30, 2017
 * @author Period: 1
 * @author Assignment: JMCh12_9IndexMaker
 *
 * @author Sources: noen
 */
public class IndexEntry
{
    private ArrayList<Integer> list;

    private String word;


    // Constructs an IndexEntry for a given word
    // (converted to upper case); sets numsList
    // to an empty ArrayList.
    /**
     * Creates index entry
     * 
     * @param word
     *            word to set to
     */
    public IndexEntry( String word )
    {
        this.word = word.toUpperCase();
        list = new ArrayList<Integer>();
    }


    // Returns the word of this IndexEntry object.
    /**
     * Returns word.
     * 
     * @return word of IndexEntry
     */
    public String getWord()
    {
        return word; // Fix this!!
    }


    // If num is not already in the list, adds num
    // at the end of this IndexEntry's list
    // of numbers.
    /**
     * If num is not on list, add num to end.
     * 
     * @param num
     *            to add
     */
    public void add( int num )
    {
        Integer e = num;
        if ( !list.contains( e ) )
        {
            list.add( e );
        }
    }


    // Converts this IndexEntry into a string in the
    // following format: the word followed by a space, followed by
    // numbers separated by a comma and a space.
    /**
     * Returns string of object
     */
    public String toString()
    {
        String text = word + " ";
        for ( int i = 0; i < list.size() - 1; i++ )
        {
            text += ( list.get( i ) + ", " );
        }
        return text + list.get( list.size() - 1 );
    }

}
