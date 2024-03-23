package string3;

public class EqualIsNot {

    public static void main(String[] args) {

        System.out.println(equalIsNot("isnotis")); // -> false
        System.out.println(equalIsNot("isisnotno7Not")); // -> false
        System.out.println(equalIsNot("This is not")); // -> false
        System.out.println(equalIsNot("This is notnot")); // -> true
        System.out.println(equalIsNot("noisxxnotyynotxisi")); // -> true


    }


    public static boolean equalIsNot(String str) {

        int isCount = 0;
        int notCount = 0;
        for (int i = 0; i < str.length() - 1; i++) { // Adjusted to check up to the second last character for "is"
            if (i <= str.length() - 3 && str.substring(i, i + 3).equals("not")) {
                notCount++;
            }
            if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                isCount++;
            }
        }

        return isCount == notCount;
    }


}
