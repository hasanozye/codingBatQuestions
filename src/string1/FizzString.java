package string1;

public class FizzString {

    public static void main(String[] args) {

    }


    public static String fizzString(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {

                return "FizzBuzz";
            } else if (str.charAt(0) == 'f') {

                return "Fizz";
            } else if (str.charAt(str.length() - 1) == 'b') {

                return "Buzz";
            }

        }

        return "";

    }
}
