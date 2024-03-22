package logic2;

public class RoundSum {

    public static void main(String[] args) {

        System.out.println(roundSum(16, 17, 18)); // → 60
        System.out.println(roundSum(12, 13, 14)); // → 30
        System.out.println(roundSum(6, 4, 4)); // → 10

    }


    public static int roundSum(int a, int b, int c) {

        return round10(a) + round10(b) + round10(c);

    }


    public static int round10(int num) {

        int remainder = num % 10;
        if (remainder >= 5) {
            return num + (10 - remainder);
        } else {
            return num - remainder;
        }

        /*int modded10 = num % 10;

        if (modded10 >= 5) {

            for (int i = num; i < Integer.MAX_VALUE; i++) {

                if (i % 10 == 0) {
                    modded10 = i;
                    break;

                }

            }

        }
        if (modded10 < 5) {

            for (int i = num; 0 <= i; i--) {

                if (i % 10 == 0) {
                    modded10 = i;
                    break;
                }

            }

        }
        return modded10;

    }*/
    }
}
