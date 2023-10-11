package datastructures;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[7];

        arr[0] = 20;
        arr[1] = 35;
        arr[2] = -15;
        arr[3] = 7;
        arr[4] = 55;
        arr[5] = 1;
        arr[6] = -22;

        System.out.println("Printing the elements in the array");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        // searching an element in the array
        System.out.println("Searching the array");
        int index = -1, element = 7;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                index = i;
                break;
            }
        }
        // Time complexity: O(n) for search
        System.out.println("Element " + element + " found at index: " + index);
    }
}
