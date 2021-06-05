import java.util.Scanner;

public class TumpukanBatu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nTumpukan = in.nextInt();
        int[] arr = new int[nTumpukan];
        int totalBatu = 0;
        for (int i = 0; i < nTumpukan; i++) {
            arr[i] = in.nextInt();
            totalBatu += arr[i];
        }
        int[] sudahDipilih = new int[nTumpukan];
        int pemenang = -1;
        outerloop: for (int i = 0; i < nTumpukan; i++) {
            for (int j = 0; j < 2; j++) {
                // Kalau belum dipilih dan batunya masih ada (lebih dari 0)
                if (arr[i] > 0 && sudahDipilih[i] != 1) {
                    arr[i]--;
                    sudahDipilih[i] = 1;
                } else {
                    boolean berhasilMenemukanTumpukanTidakKosong = false;
                    // Cari di tumpukan lain
                    innerloop: for (int k = i + 1, temp = (i + 1) % arr.length; k < arr.length; k++, temp++) {
                        if (arr[temp] > 0) {
                            sudahDipilih[temp] = 1;
                            arr[temp]--;
                            berhasilMenemukanTumpukanTidakKosong = true;
                            break innerloop;
                        }
                    }
                    if (!berhasilMenemukanTumpukanTidakKosong) {
                        pemenang = j == 0 ? 1 : 0;
                        break outerloop;
                    }
                }
            }
        }

        System.out.println(pemenang == 0 ? "Dora" : "Boots");
    }
}
