/**
 * Creates teacher class which extends person.
 *
 * @author apasupathy939
 * @version Oct 6, 2017
 * @author Period: 1
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: none
 */
public class Teacher extends Person
{

    /**
     * mySubject subject of teacher
     */
    private String mySubject;

    /**
     * mySalary salary of teacher
     */
    private double mySalary;


    /**
     * Creates teacher object
     * 
     * @param name
     *            name of teacher
     * @param age
     *            age of teacher
     * @param gender
     *            gender of teacher
     * @param subject
     *            subject of teacher
     * @param cost
     *            cost of teacher
     */
    public Teacher( String name, int age, String gender
                , String subject, double cost )
    {
        super( name, age, gender );
        mySalary = cost;
        mySubject = subject;
    }


    /**
     * Gets subject
     * 
     * @return mySubject subject of teacher
     */
    public String getSubject()
    {
        return mySubject;
    }


    /**
     * Sets subject.
     * 
     * @param subject
     *            subject to set to
     */
    public void setSubject( String subject )
    {
        mySubject = subject;
    }


    /**
     * Gets salary.
     * 
     * @return mySalar salary of teacher
     */
    public double getSalary()
    {
        return mySalary;
    }


    /**
     * Sets salary.
     * 
     * @param salary
     *            to set to
     */
    public void setSalary( double salary )
    {
        mySalary = salary;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", subject: " +
                        mySubject + ", salary: " + mySalary;
    }
}
