public class tes {
    public static void main(String[] args) {
        // String s = "asidh2 aoisdn12";
        // String[] arr = s.split("[^0-9]+");
        // int result = 0;
        // for (String i : arr) {
        //     if (i.length() > 0) {
        //         int temp = Integer.parseInt(i);
        //         result += temp;
        //     }
        // }
        // System.out.println(result);
        String tes = convert(159, 5);
        System.out.println(tes);
        convert2(159, 5);
    }

    private static String convert(int angka, int basis) {
        String hasil = convertHelper(angka, basis);
        return hasil;
    }
    
    private static void convert2(int angka, int basis) {
        convertHelper2(angka, basis);
        System.out.println();
    }
    
    // recursive with return value
    private static String convertHelper(int angka, int basis) {
        if (angka < basis) {
            return Integer.toString(angka);
        }
        int modBasis = angka % basis;
        int bagiBasis = angka / basis;
        return convertHelper(bagiBasis, basis) + Integer.toString(modBasis);
    }

    // recursive without return value
    private static void convertHelper2(int angka, int basis) {
        if (angka < basis) {
            System.out.print(angka);
        } else {
            int modBasis = angka % basis;
            int bagiBasis = angka / basis;
            convertHelper2(bagiBasis, basis);
            System.out.print(modBasis);
        }
    }
}
