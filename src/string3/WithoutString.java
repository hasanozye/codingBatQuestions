package string3;

public class WithoutString {

    public static void main(String[] args) {

        System.out.println(withoutString("Hello there", "llo")); // -> "He there"
        System.out.println(withoutString("Hello there", "e")); // -> "Hllo thr"
        System.out.println(withoutString("Hello there", "x")); // -> "Hello there"

    }


    public static String withoutString(String base, String remove) {

        String result = "";
        int index = 0;
        int removeLength = remove.length();

        // Convert both strings to the same case to ignore case during comparison
        String lowerBase = base.toLowerCase();
        String lowerRemove = remove.toLowerCase();

        while (index < base.length()) {
            // Check if the current substring matches the 'remove' string (ignoring case)
            if (index <= base.length() - removeLength && lowerBase.substring(index, index + removeLength).equals(lowerRemove)) {
                // Skip over the 'remove' string
                index += removeLength;
            } else {
                // Append the current character to 'result' and move to the next character
                result += base.charAt(index);
                index++;
            }
        }

        return result;

    }
}
