import java.util.Scanner;
public class KPK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int a = in.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int b = in.nextInt();
        int kpk = kpk(a, b);
        System.out.printf("KPK dari %d dan %d ialah %d\n", a, b, kpk);
        in.close();
    }
    public static int kpk(int a, int b) {
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        int max = a > b ? a : b;
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }
}