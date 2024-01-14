package string2;

public class XyBalance {

    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }

    /**
     * Checks if for every 'x' in the given string, there is a 'y' that appears later in the string.
     *
     * @param str The input string to be checked.
     * @return true if for every 'x' there is a 'y' later in the string, false otherwise.
     */
    public static boolean xyBalance(String str) {
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is 'x'
            if (str.charAt(i) == 'x') {
                // Flag to keep track of whether 'y' is found after the current 'x'
                boolean foundY = false;

                // Iterate through the remaining characters in the string
                for (int k = i; k < str.length(); k++) {
                    // Check if the current character is 'y'
                    if (str.charAt(k) == 'y') {
                        // Set the flag to true if 'y' is found
                        foundY = true;
                        break;
                    }
                }

                // If 'y' is not found for the current 'x', return false
                if (!foundY) {
                    return false;
                }
            }
        }

        // If all 'x' have a corresponding 'y', return true
        return true;
    }



}

