package IT_Fest;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            String original, reverse = ""; // Objects of String class  
            original = in.next();
            int length = original.length();
            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + original.charAt(i);
            if (original.equals(reverse))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
