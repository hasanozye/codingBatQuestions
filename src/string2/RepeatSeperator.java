package string2;

public class RepeatSeperator {
    public static void main(String[] args) {
        System.out.println(repeatSeperator("Word", "X", 3)); // "WordXWordXWord"
        System.out.println(repeatSeperator("This", "And", 2));// → "ThisAndThis"
        System.out.println(repeatSeperator("This", "And", 1));// → "This"

    }

    public static String repeatSeperator(String word, String sep, int count) {

        String result = "";

        for (int i = 0; i < count; i++) {

            if (i == count - 1){
                result += word;
            }else{
                result += word + sep;
            }



        }

        return result;


    }


}
