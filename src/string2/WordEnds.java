package string2;

public class WordEnds {


    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));// → "c13i"
        System.out.println(wordEnds("XY123XY", "XY"));// → "13"
        System.out.println(wordEnds("XY1XY", "XY"));// → "11"
    }


    public static String wordEnds(String str, String word){

        String result = "";
        int wordLen = word.length();

        for (int i = 0; i < str.length(); i++) {
            if (i + wordLen <= str.length() && str.substring(i, i + wordLen).equals(word)) {
                // Check if there is a character before the word
                if (i > 0) {
                    result += str.charAt(i - 1);
                }

                // Check if there is a character after the word
                if (i + wordLen < str.length()) {
                    result += str.charAt(i + wordLen);
                }

                i += wordLen - 1; // Move index to the end of the word
            }
        }

        return result;

    }
}
