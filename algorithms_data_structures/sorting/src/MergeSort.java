import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//BUG

public class MergeSort {
    /*
    ms (merge sort) algorithm is a divive and conquer alg.
    merging phase does not happen in-place: we will need
    temporary arrays.
     */
    public static int[] theArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 72, 0, 9, 3, 16, 23, -1000, -40, 50, 1};

    public static void main(String[] args) {


        int start = 0;
        int end = theArray.length - 1;

        merge_sort(start, end);

        System.out.println(Arrays.toString(theArray));
    }

    public static void merge_sort(int start, int end) {

        if (start == end) {
            return;
        } else {
            int left_start_point = start;
            int left_end_point = (end + start) / 2;
            int right_end_point = end;

            merge_sort(left_start_point, left_end_point);
            merge_sort(left_end_point + 1, right_end_point);

            merge(start, left_end_point, right_end_point);
        }

    }

    public static void merge(int left_start_point, int left_end_point, int right_end_point) {
        if (theArray[left_end_point] <= theArray[left_end_point+1]) {
            // Everything is good, just return!
            return;
        } else {

            int[] tempArray = new int[right_end_point-left_start_point+1];
            int i = left_start_point; // to navigate left array
            int j = left_start_point + 1; // to navigate right array
            int k = 0; // to navigate temp array
            System.out.print(String.format("part1: %s, part2: %s\n", Arrays.toString(Arrays.copyOfRange(theArray, left_start_point, left_end_point+1)), Arrays.toString(Arrays.copyOfRange(theArray, left_end_point+1, right_end_point+1))));
            while ((i <= left_end_point) && (j <= right_end_point))
                //tempArray[k++] = theArray[i] <= theArray[j] ? theArray[i++] : theArray[j++];
                if (theArray[i] <= theArray[j]) {
                    System.out.println(String.format("%d is bigger than (or equal) %d", theArray[j], theArray[i]));
                    tempArray[k] = theArray[i];
                    System.out.println(Arrays.toString(tempArray));
                    k++;
                    i++;
                } else {
                    System.out.println(String.format("%d is bigger than %d", theArray[i], theArray[j]));
                    tempArray[k] = theArray[j];
                    System.out.println(Arrays.toString(tempArray));
                    j++;
                    k++;
                }


            if (i>left_end_point)
                i--;
            k--;

            //System.arraycopy(theArray, i, theArray, left_start_point+k, left_end_point-i);
            System.arraycopy(theArray, i, theArray, k+left_start_point, left_end_point-i);
            System.out.print("current merged: ");
            System.out.print(Arrays.toString(Arrays.copyOfRange(theArray, left_start_point, right_end_point+1)));

            System.arraycopy(tempArray, 0, theArray, left_start_point, k);
            System.out.print("current merged: ");
            System.out.print(Arrays.toString(Arrays.copyOfRange(theArray, left_start_point, right_end_point+1)));

            System.out.println("\n--------");
        }
    }



}
