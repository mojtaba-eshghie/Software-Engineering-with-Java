import java.util.Arrays;

public class QuickSort {
    public static int[] theArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 72, 0, 9, 3, 16, 23, -1000, -40, 50, 1};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Arrays.copyOfRange(theArray, 0, theArray.length)));

        quickSort(0, theArray.length - 1);
        System.out.println(Arrays.toString(theArray));

    }

    public static void quickSort(int start, int end) {
        System.out.println(String.format("----------------------------------\nqs on: %s",
                Arrays.toString(Arrays.copyOfRange(theArray, start, end+1))));

        // check if start and end have crossed each other
        if (end - start <= 1) {
            return;
        }

        int pivotIndex = partition(start, end);
        quickSort(start, pivotIndex);
        quickSort(pivotIndex+1, end);
    }


    //we're supposed to return the position of pivot (besides doing the partitioning job)
    public static int partition(int start, int end) {
        int i = start;
        int j = end;
        int pivot = theArray[start];
        int nextIndex = j;

        while (i!=j){
            if (theArray[nextIndex] < pivot) {
                if (nextIndex == j) {
                    System.out.println(String.format("putting %d in the place of %d",
                            theArray[nextIndex], theArray[i]));
                    theArray[i] = theArray[nextIndex];
                    i++;
                    nextIndex = i;
                } else if (nextIndex == i){
                    i++;
                    nextIndex = i;
                }
            } else if (theArray[nextIndex] >= pivot) {
                if (nextIndex == j) {
                    j--;
                    nextIndex = j;
                } else if (nextIndex == i) {
                    theArray[j] = theArray[nextIndex];
                    j--;
                    nextIndex = j;
                }
            }
        }

        System.out.println(String.format("pivot: %d, pivot's index: %d",
                pivot, i));
        System.out.println(String.format("Now the array is: %s",
                Arrays.toString(Arrays.copyOfRange(theArray, start, end+1))));

        theArray[i] = pivot;
        return i;
    }
}
