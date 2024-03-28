package string3;

public class MirrorEnds {

    public static void main(String[] args) {

        System.out.println(mirrorEnds("abXYZba")); // -> "ab"
        System.out.println(mirrorEnds("abca")); // -> "a"
        System.out.println(mirrorEnds("aba")); // -> "aba"

    }


    public static String mirrorEnds(String str) {

        String best = "";
        for (int i = 1; i <= str.length(); i++) {
            String sub = str.substring(0, i);
            if (str.startsWith(sub) && str.endsWith(reverse(sub))) {
                best = sub;
            }
        }

        return best;


    }

    private static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
