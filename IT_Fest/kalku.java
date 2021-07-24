package IT_Fest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class kalku {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String statement = in.nextLine();
            var a = statement.split(" ");
            int remainder = 0;
            int result = 0;
            for (int j = 0; j < a.length; ) {
                if (Pattern.matches("\\d+", a[remainder]) && Pattern.matches("\\d+", a[remainder + 1])) {
                    int el1 = Integer.parseInt(a[remainder]);
                    int el2 = Integer.parseInt(a[remainder + 1]);
                    String op = a[remainder + 2];
                    if (op.equals("+")) {
                        result += el1 + el2;
                    } else if (op.equals("*")) {
                        result += el1 * el2;
                    } else if (op.equals("/")) {
                        result += el1 / el2;
                    } else if (op.equals("-")) {
                        result += el1 - el2;
                    }
                    remainder += 3;
                    j += 3;
                } else if (Pattern.matches("\\d+", a[remainder])) {
                    int el2 = Integer.parseInt(a[remainder]);
                    String op = a[remainder + 1];
                    if (op.equals("+")) {
                        result += el2;
                    } else if (op.equals("*")) {
                        result *= el2;
                    } else if (op.equals("/")) {
                        result /= el2;
                    } else if (op.equals("-")) {
                        result -= el2;
                    }
                    remainder += 2;
                    j += 2;
                }
            }
            System.out.println(result);
        }
    }
}
