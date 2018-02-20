/**
 * Creates chick object
 *
 * @author apasupathy939
 * @version Oct 20, 2017
 * @author Period: 1
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources: 1
 */
class Chick implements Animal
{

    private String myType;

    private String mySound;

    private String mySound2;


    /**
     * Initializes a newly created Cow obje ct so that
     *  it represents an Animal
     * of the specified type that makes the specified sound.
     * 
     * @param type
     *            the type of Chick
     * @param sound
     *            the sound the Chick makes
     * @param sound2
     *            the second sound of the Chick
     */
    public Chick( String type, String sound, String sound2 )
    {
        myType = type;
        mySound = sound;
        mySound2 = sound2;
    }


    /**
     * Initializes a newly created Cow obje ct 
     * so that it represents an Animal
     * of the specified type that makes the specified sound.
     * 
     * @param type
     *            the type of Chick
     * @param sound
     *            the sound the Chick makes
     */
    public Chick( String type, String sound )

    {
        myType = type;
        mySound = sound;
    }


    /**
     * returns two sounds with equal probability of each
     * 
     * @return mySound teh sound to return
     */
    public String getSound()
    {
        if ( Math.random() > 0.5 )
        {
            return mySound;
        }
        return mySound2;
    }


    /**
     * gets type
     * 
     * @return myType the type
     */
    public String getType()
    {
        return myType;
    }
}