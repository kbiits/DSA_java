package IT_Fest;

import java.util.*;

public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Map<String, Integer> maps = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            if (maps.containsKey(s)) {
                maps.put(s, (maps.get(s) + 1));
            } else {
                maps.put(s, 0);
            }
        }

        var a = maps.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get()
                .getKey();

        System.out.println(a + " " + (maps.get(a) + 1));
    }
}
