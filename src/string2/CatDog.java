package string2;

public class CatDog {
    public static void main(String[] args) {
        System.out.println(catDog("catdog"));      // Output: true
        System.out.println(catDog("catcat"));      // Output: false
        System.out.println(catDog("1cat1cadodog")); // Output: true
    }

    public static boolean catDog(String str) {
        // Count the occurrences of "cat" and "dog"
        int catCount = countSubstringOccurrences(str, "cat");
        int dogCount = countSubstringOccurrences(str, "dog");

        // Check if the counts are the same
        return catCount == dogCount;
    }

    // Helper method to count the occurrences of a substring in a string
    private static int countSubstringOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        // Iterate through the string and count occurrences of the substring
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }
}

