// SortTools.java
/*
 * EE422C Project 1 submission by
 * Meyer Dauber
 * mjd3375
 * 16190
 * Fall 2018
 * Slip days used: N/A
 */

public class SortTools {
    /**
     * This method tests to see if the given array is sorted.
     * @param x is the array
     * @param n is the size of the input to be checked
     * @return true if array is sorted
     */
    public static boolean isSorted(int[] x, int n) {
        //conforming to edge cases where either array is empty or 0 length search
        if(n == 0 || x.length == 0 || n > x.length)
            return false;
        //length 1 is always sorted
        if(n == 1)
            return true;
        //iterating through and checking the next variable to see if it is
        for(int i = 0; i < n - 1; i++){
            if(x[i] > x[i+1])
                return false;
        }
        return true;
    }

    /**
     * This method returns the index of value v within array x.
     * @param x is the array
     * @param n is the size of the input to be checked
     * @param v is the value to be searched for within x
     * @return index of v if v is contained within x. -1 if v is not contained within x
     */
    public static int find(int[] x, int n, int v) {
        // stub only, you write this!
        // TODO: complete it
        return -1;
    }

    /**
     * This method returns a newly created array containing the first n elements of x, and v.
     * @param x is the array
     * @param n is the number of elements to be copied from x
     * @param v is the value to be added to the new array
     * @return a new array containing the first n elements of x, and v
     */
    public static int[] insertGeneral(int[] x, int n, int v){
        // stub only, you write this!
        // TODO: complete it
        return null;
    }

    /**
     * This method inserts a value into the array and ensures it's still sorted
     * @param x is the array
     * @param n is the number of elements in the array
     * @param v is the value to be added
     * @return n if v is already in x, otherwise returns n+1
     */
    public static int insertInPlace(int[] x, int n, int v){
        // stub only, you write this!
        // TODO: complete it
        return -1;
    }

    /**
     * This method sorts a given array using insertion sort
     * @param x is the array to be sorted
     * @param n is the number of elements of the array to be sorted
     */
    public static void insertSort(int[] x, int n){
    }
}
