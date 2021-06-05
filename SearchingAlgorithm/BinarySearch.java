/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 6, 7, 8, 9, 10, 11, 14, 19, 21, 28, 31, 35, 39 };
        int res = searchWithoutRecursion(array, 31);
        System.out.println(res);
        int len = array.length - 1;
        int res2 = searchWithRecursion(array, 4, 0, len);
        System.out.println(res2);
    }

    public static int searchWithoutRecursion(int[] array, int find) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == find) {
                return mid;
            } else if (array[mid] < find) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int searchWithRecursion(int[] array, int find, int low, int high) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (array[mid] == find) {
                return mid;
            } else if (array[mid] < find)
                return searchWithRecursion(array, find, mid + 1, high);
            else
                return searchWithRecursion(array, find, low, mid - 1);
        } else
            return -1;
    }
}