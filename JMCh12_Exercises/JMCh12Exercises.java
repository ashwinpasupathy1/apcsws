import java.util.*;


/**
 * Java Methods Chapter 12 Exercises 1-9, 11-14, 17, 18, 20, 26 & 27
 * 
 * @author Ashwin Pasupathy
 * @version 10/23/17
 * 
 * @author Period - 1
 * @author Assignment - JMCh12Exercises
 * 
 * @author Sources - none
 */
public class JMCh12Exercises
{
    Scanner scan;


    /**
     * Constructs a Scanner for input from the console.
     */
    public JMCh12Exercises()
    {
        scan = new Scanner( System.in );
    }


    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str
     *            input for the various methods
     */
    public JMCh12Exercises( String str )
    {
        scan = new Scanner( str );
    }


    // 12-1(a)
    // Write a statement that declares an array of three integers,
    // initialized to 1, 2, and 4.
    /**
     * Creates of 3 ints.
     * 
     * @return array of ints
     */
    public int[] arrayOf3Ints()
    {
        return new int[] { 1, 2, 4 };
    }


    // 12-1(b)
    // Write an expression that represents the sum of the three elements
    // of the above array (regardless of their current values)
    /**
     * Sums array.
     * 
     * @return returns sum
     */
    public int sumOfArrayOf3Ints()
    {
        int[] array = arrayOf3Ints();

        return array[0] + array[1] + array[2];
    }


    // 12-2a, b, c, d
    // Mark true or false and explain:
    // (a) The following array has 101 elements:
    // int[] x = new int[100];
    // (b) Java syntax allows programmers to use any expression of the
    // int data type as an array subscript.
    // (c) The program, when running, verifies that all array subscripts
    // fall into the valid range.
    // (d) Any one-dimensional array object has a length method that
    // returns the size of the array.
    /**
     * Mult choice questions.
     * 
     * @return array of booleans with answers
     */
    public boolean[] prob2abcdTrueFalse()
    {
        // return a boolean array with answers corresponding
        // to question (a) - (d)
        return new boolean[] { false, true, true, false };
    }


    // 12-3
    // Write a method that takes an array of integers and swaps the
    // first element with the last one.
    /**
     * Swaps first with last.
     * 
     * @param a
     *            array to swap
     */
    public void swapFirstLast( int[] a )
    {
        int temp = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temp;
    }


    // 12-4
    // An array of integers scores has at least two elements,
    // and its elements are arranged in ascending order
    // (i.e. scores[i] <= scores[i+1]). Write a condition that tests
    // whether all the elements in scores have the same values.
    // (Hint: you do not need iterations.)
    /**
     * Checks if all elements are the same.
     * 
     * @param scores
     *            checks if they are the same
     * @return whetert they are the same
     */
    public boolean allElementsSame( int[] scores )
    {

        return scores[0] == scores[scores.length - 1];
    }


    // 12-5
    // Write a method getRandomRps that returns a character 'r', 'p',
    // or 's', chosen randomly with odds of 3 : 5 : 6, respectively.
    // (Hint: declare an array of chars and initialize it with values
    // 'r', 'p', and 's', with each value occurring a number of times
    // proportional to its desired odds. Return a randomly chosen
    // element of the array.)
    /**
     * Gets random rps dist.
     * 
     * @return random char
     */
    public char getRandomRps()
    {
        char[] a = { 'r', 'r', 'r', 'p', 'p', 'p', 'p', 'p', 's', 's', 's', 's', 's', 's' };

        return a[(int)( Math.random() * a.length )];
    }


    /**
     * Counts number of consecutive zeros.
     * 
     * @param v
     *            array to count
     * @return count
     */
    private int mysteryCount( int[] v )
    {
        int n = v.length, count = 0;

        for ( int i = 0; i < n; i++ )
        {
            if ( v[i] != 0 )
                break;
            count++;
        }
        return count;
    }


    // 12-6
    // What does the mysteryCount method count?
    /**
     * Counts consecutive beginning zeroes.
     * 
     * @return number of zeroes
     */
    public String whatDoesMysteryCountCount()
    {
        int[] v = { 0, 0, 0, 1, 1, 2, 0, 0, 3, 4, 0, 0 };
        int mCount = mysteryCount( v );

        //String answer = mCount + "";

        return " counts consecutive beginning zeroes";
    }


    // 12-7
    // If you take any two positive integers m and n (m > n), then
    // the numbers a, b, and c, where
    //
    // a =m^2 - n^2 ; b = 2mn; c =m^2 + n^2
    //
    // form a Pythagorean triple:
    //
    // a^2 + b^2 = c^2
    //
    // You can use algebra to prove that this is always true.
    //
    // Write a method makePythagoreanTriple that takes two integer
    // arguments, m and n, swaps them if necessary to make m > n,
    // calculates the Pythagorean triple using the above expressions,
    // places the resulting values a, b, and c into a new array of
    // three elements, and returns that array. Test your method in
    // a simple program.
    /**
     * Makes pythagorean triple.
     * 
     * @param m
     *            first number
     * @param n
     *            second number
     * @return next two numbers
     */
    public static int[] makePythagoreanTriple( int m, int n )
    {
        int[] answers = new int[3];
        answers[0] = Math.abs( m * m - n * n );
        answers[2] = m * m + n * n;
        answers[1] = 2 * m * n;
        return answers;
    }


    // 12-8
    // Complete the following method:
    //
    // Returns an array filled with values
    // 1, 2, ..., n-1, n, n-1, ..., 2, 1.
    /**
     * Creates a wedge.
     * 
     * @param n
     *            n elements
     * @return wedge
     */
    public static int[] createWedge( int n )
    {
        int[] values = new int[2 * n - 1];

        for ( int i = 0; i < n; i++ )
        {
            values[i] = i + 1;
        }
        for ( int i = n; i < 2 * n - 1; i++ )
        {
            values[i] = n - ( i - n + 1 );
        }

        return values;
    }

    // 12-9
    // In SCRABBLE, different letters are assigned different numbers of points:
    //
    // A - 1 E - 1 I - 1 M - 3 Q - 10 U - 1 X - 8
    // B - 3 F - 4 J - 8 N - 1 R - 1 V - 4 Y - 4
    // C - 3 G - 2 K - 5 O - 3 S - 1 W - 4 Z - 10
    // D - 2 H - 4 L - 1 P - 3 T - 1
    //
    /**
     * scores of letters
     */
    public static int[] letterScores = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 3, 3, 10, 1, 1,
        1, 1, 4, 4, 8, 4, 10 };

    /**
     * string of alphabet
     */
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";


    // Write a method computeScore(String word) that returns the score
    // for a word without using either if or switch statements.
    // (Hint: find the position of a given letter in the alphabet string
    // by calling indexOf; get the score for that letter from the array
    // of point values, and add to the total.)
    /**
     * Computes score of words
     * 
     * @param word
     *            word to test
     * @return score
     */
    public static int computeScore( String word )
    {
        int sum = 0;
        for ( int i = 0; i < word.length(); i++ )
        {
            if ( alphabet.indexOf( Character.toLowerCase( word.charAt( i ) ) ) != -1 )
            {
                sum += letterScores[alphabet.indexOf( Character.toLowerCase( word.charAt( i ) ) )];
            }
        }

        return sum;
    }


    // 12-11a, b, c, d, e
    // Mark true or false and explain:
    // (a) An ArrayList can contain multiple references to the same object.
    // (b) The same object may belong to two different ArrayLists.
    // (c) ArrayList's remove method destroys the object after it has
    // been removed from the list.
    // (d) ArrayList's add method makes a copy of the object and adds
    // it to the list.
    // (e) Two variables can refer to the same ArrayList.
    /**
     * mult choice.
     * 
     * @return answers
     */
    public boolean[] prob11abcdeTrueFalse()
    {
        // return a boolean array with answers corresponding
        // to question (a) - (e)
        return new boolean[] { true, true, false, false, true };
    }


    // 12-12
    // Write a method that takes an ArrayList and returns a new ArrayList
    // in which the elements are stored in reverse order. The original
    // list should remain unchanged.
    /**
     * reverses list.
     * 
     * @param list
     *            to reverse
     * @return reversed list
     */
    public ArrayList<String> reverse( ArrayList<String> list )
    {
        ArrayList<String> reverse = new ArrayList<String>( list.size() );

        for ( String i : list )
        {
            reverse.add( list.get( list.size() - list.indexOf( i ) - 1 ) );
        }

        return reverse;
    }


    // 12-13
    // Write a method that removes the smallest value from an
    // ArrayList<Integer>.
    // (Hint: Integer has a method compareTo(Integer other)
    // that returns the difference of this Integer and other.)
    /**
     * removes minimum.
     * 
     * @param list
     *            list to alter
     */
    public void removeMin( ArrayList<Integer> list )
    {
        if(list.size() == 0) return;  
        Integer smallest = list.get( 0 );

        for ( Integer i : list )
        {
            if ( i.compareTo( smallest ) < 0 )
            {
                smallest = i;
            }
        }
        list.remove( smallest );
    }


    // 12-14
    // Write and test a method.
    //
    // public void filter(ArrayList<Object> list1, ArrayList<Object> list2)
    //
    // that removes from list1 all objects that are also in list2.
    // Your method should compare the objects using the == operator,
    // not equals.
    // (Hint: the contains and indexOf methods cannot be used.)
    /**
     * filters both lists.
     * 
     * @param list1
     *            returned list
     * @param list2
     *            check if it is in
     */
    public void filter( ArrayList<Object> list1, ArrayList<Object> list2 )
    {
        int i = 0;
        while ( i < list1.size() )
        {
            if ( list2.contains( list1.get( i ) ) )
            {
                // System.out.println( list1.get( i ) + " ok ");
                list1.remove( list1.get( i ) );
            }
            else
            {
                i++;
            }
        }
    }


    // 12-17
    // Find and fix the bug in the following code:
    /**
     * fix the bug.
     * 
     * @return hello!
     */
    public static char[] prob17FixBug()
    {
        char[] hello = { ' ', 'h', 'e', 'l', 'l', 'o' };
        int i = 1;
        // Shift to the left and append '!':
        while ( i < 6 )
        {
            hello[i - 1] = hello[i];
            i++;
        }
        hello[5] = '!';

        return hello;

    }


    // 12-18
    // Write a method that determines whether a given number is a median
    // for values stored in an array:
    //
    // Returns true if m is a median for values in the array
    // sample, false otherwise. (Here we call m a median if
    // the number of elements that are greater than m is the
    // same as the number of elements that are less than m)
    /**
     * find the median.
     * 
     * @param sample
     *            sample to find
     * @param m
     *            check if it is median
     * @return median is equal to m
     */
    public boolean isMedian( double[] sample, double m )
    {
        double mid = sample[sample.length / 2];
        if ( sample.length % 2 == 0 )
        {
            mid += sample[sample.length / 2];
            mid /= 2;
        }
        return mid == m;
    }


    // 12-20
    // Fill in the blanks in the following method that returns the
    // average of the two largest elements of an array:
    //
    // Finds the two largest elements in scores
    // and returns their average.
    // Precondition: the size of the array is >= 2.
    /**
     * averages top largest elements in an array.
     * 
     * @param scores
     *            check
     * @return average
     */
    public static double averageTopTwo( int[] scores )
    {
        int i, size = scores.length;
        int iMax1 = 0; // index of the largest element
        int iMax2 = 1; // index of the second largest element
        // If scores[iMax2] is bigger than scores[iMax1] --
        // swap iMax1 and iMax2
        if ( scores[iMax2] > scores[iMax1] )
        {

            int temp = iMax1;
            iMax1 = iMax2;
            iMax2 = temp;
        }
        for ( i = 2; i < size; i++ )
        {
            if ( scores[i] > scores[iMax1] )
            {
                int temp = iMax1;
                iMax1 = i;
                iMax2 = temp;
            }
            else if ( scores[i] > scores[iMax2] )
            {
                iMax2 = i;
            }
        }
        return ( scores[iMax1] + scores[iMax2] ) / 2.0;
    }


    // 12-26
    // A two-dimensional array matrix represents a square matrix with
    // the number of rows and the number of columns both equal to n.
    // Write a condition to test that an element matrix[i][j] lies on
    // one of the diagonals of the matrix.
    /**
     * Return if it lies on a diagonal.
     * 
     * @param matrix
     *            matrix to check
     * @param i
     *            location
     * @param j
     *            location
     * @return whether it is on a diagonal
     */
    public boolean liesOnDiagonal( int[][] matrix, int i, int j )
    {
        int n = matrix.length;

        return i == j || i == matrix.length - j - 1 ;

    }


    // 12-27
    // Write a method that returns the value of the largest positive
    // element in a 2-D array, or 0 if all its elements are negative:
    //
    // Returns the value of the largest positive element in
    // the matrix m, or 0, if all its elements are negative.
    /**
     * Returns largest positive element of array.
     * 
     * @param m
     *            array to check
     * @return largest element
     */
    public static double positiveMax( double[][] m )
    {
        double mMax = 0;

        for ( int i = 0; i < m.length; i++ )
        {
            for ( int j = 0; j < m[0].length; j++ )
            {
                if ( mMax < m[i][j] )
                {
                    mMax = m[i][j];
                }
            }
        }

        return mMax;
    }


    // 12-29
    // Let us say that a matrix (a 2-D array of numbers) m1 "covers"
    // a matrix m2 (with the same dimensions) if m1[i][j] > m2[i][j]
    // for at least half of all the elements in m1. Write the following method:
    //
    // Returns true if m1 "covers" m2, false otherwise.
    // Precondition: m1 and m2 have the same dimensions.
    /**
     * Checks if m1 covers m2.
     * 
     * @param m1
     *            array to check
     * @param m2
     *            array to check
     * @return m1 covers m2
     */
    public static boolean covers( double[][] m1, double[][] m2 )
    {

        int lengthToCover = 0;
        int count = 0;

        for ( int i = 0; i < m1.length; i++ )
        {
            for ( int j = 0; j < m1[0].length; j++ )
            {
                lengthToCover++;
                if ( m1[i][j] > m2[i][j] )
                {
                    count++;
                }
            }
        }
        if ( lengthToCover % 2 == 1 )
        {
            lengthToCover++;
        }
        lengthToCover /= 2;

        // lengthToCover = (int) (lengthToCover/2 + 0.5);
        return count >= lengthToCover;
    }


    /**
     * Testing method: instantiates a Ch18Ex1to5 object and then invokes each
     * method.
     * 
     * @param args
     *            command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        JMCh12Exercises exercise = new JMCh12Exercises();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) 12-1(a) arrayOf3Ints()" );
            System.out.println( "   (2) 12-1(b) sumOfArrayOf3Ints()" );
            System.out.println( "   (3) 12-2abcd prob2abcdTrueFalse()" );
            System.out.println( "   (4) 12-3 swapFirstLast( int[] a )" );
            System.out.println( "   (5) 12-4 allElementsSame( int[] scores )" );
            System.out.println( "   (6) 12-5 getRandomRps()" );
            System.out.println( "   (7) 12-6 whatDoesMysteryCountCount()" );
            System.out.println( "   (8) 12-7 makePythagoreanTriple( int m, int n )" );
            System.out.println( "   (9) 12-8 createWedge(int n)" );
            System.out.println( "   (A) 12-9 computeScore( String word )" );
            System.out.println( "   (B) 12-11abcde prob11abcdeTrueFalse()" );
            System.out.println( "   (C) 12-12 reverse( ArrayList<String> list )" );
            System.out.println( "   (D) 12-13 removeMin( ArrayList<Integer> list )" );
            System.out
                .println( "   (E) 12-14 filter(ArrayList<Object> list1, ArrayList<Object> list2)" );
            System.out.println( "   (F) 12-17 prob17FixBug()" );
            System.out.println( "   (G) 12-18 isMedian( double[] sample, double m )" );
            System.out.println( "   (H) 12-20 averageTopTwo( int[] scores )" );
            System.out.println( "   (I) 12-26 liesOnDiagonal( int[][] matrix, int i, int j )" );
            System.out.println( "   (J) 12-27 positiveMax( double[][] m )" );
            System.out.println( "   (K) 12-29 covers( double[][] m1, double[][] m2 )" );
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        System.out.println(
                            "arrayOf3Ints() = " + Arrays.toString( exercise.arrayOf3Ints() ) );
                        break;
                    case '2':
                        System.out
                            .println( "sumOfArrayOf3Ints() = " + exercise.sumOfArrayOf3Ints() );
                        break;
                    case '3':
                        boolean[] prob2abcdAns = exercise.prob2abcdTrueFalse();
                        System.out.println(
                            "prob2abcdTrueFalse() --> " + Arrays.toString( prob2abcdAns ) );
                        break;
                    case '4':
                        int[] arr = { 1, 3, 2, 4 };
                        System.out.println( "int[] arr (before) --> " + Arrays.toString( arr ) );
                        exercise.swapFirstLast( arr );
                        System.out.println( "int[] arr (after)  --> " + Arrays.toString( arr ) );
                        break;
                    case '5':
                        int[] scores = { 99, 99, 99, 98 };
                        System.out.println( "scores --> " + Arrays.toString( scores ) );
                        System.out.println(
                            "allElementsSame( scores ) = " + exercise.allElementsSame( scores ) );
                        scores[scores.length - 1] = 99;
                        System.out.println( "scores --> " + Arrays.toString( scores ) );
                        System.out.println(
                            "allElementsSame( scores ) = " + exercise.allElementsSame( scores ) );
                        break;
                    case '6':
                        final int ITER = 1000;
                        final double TOTAL_RPS = 14.0;
                        String rps = "rps";
                        int[] odds = new int[3];
                        int badRps = 0;

                        for ( int i = 0; i < ITER; i++ )
                        {
                            char ch = exercise.getRandomRps();
                            int rpsChar = rps.indexOf( ch );
                            if ( rpsChar >= 0 )
                            {
                                odds[rpsChar]++;
                            }
                            else
                            {
                                badRps++;
                            }
                        }
                        System.out.println( "odds = " + Math.round( odds[0] * TOTAL_RPS / ITER )
                            + ":" + Math.round( odds[1] * TOTAL_RPS / ITER ) + ":"
                            + Math.round( odds[2] * TOTAL_RPS / ITER ) );
                        System.out.println( "badRps = " + badRps );
                        break;
                    case '7':
                        System.out.println( "whatDoesMysteryCountCount() = "
                            + exercise.whatDoesMysteryCountCount() );
                        break;
                    case '8':
                        int m = 1;
                        int n = 2;
                        System.out.println( "makePythagoreanTriple(" + m + ", " + n + ") --> "
                            + Arrays.toString( exercise.makePythagoreanTriple( m, n ) ) );
                        break;
                    case '9':
                        int maxWedgeVal = 5;
                        System.out.println( "createWedge(" + maxWedgeVal + ") --> "
                            + Arrays.toString( exercise.createWedge( maxWedgeVal ) ) );
                        break;
                    case 'A':
                    case 'a':
                        String word = "QUIXOTIC";
                        System.out.println(
                            "computeScore(" + word + ") = " + exercise.computeScore( word ) );
                        break;
                    case 'B':
                    case 'b':
                        boolean[] prob11abcdeAns = exercise.prob11abcdeTrueFalse();
                        System.out.println(
                            "prob11abcdeTrueFalse() --> " + Arrays.toString( prob11abcdeAns ) );
                        break;
                    case 'C':
                    case 'c':
                        ArrayList<String> list = new ArrayList<String>();
                        list.add( "first" );
                        list.add( "second" );
                        list.add( "third" );
                        System.out.println( "list = " + list );
                        System.out.println( "reverse( list ) = " + exercise.reverse( list ) );
                        break;
                    case 'D':
                    case 'd':
                        ArrayList<Integer> intList = new ArrayList<Integer>();
                        intList.add( 34 );
                        intList.add( 99 );
                        intList.add( 2 );
                        System.out.println( "intList = " + intList );
                        exercise.removeMin( intList );
                        System.out.println( "after removeMin( intList ) --> " + intList );
                        break;
                    case 'E':
                    case 'e':
                        ArrayList<Object> list1 = new ArrayList<Object>();
                        list1.add( 34 );
                        list1.add( "third" );
                        list1.add( 99 );
                        list1.add( 2 );
                        ArrayList<Object> list2 = new ArrayList<Object>();
                        list2.add( "first" );
                        list2.add( 99 );
                        list2.add( "third" );
                        System.out.println( "list1 = " + list1 );
                        System.out.println( "list2 = " + list2 );
                        exercise.filter( list1, list2 );
                        System.out.println( "after filter(list1, list2) --> " + list1 );
                        break;
                    case 'F':
                    case 'f':
                        System.out.println(
                            "prob17FixBug() = " + Arrays.toString( exercise.prob17FixBug() ) );
                        break;
                    case 'G':
                    case 'g':
                        double[] sample = { 1.2, 3.4, 4.5, 5.6, 7.8, 9.10, 11.12 };
                        double median = 5.6;
                        System.out.println( "isMedian(" + Arrays.toString( sample ) + ", " + median
                            + ") = " + exercise.isMedian( sample, median ) );
                        System.out.println( "isMedian(" + Arrays.toString( sample ) + ", "
                            + ( median - 1 ) + ") = " + exercise.isMedian( sample, median - 1 ) );
                        break;
                    case 'H':
                    case 'h':
                        int[] scores2 = { 34, 89, 56, 80, 99, 78, 64 };
                        System.out.println( "averageTopTwo(" + Arrays.toString( scores2 ) + ") = "
                            + exercise.averageTopTwo( scores2 ) );
                        break;
                    case 'I':
                    case 'i':
                        int[][] matrix = new int[4][4];
                        int i = 1;
                        int j = 2;
                        System.out.println( "liesOnDiagonal(" + i + ", " + j + ") = "
                            + exercise.liesOnDiagonal( matrix, i, j ) );
                        i = 0;
                        j = 1;
                        System.out.println( "liesOnDiagonal(" + i + ", " + j + ") = "
                            + exercise.liesOnDiagonal( matrix, i, j ) );
                        break;
                    case 'J':
                    case 'j':
                        double[][] mat = { { -1.0, -2.2, -3.3 }, { -4.4, -5.5, -6.6 },
                            { -7.7, -8.8, -9.9 } };

                        System.out.println( "positiveMax(\n  " + Arrays.toString( mat[0] ) + "\n  "
                            + Arrays.toString( mat[1] ) + "\n  " + Arrays.toString( mat[2] )
                            + " ) = " + exercise.positiveMax( mat ) );

                        mat[2][1] = 13;
                        System.out.println( "positiveMax(\n  " + Arrays.toString( mat[0] ) + "\n  "
                            + Arrays.toString( mat[1] ) + "\n  " + Arrays.toString( mat[2] )
                            + " ) = " + exercise.positiveMax( mat ) );
                        break;
                    case 'K':
                    case 'k':
                        double[][] m1 = { { 1.0, 2.2, 3.3 }, { -4.4, 5.5, -6.6 },
                            { -7.7, -8.8, 9.9 } };

                        double[][] m2 = { { -1.0, -2.2, -3.3 }, { -4.4, -5.5, -6.6 },
                            { -7.7, -8.8, -9.9 } };

                        System.out.println( "covers( m1, m2 ) = " + exercise.covers( m1, m2 ) );
                        m1[0][0] = -10;
                        System.out.println( "covers( m1, m2 ) = " + exercise.covers( m1, m2 ) );
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.print( "Invalid Choice" );
                        }
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
