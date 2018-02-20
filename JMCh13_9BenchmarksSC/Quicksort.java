public class Quicksort extends StepCount
{
    // Sorts a[0], ..., a[size-1] in ascending order
    // using the Quicksort algorithm.
    public void sort( double[] a )
    {
        recursiveSort( a, 0, a.length - 1 );
    }

    // Recursive helper method: sorts a[from], ..., a[to]
    private void recursiveSort( double[] a, int from, int to )
    {
        // comparison
        addSteps(1);
        if ( from >= to )
            return;
        
        // Choose pivot a[p]:
        int p = ( from + to ) / 2;
        // The choice of the pivot location may vary:
        // you can also use p = from or p = to or use
        // a fancier method, say, the median of the above three.

        // Partition:

        int i = from;
        int j = to;
        addSteps(3);
        // 3 initializations and while loop
        while ( i <= j )
        {
            
            if ( a[i] <= a[p] )
            {
                i++;
                addSteps(2);
            }
            else if ( a[j] >= a[p] )
            {
                j--;
                addSteps(3);
            }
            else
            {
                swap( a, i, j );
                i++;
                j--;
                addSteps(7);
            }
        }

        // Finish partitioning:
        addSteps(1);
        if ( p < j ) // place the pivot in its correct position
        {
            swap( a, j, p );
            p = j;
            addSteps(4);
        }
        else if ( p > i )
        {
            swap( a, i, p );
            p = i;
            addSteps(5);
        }

        // Sort recursively:
        recursiveSort( a, from, p - 1 );
        recursiveSort( a, p + 1, to );
    }
}
