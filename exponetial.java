public class exponetial {
    public static void main(String[] args) {
        int n = 4;
        int a = 2;
        int res = recursiveExponential(a, n);
        System.out.println(res);
    }

    private static int recursiveExponential(int a, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0) {
            int temp = recursiveExponential(a, n / 2);
            return temp * temp;
        } else
            return a * recursiveExponential(a, n - 1);
    }

}
