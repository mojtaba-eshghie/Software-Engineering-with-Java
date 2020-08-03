import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] theArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 72, 0, 9, 3, 16, 23, -1000, -40, 50, 1};
        int[] GAPS = new int[] {3, 1};
        int LENGTH = theArray.length;
        int i, j, temp, i2, j2;
        /*
        Based on the knuth formula for gaps, we will use an initial gap
        of 3, and then reducing the gap to 1 which is basically
        the insertion sort on a more sorted array that causes the cost of
        insertion sort to reduce.
         */

         for (int k = 0; k < GAPS.length; k++){
            int gap = GAPS[k];
            i = 0;
            j = i + gap;
            while (j < LENGTH) {
                if (theArray[i] > theArray[j]){
                    // 1. do the exchange;
                    System.out.printf("Forward: changing %d with %d \n", theArray[i], theArray[j]);
                    temp = theArray[i];
                    theArray[i] = theArray[j];
                    theArray[j] = temp;
                    System.out.println(Arrays.toString(theArray) + "\n");


                    // 2. do the iteration over all items behind
                    i2 = j - gap;
                    while (i2-gap >= 0) {
                        if (theArray[i2] < theArray[i2 - gap]) {
                            System.out.printf("Backward: (gap: %d) changing %d with %d \n", gap, theArray[i2], theArray[i2-gap]);
                            temp = theArray[i2];
                            theArray[i2] = theArray[i2-gap];
                            theArray[i2-gap] = temp;
                            System.out.println(Arrays.toString(theArray) + "\n");
                        } else {
                            break;
                        }
                        i2 = i2 - gap;
                    }
                }

                i = i + 1;
                j = j + 1;
            }
        }

        System.out.println(Arrays.toString(theArray));



    }
}
