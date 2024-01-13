package string2;

public class CountHi {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho")); // Output: 1
        System.out.println(countHi("ABChi hi"));  // Output: 2
        System.out.println(countHi("hihi"));      // Output: 2
    }

    public static int countHi(String str) {
        int count = 0;

        // Iterate through the string
        for (int i = 0; i < str.length() - 1; i++) {
            // Check if the substring starting at index i is "hi"
            if (str.startsWith("hi", i)) {
                count++;
            }
        }

        return count;
    }
}

