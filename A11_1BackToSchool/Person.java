/**
 *
 * person class which is extended byteacher and student
 * 
 * @author apasupathy939
 * @version Oct 6, 2017
 * @author Period: 1
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: none
 */
public class Person
{
    private String myName; // name of the person

    private int myAge; // person's age

    private String myGender; // 'M' for male, 'F' for female


    /**
     * Creates person object
     * 
     * @param name
     *            name of person
     * @param age
     *            age of person
     * @param gender
     *            gender of person
     */
    public Person( String name, int age, String gender )
    {
        myName = name;
        myAge = age;
        myGender = gender;
    }


    /**
     * Returns name of person
     * * @return myName name of person
     */
    public String getName()
    {
        return myName;
    }


    /**
     * Returns age of person
     * 
     * @return myAge age of person
     */
    public int getAge()
    {
        return myAge;
    }


    /**
     * Gets gender of person
     * 
     * @return myGender gender of person
     */
    public String getGender()
    {
        return myGender;
    }


    /**
     * Sets name of person.
     * 
     * @param name
     *            sets myName to name
     */
    public void setName( String name )
    {
        myName = name;
    }


    /**
     * sets age of person
     * 
     * @param age
     *            sets age of person
     */
    public void setAge( int age )
    {
        myAge = age;
    }


    /**
     * Sets gender of person
     * 
     * @param gender
     *            gender to change to
     */
    public void setGender( String gender )
    {
        myGender = gender;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}