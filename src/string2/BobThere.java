package string2;

public class BobThere {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));   // Output: true
        System.out.println(bobThere("b9b"));      // Output: true
        System.out.println(bobThere("b"));      // Output: false
    }

    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            // Check if "b" is followed by any character and then another "b"
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
}

