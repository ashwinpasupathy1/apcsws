import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * Converts string of text into piglatin
 * 
 * @author Ashwin Pasupathy
 * @version 10/3/17
 * 
 * @author Period - 1
 * @author Assignment - PiglatinAnalyzer
 * 
 * @author Sources - none
 */
public class PiglatinAnalyzer
{
    private String text;


    // Constructor: saves the text string
    public PiglatinAnalyzer( String text )
    {
        this.text = text;
    }


    /**
     * Converts a string to it piglatin form according to the following rules:
     * a. If there are no vowels in englishWord, then pigLatinWord is just
     * englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o', and 'u',
     * and their uppercase counterparts.) b. Else, if englishWord begins with a
     * vowel, then pigLatinWord is just englishWord + "yay". c. Otherwise (if
     * englishWord has a vowel in it and yet doesn't start with a vowel), then
     * pigLatinWord is end + start + "ay", where end and start are defined as
     * follows: 1. Let start be all of englishWord up to (but not including) its
     * first vowel. 2. Let end be all of englishWord from its first vowel on. 3.
     * But, if englishWord is capitalized, then capitalize end and
     * "uncapitalize" start.
     *
     * @return piglatin version of text as a String
     */
    public String phraseToPigLatin()
    {
        String phraseToTranslate = text;
        String translation = "";
        String delims = "~!@#$%^&*()_+`, ./[]\\;\"'?<>-";
        StringTokenizer st = new StringTokenizer( phraseToTranslate, delims, true );

        while ( st.hasMoreTokens() )
        {
            String s = st.nextToken();
            
            
            //System.out.println(s);
            if(s.equals( "a" ) || s.equals( "e" )) 
            {
                translation += s;
            }
            else if(delims.contains( s )) 
            {
                translation += s;
            }
            else
            {
                translation += wordToPigLatin( s );
            }

        }

        return translation;
    }


    /**
     * Converts an "english" word to its piglatin form
     *
     * @param englishWord
     *            a string representing an english word
     * @return piglatin form of the english word
     */
    public String wordToPigLatin( String englishWord )
    {
        // String pigLatinWord = "";

        if ( hasVowel( englishWord ) == -1 )
        {
            return englishWord + "ay";

        }
        else if ( isVowel( englishWord.charAt( 0 ) ) )
        {
            return englishWord + "yay";
        }
        else
        {
            int startingPos = hasVowel( englishWord );
            String start = englishWord.substring( 0, startingPos );
            String end = englishWord.substring( startingPos );
            if ( isCapital( start.charAt( 0 ) ) )
            {
                return end.substring( 0, 1 ).toUpperCase() + end.substring( 1 )
                    + start.toLowerCase() + "ay";
            }
            else
            {
                return end + start + "ay";
            }
        }
        // return pigLatinWord;
    }


    public boolean isVowel( char a )
    {
        String vowels = "AEIOUaeiou";
        return vowels.indexOf( a ) != -1;
        
    }


    /**
     * Returns location of a vowel.
     * 
     * @param s
     *            string to check
     * @return index of vowel
     */
    public int hasVowel( String s )
    {
        for ( int i = 0; i < s.length(); i++ )
        {
            if ( isVowel( s.charAt( i ) ) )
            {
                return i;
            }
        }

        return -1;
    }


    /**
     * Tests if char is capital.
     * 
     * @param s
     *            letter to test
     * @return is capital
     */
    public boolean isCapital( char s )
    {
        String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        return capitals.indexOf( s ) != -1;

    }
    
   
    
    public static void main( String[] args )
    {
        PiglatinAnalyzer pla = new PiglatinAnalyzer("'I have never let my schooling interfere with my education. - Mark Twain");
        System.out.println( pla.phraseToPigLatin() );
    }
    
}
