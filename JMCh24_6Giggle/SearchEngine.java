import java.util.*;


/**
 * Creates a search engine *
 * 
 * @author Ashwin Pasupathy
 * @version 2/9/18
 * 
 * @author Period - 1
 * @author Assignment - JM24.6 - Search Engine
 * 
 * @author Sources - none
 */
public class SearchEngine
{
    // Instance variable(s)
    private String myURL; // holds the name for the "url" (file name)

    private Map<String, List<String>> myIndex; // holds the word index


    // Constructor(s)
    public SearchEngine( String url )
    {
        myURL = url;
        myIndex = new HashMap<String, List<String>>( 20000 );

    }


    public String getURL()
    {
        return myURL;
    }


    public void add( String line )
    {
        Set<String> words = parseWords( line );
        for ( String word : words )
        {
            if ( !myIndex.containsKey( word ) )
            {
                myIndex.put( word, new LinkedList<String>() );
            }
            myIndex.get( word ).add( line );
        }

    }


    public List<String> getHits( String word )
    {
        return myIndex.get( word );

    }


    private Set<String> parseWords( String line )
    {
        String[] lines = line.split( "\\W+" );
        Set<String> words = new TreeSet<String>();
        for ( String s : lines )
        {
            if ( !s.equals( " " ) )
            {
                words.add( s.toLowerCase() );
            }
        }

        return words;
    }


    // *************************************************************
    // For test purposes only
    // not to be used in solution implementation
    public Map<String, List<String>> getIndex()
    {
        return myIndex;
    }
}
