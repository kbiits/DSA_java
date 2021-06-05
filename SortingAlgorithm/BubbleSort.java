import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        PopulateArray.populateArray(100, arr);
        // System.out.println("Unsorted : ");
        // System.out.println(Arrays.toString(arr));
        // recursionSort(arr);
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

    // recursion sort have a limit in the size of arrays, because recursion use a lot of memory, so it will return the error if the size of arrays is bigger then what should it be
    public static void recursionSort(int[] arr) {
        recursionSort(arr, arr.length);
    }

    public static void recursionSort(int[] arr, int n) {
        if (n == 1)
            return;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        recursionSort(arr, n - 1);
    }
}