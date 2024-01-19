package string2;

public class RepeatFront {
    public static void main(String[] args) {

        System.out.println(repeatFront("Chocolate", 4));// → "ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3));// → "ChoChC"
        System.out.println(repeatFront("Ice Cream", 2));// → "IcI"


    }


    public static String repeatFront(String str, int n) {

        String subs = str.substring(0, n);
        String result = "";

        for (int i = n; i > 0; i--) {

            result = result + subs.substring(0, i);


        }

        return result;
    }

}
