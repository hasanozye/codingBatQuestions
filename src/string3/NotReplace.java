package string3;

public class NotReplace {

    public static String notReplace(String str) {
        // Use regular expression with word boundary (\b) to find standalone "is"
        // and replace with "is not"
//        return str.replaceAll("\\bis\\b", "is not");
        String fin = "";
        int i = 0;
        while (i < str.length()) {
            if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1)) // Önceki karakter bir harf mi?
                    || i + 2 < str.length() && Character.isLetter(str.charAt(i + 2)) // Sonraki karakter bir harf mi?
                    || !str.substring(i).startsWith("is")) { // Mevcut pozisyondan itibaren "is" ile mi başlıyor?
                fin += str.charAt(i);
                i++;
            } else {
                fin += "is not"; // "is" yerine "is not" ekleyin
                i += 2; // "is" iki karakter uzunluğunda olduğu için, iki karakter atlayın
            }
        }
        return fin;
    }

    public static void main(String[] args) {
        // Test the method with given examples
        System.out.println(notReplace("This is right")); // should print "This is not right"
        System.out.println(notReplace("is test")); // should print "is not test"
        System.out.println(notReplace("is-is")); // should print "is not-is not"
    }
}
