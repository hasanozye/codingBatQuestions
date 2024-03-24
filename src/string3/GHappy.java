package string3;

public class GHappy {

    public static void main(String[] args) {

        System.out.println(gHappy("ggxx")); // -> False
        System.out.println(gHappy("xxgggxyg")); // -> False
        System.out.println(gHappy("xxggxx")); // -> True
        System.out.println(gHappy("xxgxx")); // -> False
        System.out.println(gHappy("xxggyygxx")); // -> False

    }


    public static boolean gHappy(String str) {

        // Edge case: If the string is empty or has no 'g', all 'g's are considered happy
        if (!str.contains("g")) {
            return true;
        }

        // Check if the first or last character is a single 'g', which would be unhappy
        if ((str.startsWith("g") && !str.startsWith("gg")) || (str.endsWith("g") && !str.endsWith("gg"))) {
            return false;
        }

        // Iterate through the string, starting from the second character
        for (int i = 1; i < str.length() - 1; i++) {
            // Check if the current character is 'g'
            if (str.charAt(i) == 'g') {
                // If the 'g' is not happy, return false
                if (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                    return false;
                }
            }
        }
        // If the loop completes, all 'g's are happy
        return true;

    }


}
