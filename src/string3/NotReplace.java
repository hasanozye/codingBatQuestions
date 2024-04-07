package string3;

public class NotReplace {

    public static String notReplace(String str) {
        // Use regular expression with word boundary (\b) to find standalone "is"
        // and replace with "is not"
        return str.replaceAll("\\bis\\b", "is not");
    }

    public static void main(String[] args) {
        // Test the method with given examples
        System.out.println(notReplace("is test")); // should print "is not test"
        System.out.println(notReplace("is-is")); // should print "is not-is not"
        System.out.println(notReplace("This is right")); // should print "This is not right"
    }
}
