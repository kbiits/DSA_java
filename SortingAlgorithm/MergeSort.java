package SortingAlgorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        PopulateArray.populateArray(100, arr);
        // System.out.println("Unsorted : ");
        // System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Sorted : ");
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd)
            return;
        int mid = (leftStart + rightEnd) / 2;
        mergeSort(arr, leftStart, mid);
        mergeSort(arr, mid + 1, rightEnd);
        merge(arr, leftStart, rightEnd, mid);
    }

    private static void merge(int[] arr, int leftStart, int rightEnd, int mid) {

        // count the size of left and right arrays
        int lSize = (mid - leftStart) + 1;
        int rSize = (rightEnd - mid);

        // init temporary arrays
        int[] lArr = new int[lSize];
        int[] rArr = new int[rSize];

        // copy data to temporary arrays
        for (int i = 0; i < lSize; i++)
            lArr[i] = arr[i + leftStart];
        for (int i = 0; i < rSize; i++)
            rArr[i] = arr[mid + 1 + i];

        // merge the left and right arrays

        // compare the left and right elements
        int lPointer = 0, rPointer = 0, arrPointer = leftStart;
        while (lPointer < lSize && rPointer < rSize) {
            if (lArr[lPointer] <= rArr[rPointer])
                arr[arrPointer] = lArr[lPointer++];
            else
                arr[arrPointer] = rArr[rPointer++];
            arrPointer++;
        }

        // copy the rest of left elements if right array is empty
        while (lPointer < lSize)
            arr[arrPointer++] = lArr[lPointer++];
        // copy the rest of right elements if left array is empty
        while (rPointer < rSize)
            arr[arrPointer++] = rArr[rPointer++];
    }
}
