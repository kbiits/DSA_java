package IT_Fest;

import java.util.Scanner;

public class hmif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ori = in.nextLine();
        StringBuilder str = new StringBuilder(ori);
        String key = "HMIF";
        int result = 0;
        while (true) {
            var res = str.indexOf(key);
            if (res == -1) {
                break;
            } else {
                result++;
                str.delete(res, res + 4);
            }
        }
        System.out.println(result);
    }
}
