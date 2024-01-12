package string2;

public class EndOther {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));      // Output: true
        System.out.println(endOther("AbC", "HiaBc"));     // Output: true
        System.out.println(endOther("abc", "abXabc"));    // Output: true
    }

    public static boolean endOther(String a, String b) {
        String loweredA = a.toLowerCase();
        String loweredB = b.toLowerCase();


        if (a.length() > b.length()) {
            return loweredA.substring(a.length() - b.length()).equals(loweredB);
        } else {
            return loweredB.substring(b.length() - a.length()).equals(loweredA);
        }

        /*Alternative approach;
        // Convert both strings to lowercase for case-insensitive comparison
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();

        // Check if either string appears at the very end of the other
        return lowerA.endsWith(lowerB) || lowerB.endsWith(lowerA);

         */
    }
}

