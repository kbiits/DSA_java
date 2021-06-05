import java.util.Arrays;

/**
 * SelectionSort1
 */
public class SelectionSort1 {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            // asumsikan nilai minimum sbg nilai di index ke i
            int min = arr[i];
            int idxMin = i;

            // Check nilai minimum
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idxMin = j;
                }
            }

            if (idxMin != i) {
                // Swapping here
                int temp = arr[i];
                arr[i] = min;
                arr[idxMin] = temp;
                System.out.println(Arrays.toString(arr));
                System.out.println("swapp");
            }
        }
    }

}