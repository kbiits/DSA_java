import java.util.Scanner;

public class FPB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int a = in.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int b = in.nextInt();
        int fpb = fpb(a, b);
        System.out.printf("FPB dari %d dan %d ialah %d\n", a, b, fpb);
        System.out.println(gcd(14, 20));
        in.close();
    }

    public static int fpb(int a, int b) {
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        while (b != a) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}