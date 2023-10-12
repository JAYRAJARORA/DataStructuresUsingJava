package algo.sorting;

public class ShellSort {
    public static void main(String[] args) {
        // shell sort is an improvement over insertion sort
        int[] array = { 20, 35, -15, 7, 55, 1, -22};

        // we compute the gap over which we will shift the elements and reduce the gap finally to 1 to do the insertion sort
        //  at gap = 1 works well, because the array is more sort after the iterations
        for(int gap = array.length/2; gap > 0; gap = gap/2) {
            for(int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;

                while(j >= gap && array[j-gap] > newElement) {
                    array[j] = array[j-gap];
                    j = j - gap;
                }
                array[j] = newElement;
            }
        }

        System.out.println("Number in sorted order using shell sort: ");
        for (int num: array) {
            System.out.print(num + "\t");
        }
    }
}
