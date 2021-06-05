public class Factorial {

    public static void main(String[] args) {
        fact(4);
    }
    
    public static void fact(int n) {
        System.out.println(fact_aux(n, 1));
        System.out.println(otherFactorial(4));
    }

    public static int fact_aux(int n, int result) {
        if(n == 1) {
            return result;
        }

        return fact_aux(n-1, n * result);

    }

    public static int otherFactorial(int n) {
        if(n <= 1) return 1;

        return n * otherFactorial(n-1);
    }

}
