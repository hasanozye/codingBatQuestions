package string2;

public class OneTwo {

    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));// → "bca"
        System.out.println(oneTwo("tca"));// → "cat"
        System.out.println(oneTwo("tcagdo"));// → "catdog"
    }

    public static String oneTwo(String str) {

        int len = str.length();
        String result = "";
        char ch = 0;


        for (int i = 0; i <= len - 3; i += 3) {


            result += str.substring(i + 1, i + 3);
            ch = str.charAt(i);
        }

        return result + ch;
        //TODO: solve this problem for edge cases

    }
}
