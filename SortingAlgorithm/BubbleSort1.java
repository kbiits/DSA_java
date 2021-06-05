import java.util.Arrays;

/**
 * BubbleSort1
 */
public class BubbleSort1 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 9 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        // arr = 2 1 3 4 8 7
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            System.out.print("Looping i ke -> " + i + "\n");
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) // cek apakah isswapped false
                return;
        }
    }
}