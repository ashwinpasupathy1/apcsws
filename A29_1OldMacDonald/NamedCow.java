/**
 * Cow that has a name
 * 
 * @author apasupathy939
 * @version Oct 20, 2017
 * @author Period: 1
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources: none
 */
class NamedCow extends Cow
{
    private String myName;


    /**
     * Creates namedCow
     * 
     * @param type
     *            type of cow
     * @param sound
     *            sound of cow
     */
    public NamedCow( String type, String sound )
    {
        super( type, sound );
    }


    /**
     * Creates namedCow
     * @param type type to make cow
     * @param name name to name cow
     * @param sound sound of cow
     */
    public NamedCow( String type, String name, String sound )
    {
        super( type, sound );
        myName = name;
    }


    /**
     * Gets and returns name.
     * @return myName name to return
     */
    public String getName()
    {
        return myName;
    }

}
