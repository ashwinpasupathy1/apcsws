/**
 * College student which extends student
 *
 * @author apasupathy939
 * @version Oct 6, 2017
 * @author Period: 1
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: none
 */
public class CollegeStudent extends Student
{
    private String myMajor;

    private int myYear;


    /**
     * creates CollegeStudent
     * 
     * @param name
     *            name to set
     * @param age
     *            age to sed
     * @param gender
     *            gender to set
     * @param idNum
     *            idNum to set
     * @param gpa
     *            gpa to set
     * @param year
     *            year to set
     * @param major
     *            major to set
     */
    public CollegeStudent(
        String name,
        int age,
        String gender,
        String idNum,
        double gpa,
        int year,
        String major )
    {
        super( name, age, gender, idNum, gpa );
        myMajor = major;
        myYear = year;
    }


    /**
     * Returns myMajor.
     * 
     * @return myMajor major to return
     */
    public String getMajor()
    {
        return myMajor;
    }


    /**
     * Sets major to subject
     * 
     * @param subject
     *            major to set to
     */
    public void setMajor( String subject )
    {
        myMajor = subject;
    }


    /**
     * Returns year
     * 
     * @return myYear year of college student
     * 
     * 
     */
    public int getYear()
    {
        return myYear;
    }


    /**
     * sets year to salary
     * 
     * @param salary
     *            year to set to
     */
    public void setYear( int salary )
    {
        myYear = salary;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}
