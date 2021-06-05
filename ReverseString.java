public class ReverseString {
    public static void main(String[] args) {

        String myStr = "Gari";
        // System.out.println(myStr.substring(1));

        //create Method and pass and input parameter string 
        String reversed = reverseString(myStr);
        System.out.println("The reversed string is: " + reversed);

    }

    public static String reverseString(String myStr) { // ( ari ( ri .'i' ) )
        if (myStr.isEmpty()) {
            System.out.println("String in now Empty");
            return myStr;
        }
        //Calling Function Recursively
        System.out.println("String to be passed in Recursive Function: " + myStr.substring(1));
        String a = reverseString(myStr.substring(1)) + myStr.charAt(0);
        return a;
        // return reverseString(myStr.substring(1)) + myStr.charAt(0);
    }
}
