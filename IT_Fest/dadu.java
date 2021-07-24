package IT_Fest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dadu {
    public static final int DICE_FACES = 6;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int z = 0; z < n; z++) {
            int x = in.nextInt();
            if (x > 12) {
                System.out.println(0);
                break;
            }

            if (x < 1) {
                System.out.println(0);
                break;
            }

            int res = 0;
            Map<Integer, Integer> maps = new HashMap<>();
            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j < 7; j++) {
                    if (i == j) {
                        if (!maps.containsKey(i)) {
                            maps.put(i, 1);
                        } else {
                            continue;
                        }
                    }
                    if (i + j >= x) {
                        // System.out.println(i + ", " + j);
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }

}
