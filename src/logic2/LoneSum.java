package logic2;

public class LoneSum {


    public static void main(String[] args) {

        System.out.println(loneSum(1, 2, 3)); // 6
        System.out.println(loneSum(3, 2, 3)); // 2
        System.out.println(loneSum(3, 3, 3)); // 0
    }


    public static int loneSum(int a, int b, int c) {

        // Check if all numbers are the same
        if (a == b && b == c) {
            return 0;
        }

        // Check if two numbers are the same
        if (a == b) {
            return c;
        }
        if (a == c) {
            return b;
        }
        if (b == c) {
            return a;
        }

        // If no numbers are the same, return their sum
        return a + b + c;



        /*boolean ignoreA = false;
        boolean ignoreB = false;

        if (a >= b) {

            ignoreA = true;

        } else if (b >= c) {

            ignoreB = true;
        }

        if (!ignoreA && !ignoreB) {

            return a + b + c;
        } else if (ignoreA) {

            return b+c;

        } else {



        }
*/
    }
}
