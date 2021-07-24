package CP.srifoton2020;

import java.util.*;

/**
 * ArrayBerjalan
 */
public class ArrayBerjalan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int z = in.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

           
    }

    public static int solution(int[] arr, int n, int k, int z) {
        int skor = arr[1];
        int limitWalkToLeft = 0;
        boolean walkedToLeft = false;
        for(int i = 0, idx = 1; i < k; i++, idx++) {
            if(!walkedToLeft && arr[idx - 1] > arr[idx + 1] && limitWalkToLeft < z) {
                limitWalkToLeft++;
                skor += arr[idx-1];
                walkedToLeft = true;
                i++;
            }
            if((idx + 1) < arr.length) {
                walkedToLeft = false;
                skor += arr[idx+1];
            }
        }
        return skor;
    }

    public static void debug(int[] arr, int n, int k, int z) {
        int skor = arr[1];
        int limitWalkToLeft = 0;
        boolean walkedToLeft = false;
        for(int i = 0, idx = 1; i < k; i++, idx++) {
            System.out.println("Skor saat ini  = " + skor);
            if(!walkedToLeft && arr[idx - 1] > arr[idx + 1] && limitWalkToLeft < z) {
                System.out.println("walked to left");
                limitWalkToLeft++;
                skor += arr[idx-1];
                walkedToLeft = true;
                i++;
            }
            if((idx + 1) < arr.length) {
                walkedToLeft = false;
                skor += arr[idx+1];
            }
        }
        System.out.println("Hasil akhir  = " + skor);
    }
}