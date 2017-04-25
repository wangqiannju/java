package string;

public class DetectCapital {

    /**
     * All letters in this word are capitals, like "USA".
    All letters in this word are not capitals, like "leetcode".
    Only the first letter in this word is capital if it has more than one letter, like "Google".
     * 
     * @param word
     * @return
     */
    public static boolean detectCapitalUse(String word) {
        boolean upper = false;
        boolean lower = false;
        boolean laterUpper = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                upper = true;
                if (i > 0) {
                    laterUpper = true;
                }
            }

            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                lower = true;
            }
        }

        if ((upper && !lower) || (!upper && lower) || (upper && !laterUpper)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(1 << 3);

        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("A"));
        System.out.println(detectCapitalUse("a"));
        System.out.println(detectCapitalUse("USa"));
        System.out.println(detectCapitalUse("leetcodeA"));

    }

}
