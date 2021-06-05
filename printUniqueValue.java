
import java.util.Scanner;

/**
 * set
 */
public class printUniqueValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("input angka : ");
            int n = in.nextInt();
            arr[i] = n;
        }
        printUniqueValues(arr);
        in.close();
    }

    private static void printUniqueValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    isUnique = true;
                } else {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}