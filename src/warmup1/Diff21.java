package warmup1;

public class Diff21 {

    public static void main(String[] args) {

        System.out.println(diff21(19));  //→ 2
        System.out.println(diff21(10));  //→ 11
        System.out.println(diff21(21));  //→ 0


    }


    public static int diff21(int n) {
        if (n > 21) {
            return 2 * (Math.abs(n - 21));
        }
        return Math.abs(n - 21);
    }


}
