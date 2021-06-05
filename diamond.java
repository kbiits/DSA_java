import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();

        // Segitiga Atas
        for (int i = 0; i < n; i++) {
            // Print spasi
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print Bintang
            for (int j = 1; j < 2 * (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Segitiga Bawah
        for (int i = n - 1; i > 0; i--) {
            // Print Spasi
            for (int j = 0; j <= n - 1 - i; j++) {
                System.out.print(" ");
            }
            // Print Bintang
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
