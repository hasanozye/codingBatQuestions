package warmup1;

public class NearHundred {

    public static void main(String[] args) {

        System.out.println(nearHundred(93)); //→ true
        System.out.println(nearHundred(90)); //→ true
        System.out.println(nearHundred(89)); //→ false


    }

    public static boolean nearHundred(int n) {
        boolean flag = false;
        if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
            return !flag;
        }
        return flag;


    }


}
