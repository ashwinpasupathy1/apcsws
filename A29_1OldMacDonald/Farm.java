import java.util.*;


/**
 * Tets all farm animals
 * 
 * @author apasupathy939
 * @version Oct 20, 2017
 * @author Period: 1
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources: none
 */
public class Farm
{
    private Animal[] a = new Animal[3];


    /**
     * Creates farm object putting different animals 
     * into the array
     */
    public Farm()
    {
        // a[0] = new Cow("cow","moo moo");
        a[0] = new NamedCow( "cow", "Elsie", "moo" );
        // a[1] = new Chick("chick","cluck cluck");
        a[1] = new Chick( "chick", "cluckity cluck", "cheep" );
        a[2] = new Pig( "pig", "oink oink" );
    }


    /**
     * Tests all animal sounds.
     */
    public void animalSounds()
    {
        for ( int i = 0; i < a.length; i++ )
        {
            System.out.println( a[i].getType() + 
                " goes " + a[i].getSound() );
        }
        NamedCow named = (NamedCow)a[0];
        System.out.println( named.getType() + 
            " is named " + named.getName() );
    }
}
