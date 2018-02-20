public class InsertionSort extends StepCount
{
    // Sorts a[0], ..., a[size-1] in ascending order
    // using Insertion Sort.
    public void sort( double[] a )
    {
        // for loop initialization
        addSteps(1);
        for ( int n = 1; n < a.length; n++ )
        {
            // Save the next element to be inserted:
            double aTemp = a[n];

            // Going backward from a[n-1], shift elements to the
            // right until you find an element a[i] <= aTemp:
            int i = n;
            // for loop (2) 2 initializations (2)
            addSteps(4);
            while ( i > 0 && aTemp < a[i - 1] )
            {
                a[i] = a[i - 1];
                i--;
                // while loop check and 2 operations
                addSteps(4);
            }

            // Insert the saved element after a[i]:
            a[i] = aTemp;
            addSteps(1);
        }
    }
}

