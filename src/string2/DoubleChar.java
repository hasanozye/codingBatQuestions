package string2;

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));      // Output: "TThhee"
        System.out.println(doubleChar("AAbb"));     // Output: "AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); // Output: "HHii--TThheerree"
    }

    public static String doubleChar(String str) {
        // Initialize an empty string to store the result
        String result = "";

        // Iterate through each character in the original string
        for (int i = 0; i < str.length(); i++) {
            // Append the character twice to the result
            result = result + str.charAt(i) + str.charAt(i);
        }

        // Return the result
        return result;
    }
}

