package algo.sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22};

        // sorted partition grows by 1 from right to left, currently entire array is unsorted so
        // lastUnsortedIdx is the last index of array
        for(int lastUnsortedIdx = array.length - 1; lastUnsortedIdx > 0; lastUnsortedIdx--) {
            int largest = 0;
            // loop to find the largest element
            for(int i = 1; i <= lastUnsortedIdx; i++) {
                if(array[largest] < array[i]) {
                    largest = i;
                }
            }
            // swap the largest element found in the unsorted partition and swap it with last element of unsorted partition
            swap(array, lastUnsortedIdx, largest);
        }

        System.out.println("Number in sorted order using selection sort: ");
        for (int num: array) {
            System.out.print(num + "\t");
        }
    }

    public static void swap(int[] array, int i, int j) {
        if(i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
