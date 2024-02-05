package string1;

public class FizzString {

    public static void main(String[] args) {
        System.out.println(fizzString("fig")); //→ "Fizz"
        System.out.println(fizzString("dib")); //→ "Buzz"
        System.out.println(fizzString("fib")); //→ "FizzBuzz"
    }


    public static String fizzString(String str) {

        boolean startsWith = str.startsWith("f");
        boolean endsWith = str.endsWith("b");

        if(startsWith && endsWith){

            return "FizzBuzz";

        }else if(startsWith){

            return "Fizz";

        }else if(endsWith){

            return "Buzz";
        }else{

            return str;
        }

        /*for (int i = 0; i < str.length(); i++) {

            if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {

                return "FizzBuzz";
            } else if (str.charAt(0) == 'f') {

                return "Fizz";
            } else if (str.charAt(str.length() - 1) == 'b') {

                return "Buzz";
            }

        }

        return "";*/

    }
}
