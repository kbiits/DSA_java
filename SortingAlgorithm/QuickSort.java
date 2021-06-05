import java.util.Arrays;

class QuickSort {
    public static void main(String[] args) {
        int[] array = { 3, 2, 9, 1, 5, 7, 99, 123, 124,4324, 123, 123};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);
        sort(arr, left, index - 1);
        sort(arr, index, right);
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            // Move left pointer to right until find a value that greater than the pivot value
            while (arr[left] < pivot) {
                left++;
            }

            // Move right pointer to left until find a value that less than the pivot value
            while (arr[right] > pivot) {
                right--;
            }

            // Swap
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }

        }
        return left;
    }
}