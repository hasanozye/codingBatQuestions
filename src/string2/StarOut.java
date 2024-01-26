package string2;

public class StarOut {

    public static String starOut(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                // Skip the current star and its adjacent characters
                continue;
            }

            boolean isStarLeft = (i > 0 && str.charAt(i - 1) == '*');
            boolean isStarRight = (i < str.length() - 1 && str.charAt(i + 1) == '*');

            if (!isStarLeft && !isStarRight) {
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(starOut("ab*cd"));    // Output: "ad"
        System.out.println(starOut("ab**cd"));   // Output: "ad"
        System.out.println(starOut("sm*eilly"));  // Output: "silly"
        System.out.println(starOut("sm*eil*ly")); // Output: "siy"
        System.out.println(starOut("sm**eil*ly"));// Output: "siy"
        System.out.println(starOut("sm***eil*ly"));// Output: "siy"
        System.out.println(starOut("stringy*"));  // Output: "string"
        System.out.println(starOut("*stringy"));  // Output: "tringy"
        System.out.println(starOut("*str*in*gy"));// Output: "ty"
        System.out.println(starOut("abc"));        // Output: "abc"
        System.out.println(starOut("a*bc"));       // Output: "c"
        System.out.println(starOut("ab"));         // Output: "ab"
        System.out.println(starOut("a*b"));        // Output: ""
        System.out.println(starOut("a"));          // Output: "a"
    }
}