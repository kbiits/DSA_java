public class StringCombination {
    public static void main(String[] args) {
        recursion(5);

    }

    private static void recursion(int n) {
        char[] a = new char[n];
        for (int i = 0; i < n; i++) {
            int temp = 'a' + i;
            a[i] = (char) temp;
        }
        String res = recursionDriver(n, a, " ");
        System.out.println(res);
    }

    private static String recursionDriver(int n, char[] a, String separator) {
        String temp = "";
        if (n == 0)
            return separator;
        for (char c : a) {
            String temp2 = separator + c;
            temp = temp + recursionDriver(n - 1, a, temp2);
        }
        return temp;
    }
}
