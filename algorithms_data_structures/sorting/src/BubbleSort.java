import java.util.Arrays;

public class BubbleSort {

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
