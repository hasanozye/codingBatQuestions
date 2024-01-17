package string2;

public class XyzThere {

    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }

    public static boolean xyzThere(String str) {

        int index = 0;


        while((index = str.indexOf("xyz",index)) != 1){

            return str.charAt(index - 1) != '.';



        }
        return false;
    }


}
