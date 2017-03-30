package string;

public class LengthofLastWord {

    public static int lengthOfLastWord(String s) {
        if (s == null)
            return 0;
        String a[] = s.split(" ");
        if (a.length < 1)
            return 0;
        return a[a.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(null));
        System.out.println(lengthOfLastWord("   "));
        System.out.println(lengthOfLastWord("123"));
        System.out.println(lengthOfLastWord("hello world"));
        System.out.println(lengthOfLastWord("hello worldworld   "));

    }
}
