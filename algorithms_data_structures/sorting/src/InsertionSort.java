import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    //BUG
    /*
    The implementation is buggy;
     */

    public static void main(String[] args) {
        int[] theArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 72, 0, 9, 3, 16, 23, -1000, -40, 50, 1};


        int unsorted_high_index = theArray.length - 2;
        int index_to_exchange = 0;
        int item;


        while (unsorted_high_index >= 0) {
            item = theArray[unsorted_high_index];
            index_to_exchange = binary_search_for_is(theArray, item, unsorted_high_index + 1, theArray.length - 1);
            // do the exchanging:
            theArray[unsorted_high_index] = theArray[index_to_exchange];
            theArray[index_to_exchange] = item;

            unsorted_high_index--;
        }

        System.out.println(Arrays.toString(theArray));

    }




    /*
    Without our home-made version of binary_search_insertion_sort, finding
    a proper place for exchange will cost at most n operation each time
    resulting in a O(n^2) for our insertion sort. Since the partition that is
    growing is sorted, it will naturally support smt like binary search. So,
    why not? Moreover, here our specific implementation determines if the
    overall algorithm is stable or not.
     */
    public static int binary_search_for_is(int[] theArray, int item, int low, int high) {
        int all_time_low = 0;
        int all_time_high = theArray.length;

        int index = 0; //Dummy initialization!
        int middle;
        middle = high/2;



        while (high >= low && low != middle) {
           if (item > theArray[middle]) {
               low = middle;
               middle = ((high - middle) / 2) + middle;
               index = middle + 1;

               if (index > all_time_high) {
                   index = middle;
               }
               System.out.println(String.format("#1 index is: %d", index));
           } else if (item < theArray[middle]) {
               high = middle;
               middle = middle / 2;
               index = middle - 1;
               if (index < all_time_low) {
                   index = middle;
               }
               System.out.println(String.format("#2 index is: %d", index));
           } else if (item == theArray[middle]) {
               index = middle - 1; //This would make our algorithm stable (no?)


               // let's terminate the algorithm (this is just a hack):
               low = 1;
               high = 0;
               if (index < all_time_low) {
                   index = 0;
               }
               System.out.println(String.format("#3 index is: %d", index));
           }

           //System.out.println(String.format("low: %d, mid: %d, high: %d", low, middle, high));
        }

        System.out.println("this is ::: " + Integer.toString(index));
        return index;
    }









}
