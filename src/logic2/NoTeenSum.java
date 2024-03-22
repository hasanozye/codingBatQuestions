package logic2;

public class NoTeenSum {

    public static void main(String[] args) {

        System.out.println(noTeenSum(16, 17, 18)); // 16
        System.out.println(noTeenSum(1, 2, 3)); // 6
        System.out.println(noTeenSum(2, 13, 1)); // 3
        System.out.println(noTeenSum(2, 1, 14)); // 3

    }


    public static int noTeenSum(int a, int b, int c) {


        if ((a >= 13 && a <= 19)) {

            a = fixTeen(a);
        }
        if (b >= 13 && b <= 19) {

            b = fixTeen(b);

        }
        if (c >= 13 && c <= 19) {

            c = fixTeen(c);
        }

        return a + b + c;


    }

    public static int fixTeen(int n) {

        if (n == 15 || n == 16) {

            return n;
        } else {

            return 0;
        }

    }


}
