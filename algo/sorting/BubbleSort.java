package algo.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22};

        // sorted partition start from right and keeps on increasing from right to left
        for(int lastUnsortedIdx = array.length - 1; lastUnsortedIdx > 0; lastUnsortedIdx--) {
            // i to traverse the array from left to right and compare the next value with current value
            for(int i = 0; i < lastUnsortedIdx; i++) {
                if(array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }
            }
        }
        System.out.println("Number in sorted order using bubble sort: ");
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
