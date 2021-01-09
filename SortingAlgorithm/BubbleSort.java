package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        populateArray(100, arr);
        // System.out.println("Unsorted : ");
        // System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted : ");
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        boolean swap = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                return;
        }
    }

    private static void populateArray(int range, int[] arr ) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * range + 1);
        }
    }
}
