package algo.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22};

        // sorted partition increases from left to right. Since one element is already sorted, unsorted partition starts from 1
        for(int firstUnsortedIdx = 1; firstUnsortedIdx < array.length; firstUnsortedIdx++) {
            // we save the value of the firstUnsortedIdx as it get overwritten
            int newElement = array[firstUnsortedIdx];
            // we traverse the sorted partition from right to left to find the insertion position for the new element
            // if the element in sorted partition has a value <= to the newElement, we stop there
            int i;
            for(i=firstUnsortedIdx; i > 0 && array[i-1] > newElement; i--) {
                // shifting element to the right to make room for the new element
                array[i] = array[i-1];
            }
            // we found the position to insert the new element, and we put that value onto it
            array[i] = newElement;
        }

        System.out.println("Number in sorted order using insertion sort: ");
        for (int num: array) {
            System.out.print(num + "\t");
        }
    }
}
