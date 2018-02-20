import java.util.*;


/**
 * Document index class which extends ArrayList of IndexEntry *
 * 
 * @author apasupathy939
 * @version Oct 30, 2017
 * @author Period: 1
 * @author Assignment: JMCh12_9IndexMaker
 *
 * @author Sources: none
 */
public class DocumentIndex extends ArrayList<IndexEntry>
{

    // Creates an empty DocumentIndex with the default
    // initial capacity.
    /**
     * Creates an empty DocumentIndex with the 
     * default initial capacity.
     */
    public DocumentIndex()
    {
        super();
    }


    // Creates an empty DocumentIndex with a given
    // initial capacity.
    /**
     * Creates an empty DocumentIndex
     * 
     * @param initialCapacity
     *            creates ArrayList with initial capacity
     */
    public DocumentIndex( int initialCapacity )
    {
        super( initialCapacity );
    }


    // If word is not yet in this DocumentIndex,
    // creates a new IndexEntry for word, and inserts
    // it into this list in alphabetical order;
    // adds num to this word's IndexEntry by calling
    // its add(num) method.
    /**
     * Adds word into document index.
     * @param word word to add
     * @param num line number
     */
    public void addWord( String word, int num )
    {
        int index = foundOrInserted( word );
        // System.out.println(index);
        this.get( index ).add( num );

    }


    // For each word in str, calls addWord(word, num).
    /**
     * Adds all words in line.
     * @param str line to check
     * @param num line number
     */
    public void addAllWords( String str, int num )
    {
        if ( str.equals( "" ) )
        {
            return;
        }
        String[] words = str.split( "\\W+" );
        for ( String i : words )
        {
            if ( i != null || i.equals( "" ) )
            {
                addWord( i, num );
            }
        }
    }


    // Tries to find an EndexEntry with a given word in this
    // DocumentIndex. If not found, inserts a new EndexEntry for
    // word at the appropriate place (in lexicographical order).
    // Returns the index of the found or inserted IndexEntry
    /**
    Tries to find an EndexEntry with a given word in this
    // DocumentIndex. If not found, inserts a new EndexEntry for
    // word at the appropriate place (in lexicographical order).
    // Returns the index of the found or inserted IndexEntry     
     * @param word word to insert
     * @return index of word
     */
    private int foundOrInserted( String word )
    {
        for ( int i = 0; i < this.size(); i++ )
        {
            if ( this.get( i ).getWord().equalsIgnoreCase
                            ( word ) )
            {
                return i;
            }
        }
        for ( int i = 0; i < this.size(); i++ )
        {
            if ( this.get( i ).getWord().compareToIgnoreCase
                            ( word ) >= 0 )
            {
                this.add( i, new IndexEntry( word ) );
                return i;
            }
        }
        this.add( new IndexEntry( word ) );
        return this.size() - 1;
    }

}
