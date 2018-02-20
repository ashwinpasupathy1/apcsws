import java.util.Iterator;


/**
 * Implements a singly-linked list.
 * 
 * @author Ashwin pasupathy
 * @version 11/30/17
 * 
 * @author Period - 1
 * @author Assignment - SinglyLinkedList
 * 
 * @author Sources - Maria & Gary Litvin
 */
public class SinglyLinkedList<E> implements Iterable<E>
{
    private ListNode<E> head;

    private int nodeCount;


    // Constructor: creates an empty list
    public SinglyLinkedList()
    {
        head = null;
        nodeCount = 0;
    }


    /**
     * Constructor: creates a list that contains all 
     * elements from the array
     * values, in the same order
     * 
     * @param values
     *            array containing all elements for this 
     *            list
     */
    public SinglyLinkedList( E[] values )
    {
        ListNode<E> tail = null;
        for ( E value : values ) // for each value to insert
        {
            ListNode<E> node = new ListNode<E>( value, null );
            if ( head == null )
                head = node;
            else
                
                tail.setNext( node );
            tail = node; // update tail
        }

        nodeCount = values.length;
    }


    /**
     * Return true if this list is empty; otherwise returns
     *  false.
     * 
     * @return true if this list is empty; otherwise return
     * s false.
     */
    public boolean isEmpty()
    {
        return head == null;
    }


    /**
     * Returns the number of elements in this list.
     * 
     * @return number of elements in this list.
     */
    public int size()
    {
        return nodeCount;
    }


    /**
     * Returns true if this list contains an Object equal to
     *  obj; otherwise
     * returns false.
     * 
     * @return true if this list contains an Object equal to
     *  obj
     */
    public boolean contains( Object obj )
    {
        return indexOf( obj ) != -1; // fix this
    }


    /**
     * Returns the index of the first Object equal to obj; if
     *  not found, returns
     * -1.
     * 
     * @param obj
     *            Object to find
     * @return the index of the first Object in equal to obj; 
     * if not found,
     *         returns -1.
     */
    public int indexOf( Object obj )
    {
        ListNode<E> nextNode = head;
        int count = 0;

        while ( nextNode != null )
        {

            if ( nextNode.getValue().equals( obj ) )
            {
                return count;
            }
            nextNode = nextNode.getNext();
            count++;
        }
        return -1;
    }


    /**
     * Adds obj to this collection. Returns true if successful
     * ; otherwise
     * returns false.
     * 
     * @param obj
     *            element to add to this collection
     * @return true if successful; otherwise returns false.
     */
    public boolean add( E obj )
    {
        if ( head == null )
        {
            head = new ListNode<E>( obj, null );
            nodeCount++;
            return true;
        }
        ListNode<E> nextNode = head;
        while ( nextNode.getNext() != null )
        {
            nextNode = nextNode.getNext();
        }
        nextNode.setNext( new ListNode<E>( obj, null ) );
        nodeCount++;
        if ( nextNode.getNext().getValue().equals( obj ) )
        {
            return true;
        }
        return false; // fix this
    }


    /**
     * Removes the first element that is equal to obj, if any. 
     * Returns true if
     * successful; otherwise returns false.
     * 
     * 
     * @param obj
     *            element to remove
     * @return true if successful; otherwise returns false.
     */
    public boolean remove( E obj )
    {
        if ( head == null )
        {
            return false;
        }

        ListNode<E> nextNode = head.getNext();

        while ( nextNode != null )
        {
            if ( nextNode.getNext().getValue().equals( obj ) )
            {
                nodeCount--;
                nextNode.setNext( nextNode.getNext().getNext() );
                return true;
            }
            nextNode = nextNode.getNext();
        }
        return false;

    }


    /**
     * Returns the i-th element.
     * 
     * @param i
     *            element to get from the list
     * @return element at index i
     * @throws IndexOutOfBoundsException
     */
    public E get( int i )
    {
        if ( i >= nodeCount || i < 0 )
        {
            throw new IndexOutOfBoundsException();
        }
        ListNode<E> nextNode = head;
        for ( int j = 0; j < i; j++ )
        {
            nextNode = nextNode.getNext();
        }

        return nextNode.getValue();

    }


    /**
     * Replaces the i-th element with obj and returns the old 
     * value.
     * 
     * @param i
     *            index of element to replace
     * @param obj
     *            replacement element of element at index i
     * @return old value previously located at index i
     * @throws IndexOutOfBoundsException
     */
    public E set( int i, E obj )
    {
        if ( i >= nodeCount || i < 0 )
        {
            throw new IndexOutOfBoundsException();
        }
        ListNode<E> nextNode = head;
        for ( int j = 0; j < i; j++ )
        {
            nextNode = nextNode.getNext();
        }
        E object = nextNode.getValue();
        nextNode.setValue( obj );
        return object;
    }


    /**
     * Inserts obj to become the i-th element. Increments the 
     * size of the list
     * by one.
     * 
     * @param i
     *            insertion point in list for obj
     * @param obj
     *            element to insert into list
     * @throws IndexOutOfBoundsException
     */
    public void add( int i, E obj )
    {
        if ( i == 0 )
        {
            ListNode<E> next = head;
            head = new ListNode<E>( obj, next );
        }
        else if ( i >= nodeCount || i < 0 )
        {
            throw new IndexOutOfBoundsException();
        }

        ListNode<E> nextNode = head;

        for ( int j = 0; j < i - 1; j++ )
        {
            nextNode = nextNode.getNext();
        }
        ListNode<E> next = nextNode.getNext();
        nextNode.setNext( new ListNode<E>( obj, next ) );
        nodeCount++;
    }


    /**
     * Removes the i-th element and returns its value. 
     * Decrements the size of
     * the list by one.
     * 
     * @param i
     *            index of element to remove
     * @return element removed from this list
     */
    public E remove( int i )
    {

        if ( i >= nodeCount || i < 0 )
        {
            throw new IndexOutOfBoundsException();
        }
        if ( head == null )
        {
            return null;
        }
        if ( i == 0 )
        {
            nodeCount--;
            E e = head.getValue();
            head = head.getNext();
            return e;
        }
        ListNode<E> nextNode = head;
        for ( int j = 0; j < i - 1; j++ )
        {
            nextNode = nextNode.getNext();
        }
        E obj = nextNode.getNext().getValue();
        nextNode.setNext( nextNode.getNext().getNext() );
        nodeCount--;
        return obj; // fix this
    }


    /**
     * Returns a string representation of this list.
     * 
     * @return a string representation of this list.
     */
    public String toString()
    {
        ListNode<E> nextNode = head;
        String theString = "[";
        while ( nextNode.getNext() != null )
        {
            theString += nextNode.getValue() + ", ";
            nextNode = nextNode.getNext();

        }
        // nextNode = nextNode.getNext();
        theString += nextNode.getValue() + "]";
        return theString; // fix this
    }


    /**
     * Returns an iterator for this collection.
     * 
     * @return an iterator for this collection.
     */
    public Iterator<E> iterator()
    {
        return new SinglyLinkedListIterator<E>( head );
    }
}
