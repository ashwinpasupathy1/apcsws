import java.util.Scanner;

/**
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *  Prints line and takes input from system
 *  @author  TODO: Ashwin Pasupathy
 *  @version TODO: 8/17/17
 *  @author  Period: TODO 1
 *  @author  Assignment: JMCh02_Hello - Greetings2.java
 *
 *  @author  Sources: TODO none
 */
public class Greetings2
{
    public static void main(String[] args) {
        

        Scanner kboard = new Scanner(System.in); 
        System.out.print("Enter your first name: ");
        String firstName = kboard.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = kboard.nextLine();
        System.out.println("Hello, " + firstName + " " + lastName);
        System.out.println("Welcome to Java!"); 
        
    }
}
