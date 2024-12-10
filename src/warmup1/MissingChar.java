package warmup1;

public class MissingChar {

    public static void main(String[] args) {

        System.out.println(missingChar("kitten", 1)); //→ "ktten"
        System.out.println(missingChar("kitten", 0)); //→ "itten"
        System.out.println(missingChar("kitten", 4)); //→ "kittn"


    }


    public static String missingChar(String str, int n) {

        String front = str.substring(0, n);
        String back = str.substring(n + 1);

        return front + back;
        
    }


}
