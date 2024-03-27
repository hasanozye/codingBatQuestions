package string3;

public class SameEnds {

    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab")); // -> "ab"
        System.out.println(sameEnds("xx")); // -> "x"
        System.out.println(sameEnds("xxx")); // -> "x"
    }


    public static String sameEnds(String string) {

        // The maximum length for a non-overlapping substring is half the length of the string string
        int maxLen = string.length() / 2;

        for (int len = maxLen; len > 0; len--) {
            // Get the potential substring from the beginning
            String start = string.substring(0, len);
            // Get the potential substring from the end
            String end = string.substring(string.length() - len);
            // If they match, we've found the longest non-overlapping substring
            if (start.equals(end)) {
                return start;
            }
        }

        // If no matching substring is found, return an empty string
        return "";



    }

}
