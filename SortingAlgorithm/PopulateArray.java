public class PopulateArray {
    public static void populateArray(int range, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * range + 1);
        }
    }
}
