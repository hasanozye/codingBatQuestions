package logic2;

public class BlackJack {

    public static void main(String[] args) {

        System.out.println(blackJack(22, 19)); // 19
        System.out.println(blackJack(19, 21)); // 21
        System.out.println(blackJack(21, 19)); // 21
        System.out.println(blackJack(19, 22)); // 19

    }


    public static int blackJack(int a, int b) {

        int aClose = Math.abs(21 - a);
        int bClose = Math.abs(21 - b);

        if (b >= 22 && a >= 22) {
            return 0;

        } else if (a >= 22) {

            return b;
        } else if (b >= 22) {
            return a;
        }
        if (aClose < bClose) {

            return a;
        } else {
            return b;
        }

    }
}