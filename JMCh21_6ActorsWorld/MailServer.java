import java.util.*;


/**
 * Sends and recieves mail
 * 
 * @author Ashwin Pasupathy
 * @version 1/16/18
 * 
 * @author Period - 1
 * @author Assignment - MailServer
 * 
 * @author Sources - none
 */
public class MailServer extends LinkedList<Message>
{
    private Set<Actor> actors;


    // for testing purposes only
    protected Set<Actor> getActors()
    {
        return actors;
    }


    public MailServer()
    {
        actors = new TreeSet<Actor>();
    }


    public void signUp( Actor actor )
    {
        if ( actor != null )
            actors.add( actor );
    }


    public void dispatch( Message msg )
    {
        if ( msg.getRecipient() != null )
        {
            msg.getRecipient().receive( msg );
            return;
        }
        Iterator<Actor> iter = actors.iterator();
        while ( iter.hasNext() )
        {
            Actor a = iter.next();
            if ( a.equals( msg.getSender() ) )
            {
                continue;
            }
            a.receive( msg );
        }
        System.out.println();
    }
}
