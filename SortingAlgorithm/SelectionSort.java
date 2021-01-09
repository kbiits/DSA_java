package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            int min = arr[i];
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                    swap = true;
                }
            }

            // swapping
            if (swap) {
                int temp = arr[i];
                arr[i] = min;
                arr[indexMin] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[30];
        PopulateArray.populateArray(100, arr);
        System.out.println("Unsorted : ");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted : ");
        System.out.println(Arrays.toString(arr));
    }
}
