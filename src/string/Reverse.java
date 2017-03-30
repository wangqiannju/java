package string;

public class Reverse {

    public static String reverseString(String s) {
        if (s == null)
            return s;
        return new StringBuffer(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("HELLO"));
        System.out.println(reverseString(""));
    }

}
