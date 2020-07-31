import java.util.Arrays;

public class BubbleSort {
    /*
    There is a concept called stable/unstable sort algorithms,
    that is the relative ordering of the duplicate items stays
    the same after sorting.
    Stability matters when we want to sort objects. For example,
    first we may want to sort objects by "name", then by "age". In
    such a scheme if the second sort (by 'age') is unstable, then it
    will render the final result different from the case that it was
    stable, and probably the logical desired final result is the one
    that does not change the place of items that have identical
    properties (the ones we're using for sorting).
     */

    // Bubble sort is stable!

    public static void main(String[] args) {
        int[] unsortedArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        byte unsorted_index = (byte) unsortedArray.length;

        while (unsorted_index > 0) {
            for (int i = 0; i < unsorted_index-1; i++) {
                if (unsortedArray[i] > unsortedArray[i+1]) {
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1] = temp;
                }
            }
            unsorted_index--;
            System.out.println("--------------------------");
        }

        System.out.println(Arrays.toString(unsortedArray));
    }
}
