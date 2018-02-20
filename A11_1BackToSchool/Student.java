/**
 * Student class which extends person
 * 
 * @author apasupathy939
 * @version Oct 6, 2017
 * @author Period: 1
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: none
 */
public class Student extends Person
{
    private String myIdNum; // Student Id Number

    private double myGPA; // grade point average


    /**
     * Creates student object
     * 
     * @param name
     *            name of teacher
     * @param age
     *            age of teacher
     * @param gender
     *            gender of teacher
     * @param idNum
     *          idNum of student
     * @param gpa
     *          gpa of student
     */
    public Student( String name, int age, String gender,
            String idNum, double gpa )
    {
        // use the super class' constructor
        super( name, age, gender );

        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }


    /**
     * Gets idNum
     * 
     * @return myIdNum idnum of student
     */
    public String getIdNum()
    {
        return myIdNum;
    }


    /**
     * Gets gpa.
     * 
     * @return myGPA gpa of student
     */
    public double getGPA()
    {
        return myGPA;
    }


    /**
     * Sets idNum.
     * 
     * @param idNum
     *            idNum to set to
     */
    public void setIdNum( String idNum )
    {
        myIdNum = idNum;
    }


    /**
     * Sets gpa.
     * 
     * @param gpa
     *            gpa to set to
     */
    public void setGPA( double gpa )
    {
        myGPA = gpa;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", student id: "
                        + myIdNum + ", gpa: " + myGPA;
    }
}
