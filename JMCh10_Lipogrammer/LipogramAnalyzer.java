/**
 * Finds occurence of singe letter and replaces it with another character
 * 
 * @author Ashwin Pasupathy
 * @version 9/29/17
 * 
 * @author Period - 1
 * @author Assignment - JMCh10 Lipogrammer
 * 
 * @author Sources - none
 */
public class LipogramAnalyzer
{
    private String text;

    private int prevEndPos = -1;


    /**
     * Constructor: Saves the text string
     * 
     * @param text
     *            String to analyze
     */
    public LipogramAnalyzer( String text )
    {
        this.text = text;
        // System.out.println(text);
    }


    /**
     * Returns the text string with all characters equal to letter replaced with
     * '#'.
     * 
     * @param letter
     *            character to replace
     * @return text string with all characters equal to letter replaced with '#'
     */
    public String mark( char letter )
    {
        return text.replace( letter, '#' );
    }


    /**
     * Returns a String that concatenates all "offending" words from text that
     * contain letter; the words are separated by '\n' characters; the returned
     * string does not contain duplicate words: each word occurs only once;
     * there are no punctuation or whitespace characters in the returned string.
     * 
     * @param letter
     *            character to find in text
     * @return String containing all words with letter
     */
    public String allWordsWith( char letter )
    {
        int n = 0;
        String result = "";
        String prev = "1";
        
        while ( n < text.length() )
        {

            if ( text.charAt( n ) == letter )
            {

                String s = extractWord( n );
                if ( !s.equals( "" )  && (!result.contains( " " + s + " " ) ))
                {
                    
                    result += " " + s + " " + "\n";
                    prev = result;
                }
                
            }
            
            
            n++;
        }
        result = result.replaceAll( " ", "" );
        return result;
    }


    // made public for test purposes
    /*
     * Returns the word that contains character at pos excluding any punctuation
     * or whitespace.
     * 
     * @param pos location of character
     * 
     * @return word that contains character at pos
     */
    public String extractWord( int pos )
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int startPos = 0, endPos = 0;
        for ( int i = pos; i > 0; i-- )
        {
            if ( i == 0 )
            {
                startPos = 0;
                break;
            }
            if ( letters.indexOf( text.charAt( i ) ) == -1 )
            {
                startPos = i;
                break;
            }

        }
        for ( int j = pos; j < text.length(); j++ )
        {
            if ( j == text.length() - 1 )
            {
                endPos = j + 1;
                break;
            }
            if ( letters.indexOf( text.charAt( j ) ) == -1 )
            {
                endPos = j;
                break;
            }
        }
        String s = text.substring( startPos, endPos );
        if ( letters.indexOf( s.trim().charAt( 0 ) ) == -1 )
        {
            return s.substring( 1 ).trim();
        }

        if ( letters.indexOf( s.charAt( s.length() - 1 ) ) == -1 )
        {
            return s.substring( 0, s.length() - 1 ).trim();
        }
        if ( prevEndPos == endPos )
        {
            return "";
        }

        prevEndPos = endPos;
        return s.trim();
    }
    public String removeRepeats(String s) 
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int startPos = 0;
        String newString = "";
        //s = s.replace( "/n", "" );
        //System.out.println(s);
        for(int i = 0; i < s.length(); i++) 
        {
            if( letters.indexOf( s.charAt( i )) == -1) 
            {
                String current = s.substring( startPos, i ).trim();
                
                
                //s.replace( s.substring( startPos - 1, i ), current );
                
                System.out.print(current + " ");
                
                
                
            }
            
        }
        //System.out.print(newString);
        return newString;
    }
}
