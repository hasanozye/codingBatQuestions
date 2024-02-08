package array2;

public class Has12 {

    public static void main(String[] args) {

        System.out.println(has12(new int[]{2, 1, 4, 1, 6})); // false
        System.out.println(has12(new int[]{1, 3, 2})); // true
        System.out.println(has12(new int[]{3, 1, 2})); // true
        System.out.println(has12(new int[]{3, 1, 4, 5, 2})); // true


    }


    public static boolean has12(int[] nums) {

        boolean is1 = false;
        boolean is2 = false;

        for (int n : nums) {

            if (n == 1) {

                is1 = true;
            }

            if (is1 && n == 2) {

                is2 = true;
            }

            if (is1 && is2) {

                return true;
            }


        }
        return false;
    }
}
