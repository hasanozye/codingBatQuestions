package string2;

public class PrefixAgain {

    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2));// → true
        System.out.println(prefixAgain("abXYabc", 3));// → false
        System.out.println(prefixAgain("xyzxyxyxy", 2));// → true
    }


    public static boolean prefixAgain(String str, int n){

        String subStr = str.substring(0,n);
        String endStr = str.substring(n);
        boolean flag = false;

        for (int i = n; i < str.length(); i+=n) {

            if(endStr.contains(subStr)){

                flag = true;
                break;
            }

        }

        return flag;
    }

}
