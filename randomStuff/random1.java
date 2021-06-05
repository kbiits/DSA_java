import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class random1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);

        while (true) {
            int n = in.nextInt();
            if (n < 0) {
                arr.add(-n);
                break;
            } else {
                arr.add(n);
            }
        }
        double avg = avg(arr);
        int belowAvg = 0;
        int aboveAvg = 0;

        // Check the value is below the avg or above the avg
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < avg)
                belowAvg++;
            else
                aboveAvg++;
        }
        System.out.println("Nilai Rata-Rata : " + avg);
        System.out.println("Jumlah Nilai dibawah rata rata : " + belowAvg);
        System.out.println("Jumlah Nilai diatas rata rata : " + aboveAvg);
        in.close();
    }

    private static double avg(List<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum / arr.size();
    }
}
