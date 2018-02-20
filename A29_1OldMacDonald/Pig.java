/**
 * Pig farm animal
 * 
 * @author apasupathy939
 * @version Oct 20, 2017
 * @author Period: 1
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources: none
 */
class Pig implements Animal
{

    private String myType;

    private String mySound;


    /**
     * Initializes a newly created Cow objec
     * t so that it represents an Animal of
     * the specified type that makes the specified sound.
     * 
     * @param type
     *            the type of Pig
     * @param sound
     *            the sound the Pig makes
     */
    public Pig( String type, String sound )
    {
        myType = type;
        mySound = sound;
    }


    /**
     * returns sound
     * 
     * @return mySound sound to return
     */
    public String getSound()
    {
        return mySound;
    }


    /**
     * returns type
     * 
     * @return myType type
     */
    public String getType()
    {
        return myType;
    }
}