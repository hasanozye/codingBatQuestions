package logic2;

public class LuckySum {

    public static void main(String[] args) {

        System.out.println(luckSum(1, 2, 3)); // 6
        System.out.println(luckSum(1, 2, 13)); // 3
        System.out.println(luckSum(1, 13, 3)); // 1

    }


    public static int luckSum(int a, int b, int c) {

        if (a == 13) {

            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }


    }

}
