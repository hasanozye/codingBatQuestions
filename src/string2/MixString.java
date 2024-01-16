package string2;

public class MixString {

    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }


    /**
     * Combines two input strings by interleaving their characters.
     * If one string is longer than the other, the remaining characters
     * from the longer string are appended at the end of the result.
     *
     * @param a The first input string.
     * @param b The second input string.
     * @return A new string formed by interleaving characters from the input strings.
     */
    public static String mixString(String a, String b) {
        // Convert input strings to character arrays
        char[] chA = a.toCharArray();
        char[] chB = b.toCharArray();

        // Find the length of the longer string
        int biggerLength = Math.max(chA.length, chB.length);

        // Initialize an empty string to store the result
        String result = "";

        // Iterate through the characters of both strings simultaneously
        for (int i = 0; i < biggerLength; i++) {
            // Append character from the first string if it exists
            if (i < chA.length) {
                result += chA[i];
            }

            // Append character from the second string if it exists
            if (i < chB.length) {
                result += chB[i];
            }
        }

        // Return the final interleaved string
        return result;
    }


}
