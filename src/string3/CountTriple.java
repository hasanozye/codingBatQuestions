package string3;

public class CountTriple {

    public static void main(String[] args) {

        System.out.println(countTriple("abcXXXabc")); // -> 1
        System.out.println(countTriple("xxxabyyyycd")); // -> 3
        System.out.println(countTriple("a")); // -> 0
    }


    public static int countTriple(String str) {

        if (str.isEmpty()) {
            return 0;
        }
        int countTriples = 0;

        for (int i = 1; i < str.length() - 1; i++) {

            if ((str.charAt(i) == str.charAt(i - 1)) && (str.charAt(i) == str.charAt(i + 1))) {

                countTriples++;
            }

        }

        return countTriples;

    }

}
