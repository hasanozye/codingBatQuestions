package string2;

public class OneTwo {

    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));// → "bca"
        System.out.println(oneTwo("tca"));// → "cat"
        System.out.println(oneTwo("tcagdo"));// → "catdog"
        System.out.println(oneTwo("abcdefx"));// → "bcaefd"
    }

    public static String oneTwo(String str) {

        int len = str.length();
        String result = "";
        if (len < 3) {
            return result;
        }

        int lastChars = len % 3;


        for (int i = 0; i < len - lastChars; i += 3) {

            String firstCh = str.substring(i, i + 1);
            String otherChs = str.substring(i + 1, i + 3);
            result += otherChs + firstCh;
        }
        return result;

    }
}
