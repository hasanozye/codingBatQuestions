package array2;

public class More14 {

    public static void main(String[] args) {
        System.out.println(more14(new int[]{1, 4, 1}));// → true
        System.out.println(more14(new int[]{1, 4, 1, 4}));// → true
        System.out.println(more14(new int[]{1, 1}));// → true
//        more14([1, 4, 1, 4]) →false
//        more14([1, 1]) →true
    }


    public static boolean more14(int[] nums) {

        int no1 = 0;
        int no4 = 0;
        boolean isGrtr = true;

        for (int n : nums) {

            if (n == 1) {

                no1++;

            } else if (n == 4) {

                no4++;

            }

        }

        return no1 > no4 ? isGrtr : !isGrtr;

    }

}
