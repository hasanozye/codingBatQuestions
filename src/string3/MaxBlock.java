package string3;

public class MaxBlock {

    public static void main(String[] args) {

        System.out.println(maxBlock("hoopla")); // -> 2
        System.out.println(maxBlock("abbCCCddBBBxx")); // -> 3
        System.out.println(maxBlock("")); // -> 0

    }


    public static int maxBlock(String str) {

        if (str.isEmpty()) return 0; // Immediately return 0 for empty strings

        int maxBlockLength = 1; // The maximum block length found, starts at 1 for non-empty strings
        int currentBlockLength = 1; // The length of the current block being inspected

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                // If the current character is the same as the previous one, increase the length of the current block
                currentBlockLength++;
                // Update maxBlockLength if the current block is longer than any previously found
                if (currentBlockLength > maxBlockLength) {
                    maxBlockLength = currentBlockLength;
                }
            } else {
                // Reset the current block length to 1 when encountering a different character
                currentBlockLength = 1;
            }
        }

        // If the string was empty, maxBlockLength would still be 1, which is incorrect, so adjust the return value
        return str.isEmpty() ? 0 : maxBlockLength;
    }
}
