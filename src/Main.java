//Main.java
/*
 * EE422C Project 1 submission by
 * Meyer Dauber
 * mjd3375
 * 16190
 * Fall 2018
 * Slip days used: N/A
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing isSorted...");
        int[] x = {1,2,3};
        int n = 3;
        System.out.println("x[] = " + Arrays.toString(x) + ", n = "+ n);
        System.out.println("Correct output: true, Your output: " + SortTools.isSorted(x,n));
        x = new int[]{100};
        n = 1;
        System.out.println("x[] = " + Arrays.toString(x) + ", n = "+ n);
        System.out.println("Correct output: true, Your output: " + SortTools.isSorted(x,n));
        x = new int[]{6, 5, 4, 3, 2, 1};
        n = 6;
        System.out.println("x[] = " + Arrays.toString(x) + ", n = "+ n);
        System.out.println("Correct output: false, Your output: " + SortTools.isSorted(x,n));
        x = new int[]{-1, 2, 2, 3};
        n = 4;
        System.out.println("x[] = " + Arrays.toString(x) + ", n = "+ n);
        System.out.println("Correct output: true, Your output: " + SortTools.isSorted(x,n));
        x = new int[]{1,2,3,4,3,6};
        n = 6;
        System.out.println("x[] = " + Arrays.toString(x) + ", n = "+ n);
        System.out.println("Correct output: false, Your output: " + SortTools.isSorted(x,n));
        n = 4;
        System.out.println("x[] = " + Arrays.toString(x) + ", n = "+ n);
        System.out.println("Correct output: true, Your output: " + SortTools.isSorted(x,n));

    }
}
