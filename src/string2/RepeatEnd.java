package string2;

public class RepeatEnd {

    public static void main(String[] args) {

        System.out.println(repeatEnd("Hello", 3)); //→ "llollollo"
        System.out.println(repeatEnd("Hello", 2)); //→ "lolo"
        System.out.println(repeatEnd("Hello", 1)); //→ "o"
    }

    /**
     * Returns a new string made of n repetitions of the last n characters of the input string.
     *
     * @param str The input string.
     * @param n   The number of repetitions. Must be between 0 and the length of the string, inclusive.
     * @return A string made of n repetitions of the last n characters of the input string.
     */
    public static String repeatEnd(String str, int n) {
        // Calculate the starting index for the last n characters
        int startIndex = str.length() - n;

        // Extract the last n characters of the string
        String lastNChars = str.substring(startIndex);

        // Initialize an empty string to store the result
        String result = "";

        // Repeat the last n characters n times and concatenate them to the result
        for (int i = 0; i < n; i++) {
            result += lastNChars;
        }

        return result;
    }

}
