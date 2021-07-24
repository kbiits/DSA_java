package CP.srifoton2020;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MalingKorekApi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[m][2];

        for (int i = 0; i < m; i++) {
            int jumlahKotak = in.nextInt();
            int jumlahKorekDiKotak = in.nextInt();
            arr[i][0] = jumlahKotak;
            arr[i][1] = jumlahKorekDiKotak;
        }
        int result = solve(arr, n);
        System.out.println(result);
    }

    public static int solve(int[][] arr, int jumlahKotakYgBisaDibawa) {
        Sort2DArrayBasedOnColumnNumber(arr, 1);
        int sum = 0;
        for (int[] i : arr) {
            if (jumlahKotakYgBisaDibawa <= 0)
                break;
            if(jumlahKotakYgBisaDibawa - i[0] <= 0) {
                sum += jumlahKotakYgBisaDibawa * i[1];
                break;
            }
            sum += i[0] * i[1];
            jumlahKotakYgBisaDibawa -= i[0];
        }
        return sum;
    }

    public static void Sort2DArrayBasedOnColumnNumber(int[][] array, final int columnNumber) {
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] arg0, int[] arg1) {
                if (arg0[columnNumber] > arg1[columnNumber])
                    return -1;
                else
                    return 1;
            }
        });
    }

}
