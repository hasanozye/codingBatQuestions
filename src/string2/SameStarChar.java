package string2;

public class SameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));// → true
        System.out.println(sameStarChar("xy*zzz"));// → false
        System.out.println(sameStarChar("*xa*az"));// → true
    }


    public static boolean sameStarChar(String str){

        int len = str.length();

        for (int i = 1; i < len-1; i++) {

            if (str.charAt(i) == '*'){

                if (str.charAt(i-1) != str.charAt(i+1)){
                    return false;
                }
            }

        }
        return true;
    }

}
