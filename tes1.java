import java.util.Scanner;

public class tes1 {
    public static void main(String[] args) {
        // StringBuilder s = new StringBuilder("kebab");
        // StringBuilder pal = new StringBuilder();
        // pal.append(s.reverse());
        // String tempReverse = pal.toString();
        // String temp = s.toString();
        // int end = 0;
        // for (int i = temp.length()-1; i >= 0; i--) {
        //     if(temp.charAt(i) == tempReverse.charAt(temp.length()-1 - i)) {
        //         end = temp.length()-1-i;
        //     }
        // }
        // pal.replace(0, pal.length(), pal.substring(end+1));
        // s.reverse();
        // s.append(pal);
        // System.out.println(s);
        // for (int i=1; i<=6; i++){
        //     for (int j=1; j<=6-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int k=1; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i=1; i<=6; i++){
        //     for (int j=1; j < i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int k=6; k>=i; k--){
        //         System.out.print("*");
        //     }
        //     for (int k=5; k>=i; k--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nilai n : ");
        int n = in.nextInt();
        // piramida atas
        for (int i=1; i<=n-1; i++){
            for (int j=n; j > i; j--){ // print spasi
                System.out.print(" ");
            }
            for (int j=1; j <= i; j++){ // print segitiga  kiri
                System.out.print("*");
            }
            for (int j=1; j <= i-1; j++){ // print segitiga  kanan
                System.out.print("*");
            }
            System.out.println();
        }
        // piramida bawah
        for (int i=1; i<=n; i++){
            for (int j=1; j < i; j++){ // print spasi
                System.out.print(" ");
            }
            for (int k=n-1; k>=i; k--){ // segitiga kiri
                System.out.print("*");
            }
            for (int k=n-1; k>=i-1; k--){ // segitiga kanan
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
