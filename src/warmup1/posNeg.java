package warmup1;

public class posNeg {

    public static void main(String[] args) {
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true));
        String ab = "sadsasa";
        String substring = ab.substring(2);
        System.out.println(substring);

        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));

        String x = "adlkasdjlasd lasdlksadksa";
        String s = x.replaceAll(" ", "");
        System.out.println(s);

        /*Count the number of "xx" in the given string.
        We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
         */

        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
        System.out.println(countXX("Hexxo thxxe"));


    }

    /*
    Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
     */
    public String everyNth(String str, int n) {

        while (n < str.length()) {
            return str.substring(n);
        }
        return "";


    }
    static int countXX(String str) {
        String replacedX = str.replaceAll(" ", "");
        boolean xContains = replacedX.contains("x");
        int count = 0;
        if (xContains) {
            for (int i = 0; i < replacedX.length(); i++) {
                if (replacedX.charAt(i) == 'x') {
                    count++;
                }
            }
        } else if (!xContains) {
            return 0;
        }
        return count - 1;

    }



/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.

 */

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);


    }

}
