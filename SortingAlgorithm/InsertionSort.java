package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[15];
        PopulateArray.populateArray(100, arr);
        System.out.println("---------------------------------------------");
        System.out.println("Using general insertion sort");
        System.out.println("Unsorted : ");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------------------");
        System.out.println("Using binary insertion sort");
        int[] arr2 = new int[15];
        PopulateArray.populateArray(100, arr2);
        System.out.println("Unsorted : ");
        System.out.println(Arrays.toString(arr2));
        binarySort(arr2);
        System.out.println("Sorted : ");
        System.out.println(Arrays.toString(arr2));
        System.out.println("---------------------------------------------");
    }

    // this is not the best solution, because you have do theta n squared for swaps and compares, we can do something better using binary search in our code, so we do theta n log n for compares
    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j - 1] > arr[j]) { // compare the pair of numbers, if they in wrong order, so swap them 
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // this is using binary search, also called binary insertion sort
    private static void binarySort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int srcPos = Math.abs(Arrays.binarySearch(arr, 0, i, key) + 1); // find right position for arr[i] (key)

            System.arraycopy(arr, srcPos, arr, srcPos + 1, i - srcPos); // copy the arr[srcPos] to arr[srcPos + 1] (shifting it to right, it doesn't actually shift, but we copy the value to right)

            arr[srcPos] = key; // change the value of arr[srcPos] to key
        }
    }
}
