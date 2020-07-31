import java.util.Arrays;

/*
    In this version I am traversing the unsorted partition of array
    from bottom to top, therefore it can be unstable. Whereas, if
    we traverse it from top to bottom it will pick the equal big items
    from top (which results in not changing the place of equal items from
    the bottom of unsorted partition to upper part) that results in a
    stable algorithm.
 */

public class SelectionSort {
    public static void main (String[] args) {
        //int[] theArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] theArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 72, 0, 9, 3, 16, 23, -1000, -40, 50, 1};
        byte unsorted_index = (byte) theArray.length;
        unsorted_index--;

        int current_max;
        int current_max_index;
        while (unsorted_index >= 0) {
            current_max = theArray[0];
            current_max_index = 0;

            System.out.println(Arrays.toString(theArray));

            for (int i = 0; i <= unsorted_index; i++) {

                if (theArray[i] > current_max) {
                    current_max = theArray[i];
                    current_max_index = i;
                }

                // last element in unsorted partition, now do the exchange
                if (i == unsorted_index) {
                    int temp = theArray[i];
                    theArray[i] = current_max;
                    theArray[current_max_index] = temp;
                }
            }

            unsorted_index--;
        }


    }
}
