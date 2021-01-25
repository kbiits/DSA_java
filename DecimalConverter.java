public class DecimalConverter {
    // This program can only convert decimal numbers to base 1 until base 9

    public static void main(String[] args) {
        int base = 2;
        int number = 5;
        String result = convert(number, base);
        System.out.println("With returning value : " + result);
        System.out.print("Without returning value : ");
        convert2(number, base);
    }

    // helper (driver) method for returning value
    private static String convert(int number, int base) {
        return convertHelper(number, base);
    }
    
    // helper (driver) method for non returning value
    private static void convert2(int number, int base) {
        convertHelper2(number, base);
        System.out.println();
    }
    
    // recursive with return value
    private static String convertHelper(int number, int base) {
        if (number < base) {
            return Integer.toString(number);
        }
        int modBasis = number % base;
        int bagiBasis = number / base;
        return convertHelper(bagiBasis, base) + Integer.toString(modBasis);
    }

    // recursive without return value
    private static void convertHelper2(int number, int base) {
        if (number < base) {
            System.out.print(number);
        } else {
            int modBasis = number % base;
            int bagiBasis = number / base;
            convertHelper2(bagiBasis, base);
            System.out.print(modBasis);
        }
    }
}
