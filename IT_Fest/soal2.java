package IT_Fest;
import java.util.*;
public class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int soal = in.nextInt();
            int init = in.nextInt();
            int k = in.nextInt();
            int result = init;
            int temp = init;
            for (int j = 0; j < soal - 1; j++) {
                temp += k;
                result += temp;
            }
            System.out.println(result);
        }
    }
}
